package space.axolab.axogram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.DocumentsContract;
import android.provider.Settings;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.graphics.ColorUtils;
import androidx.core.content.FileProvider;

import java.io.File;
import java.util.Random;

import space.axolab.axogram.AccountInstance;
import space.axolab.axogram.ApplicationLoader;
import space.axolab.axogram.AndroidUtilities;
import space.axolab.axogram.MediaController;
import space.axolab.axogram.MessagesController;
import space.axolab.axogram.R;
import space.axolab.axogram.SendMessagesHelper;
import space.axolab.axogram.SpyStorage;
import space.axolab.axogram.ui.ActionBar.ActionBar;
import space.axolab.axogram.ui.ActionBar.AlertDialog;
import space.axolab.axogram.ui.ActionBar.BaseFragment;
import space.axolab.axogram.ui.ActionBar.Theme;
import space.axolab.axogram.ui.Cells.NotificationsCheckCell;
import space.axolab.axogram.ui.Components.CubicBezierInterpolator;
import space.axolab.axogram.ui.Components.SeekBarView;

public class AxoGramSectionFragment extends BaseFragment {
    public static final int TYPE_GHOST = 0;
    public static final int TYPE_SPY = 1;
    public static final int TYPE_CUSTOMIZATION = 2;
    public static final int TYPE_FEATURES = 3;

    private static final String PREF_COLLAPSE_SETTINGS_TABS = "axogram_collapse_settings_tabs";
    private static final String PREF_DIALOG_CORNER_RADIUS = "axogram_dialog_corner_radius_dp";
    private static final String PREF_GHOST_ONLINE = "axogram_ghost_hide_online";
    private static final String PREF_GHOST_READ = "axogram_ghost_hide_read";
    private static final String PREF_GHOST_TYPING = "axogram_ghost_hide_typing";
    private static final String PREF_SPY_SAVE_DELETED = "axogram_spy_save_deleted";
    private static final String PREF_SPY_SAVE_EDITS = "axogram_spy_save_edits";
    private static final String PREF_SPY_SAVE_BOTS = "axogram_spy_save_bots";
    private static final String PREF_SPY_SAVE_READ_DATE = "axogram_spy_save_read_date";
    private static final String PREF_SPY_SAVE_LAST_ONLINE = "axogram_spy_save_last_online";
    private static final String PREF_SPY_SAVE_ATTACHMENTS = "axogram_spy_save_attachments";
    private static final String PREF_SPY_ATTACHMENTS_FOLDER_URI = "axogram_spy_attachments_folder_uri";
    private static final String PREF_SPY_ATTACHMENTS_FOLDER_LABEL = "axogram_spy_attachments_folder_label";
    private static final String PREF_SPY_FOLDER_SIZE_INDEX = "axogram_spy_folder_size_index";
    private static final String PREF_SPY_ATTACH_PRIVATE_DIALOGS = "axogram_spy_attach_private_dialogs";
    private static final String PREF_SPY_ATTACH_PUBLIC_CHANNELS = "axogram_spy_attach_public_channels";
    private static final String PREF_SPY_ATTACH_PRIVATE_CHANNELS = "axogram_spy_attach_private_channels";
    private static final String PREF_SPY_ATTACH_PUBLIC_CHATS = "axogram_spy_attach_public_chats";
    private static final String PREF_SPY_ATTACH_PRIVATE_CHATS = "axogram_spy_attach_private_chats";
    private static final String PREF_SPY_ATTACH_MOBILE_LIMIT_INDEX = "axogram_spy_attach_mobile_limit_index";
    private static final String PREF_SPY_ATTACH_WIFI_LIMIT_INDEX = "axogram_spy_attach_wifi_limit_index";
    private static final int DEFAULT_DIALOG_CORNER_RADIUS_DP = 36;
    private static final int MIN_DIALOG_CORNER_RADIUS_DP = 12;
    private static final int MAX_DIALOG_CORNER_RADIUS_DP = 36;
    private static final int REQUEST_SPY_ATTACHMENTS_FOLDER = 4101;
    private static final int REQUEST_SPY_EXPORT_DATABASE = 4102;
    private static final int REQUEST_SPY_IMPORT_DATABASE = 4103;
    private static final String[] SPY_FOLDER_SIZE_LABELS = new String[] {"300 МБ", "1 ГБ", "2 ГБ", "5 ГБ", "16 ГБ", "∞"};
    private static final String[] SPY_ATTACHMENT_LIMIT_LABELS = new String[] {"до 8,0 МБ", "до 16,0 МБ", "до 32,0 МБ", "до 64,0 МБ", "до 128 МБ", "∞"};

    private final int type;
    private TextView spyFolderValueView;
    private View spyTopOverlayView;
    private NotificationsCheckCell spyDeletedMessagesCell;
    private NotificationsCheckCell spyEditsCell;
    private boolean waitingForSpyBackgroundPermission;

    public AxoGramSectionFragment(int type) {
        this.type = type;
    }

    @Override
    public View createView(Context context) {
        final boolean isDarkTheme = resourceProvider != null ? resourceProvider.isDark() : Theme.isCurrentThemeDark();
        actionBar.setAddToContainer(false);
        actionBar.setTitle("");
        actionBar.setAllowOverlayTitle(true);
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });

        FrameLayout contentView = new FrameLayout(context) {
            private static final int BLOB_COUNT = 4;
            private static final int NOISE_POINT_COUNT = 140;
            private final Paint backgroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            private final Paint noisePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            private final Paint[] blobPaints = new Paint[BLOB_COUNT];
            private final float[] fromX = new float[BLOB_COUNT];
            private final float[] fromY = new float[BLOB_COUNT];
            private final float[] toX = new float[BLOB_COUNT];
            private final float[] toY = new float[BLOB_COUNT];
            private final float[] radius = new float[BLOB_COUNT];
            private final float[] intensity = new float[BLOB_COUNT];
            private final long[] durations = new long[BLOB_COUNT];
            private final long[] delays = new long[BLOB_COUNT];
            private final int[] blobColors = new int[BLOB_COUNT];
            private final float[] noiseX = new float[NOISE_POINT_COUNT];
            private final float[] noiseY = new float[NOISE_POINT_COUNT];
            private final float[] noiseR = new float[NOISE_POINT_COUNT];
            private final int[] noiseA = new int[NOISE_POINT_COUNT];
            private final Random random = new Random(0xA80F1L + type);
            private long animationStart;

            {
                setWillNotDraw(false);
                for (int i = 0; i < BLOB_COUNT; i++) {
                    blobPaints[i] = new Paint(Paint.ANTI_ALIAS_FLAG);
                }
            }

            @Override
            protected void onSizeChanged(int w, int h, int oldw, int oldh) {
                super.onSizeChanged(w, h, oldw, oldh);
                final int baseColor = Theme.getColor(Theme.key_windowBackgroundGray);
                final int accentColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText);
                final int accentColorSoft = ColorUtils.blendARGB(accentColor, baseColor, 0.74f);
                final int accentColorWarm = ColorUtils.blendARGB(accentColor, Theme.getColor(Theme.key_windowBackgroundWhite), 0.58f);
                backgroundPaint.setColor(ColorUtils.blendARGB(baseColor, accentColorSoft, 0.035f));
                noisePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 8));
                for (int i = 0; i < NOISE_POINT_COUNT; i++) {
                    noiseX[i] = randomRange(0, w);
                    noiseY[i] = randomRange(0, h);
                    noiseR[i] = randomRange(0.55f, 1.35f);
                    noiseA[i] = 2 + random.nextInt(7);
                }
                blobColors[0] = accentColor;
                blobColors[1] = accentColorSoft;
                blobColors[2] = accentColorWarm;
                blobColors[3] = ColorUtils.blendARGB(accentColor, accentColorWarm, 0.5f);
                animationStart = SystemClock.elapsedRealtime();
                for (int i = 0; i < BLOB_COUNT; i++) {
                    reconfigureBlob(i, w, h, i * 220L, true);
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                canvas.drawRect(0, 0, getWidth(), getHeight(), backgroundPaint);
                for (int i = 0; i < NOISE_POINT_COUNT; i++) {
                    noisePaint.setAlpha(noiseA[i]);
                    canvas.drawCircle(noiseX[i], noiseY[i], noiseR[i], noisePaint);
                }
                long now = SystemClock.elapsedRealtime();
                boolean invalidate = false;
                for (int i = 0; i < BLOB_COUNT; i++) {
                    float t = (now - animationStart - delays[i]) / (float) durations[i];
                    if (t >= 1f) {
                        reconfigureBlob(i, getWidth(), getHeight(), 0L, false);
                        t = 0f;
                    }
                    if (t < 0f) {
                        t = 0f;
                    }
                    float eased = 1f - (1f - t) * (1f - t) * (1f - t);
                    float x = AndroidUtilities.lerp(fromX[i], toX[i], eased);
                    float y = AndroidUtilities.lerp(fromY[i], toY[i], eased);
                    float fade = t <= 0.18f ? t / 0.18f : (t >= 0.74f ? 1f - (t - 0.74f) / 0.26f : 1f);
                    int innerAlpha = (int) (intensity[i] * fade);
                    int outerAlpha = (int) (innerAlpha * 0.38f);
                    blobPaints[i].setShader(new RadialGradient(
                            x, y, radius[i],
                            new int[] {
                                    ColorUtils.setAlphaComponent(blobColors[i], innerAlpha),
                                    ColorUtils.setAlphaComponent(blobColors[i], outerAlpha),
                                    0x00000000
                            },
                            new float[] {0f, 0.42f, 1f},
                            Shader.TileMode.CLAMP
                    ));
                    canvas.drawCircle(x, y, radius[i], blobPaints[i]);
                    invalidate = true;
                }
                if (invalidate) {
                    invalidate();
                }
            }

            private void reconfigureBlob(int index, int width, int height, long extraDelay, boolean initial) {
                float safeWidth = Math.max(width, 1);
                float safeHeight = Math.max(height, 1);
                fromX[index] = randomRange(safeWidth * 0.12f, safeWidth * 0.88f);
                fromY[index] = randomRange(safeHeight * 0.14f, safeHeight * 0.92f);
                toX[index] = clamp(fromX[index] + randomRange(-safeWidth * 0.18f, safeWidth * 0.18f), safeWidth * 0.08f, safeWidth * 0.92f);
                toY[index] = clamp(fromY[index] + randomRange(-safeHeight * 0.16f, safeHeight * 0.16f), safeHeight * 0.10f, safeHeight * 0.94f);
                radius[index] = randomRange(AndroidUtilities.dp(92), AndroidUtilities.dp(164));
                intensity[index] = randomRange(14f, 30f);
                durations[index] = 3400L + random.nextInt(2600);
                delays[index] = initial ? extraDelay : 120L + random.nextInt(600);
            }

            private float randomRange(float min, float max) {
                return min + random.nextFloat() * (max - min);
            }

            private float clamp(float value, float min, float max) {
                return Math.max(min, Math.min(max, value));
            }
        };

        ImageView backButtonView = new ImageView(context);
        backButtonView.setImageResource(R.drawable.ic_ab_back);
        backButtonView.setColorFilter(Theme.getColor(Theme.key_actionBarDefaultTitle));
        backButtonView.setScaleType(ImageView.ScaleType.CENTER);
        backButtonView.setBackground(Theme.createSimpleSelectorCircleDrawable(
                AndroidUtilities.dp(40), 0,
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_actionBarDefaultTitle), 24)
        ));
        backButtonView.setOnClickListener(v -> finishFragment());
        FrameLayout.LayoutParams backButtonLayoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(40), AndroidUtilities.dp(40));
        backButtonLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        backButtonLayoutParams.leftMargin = AndroidUtilities.dp(12);
        backButtonLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(10);
        contentView.addView(backButtonView, backButtonLayoutParams);

        TextView titleView = new TextView(context);
        titleView.setText(getSectionTitle());
        titleView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle));
        titleView.setTextSize(28);
        titleView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams titleLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        titleLayoutParams.gravity = Gravity.TOP | Gravity.CENTER_HORIZONTAL;
        titleLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(86);
        contentView.addView(titleView, titleLayoutParams);

        if (type == TYPE_CUSTOMIZATION) {
            addCustomizationContent(context, contentView, isDarkTheme);
        } else if (type == TYPE_GHOST) {
            addGhostContent(context, contentView, isDarkTheme);
        } else if (type == TYPE_SPY) {
            addSpyContent(context, contentView, titleView, isDarkTheme);
        } else {
            addPlaceholderContent(context, contentView);
        }

        if (spyTopOverlayView != null) {
            spyTopOverlayView.bringToFront();
        }
        titleView.bringToFront();
        backButtonView.bringToFront();

        fragmentView = contentView;
        return fragmentView;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (waitingForSpyBackgroundPermission) {
            waitingForSpyBackgroundPermission = false;
            boolean granted = isSpyBackgroundPermissionGranted();
            MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_SPY_SAVE_DELETED, granted).apply();
            if (spyDeletedMessagesCell != null) {
                spyDeletedMessagesCell.setChecked(granted);
            }
            updateSpyEditsToggleState();
            if (getParentActivity() != null && !granted) {
                Toast.makeText(getParentActivity(), "Фоновая работа не разрешена, сохранение удалённых сообщений отключено", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void addCustomizationContent(Context context, FrameLayout contentView, boolean isDarkTheme) {
        FrameLayout optionCard = new FrameLayout(context);
        GradientDrawable optionCardBackground = new GradientDrawable();
        optionCardBackground.setShape(GradientDrawable.RECTANGLE);
        optionCardBackground.setCornerRadius(AndroidUtilities.dp(20));
        optionCardBackground.setColor(ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlueText),
                isDarkTheme ? 0.10f : 0.04f
        ));
        optionCardBackground.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 42 : 24));
        optionCard.setBackground(optionCardBackground);
        FrameLayout.LayoutParams optionCardParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        optionCardParams.leftMargin = AndroidUtilities.dp(16);
        optionCardParams.rightMargin = AndroidUtilities.dp(16);
        optionCardParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(150);
        optionCardParams.gravity = Gravity.TOP;
        contentView.addView(optionCard, optionCardParams);

        NotificationsCheckCell optionCell = new NotificationsCheckCell(context, 21, 76, false, resourceProvider);
        optionCell.setDrawLine(false);
        optionCell.setBackgroundColor(0);
        final int defaultCardColor = Theme.getColor(Theme.key_windowBackgroundWhite);
        final int accentColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText);
        final int mutedTextColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4);
        optionCell.setTextAndValueAndCheck(
                "Сворачивать нижнюю панель в настройках",
                "Если выключить, нижняя панель в настройках останется видимой как раньше.",
                MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true),
                0,
                false,
                false
        );
        optionCard.addView(optionCell, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));

        TextView infoView = new TextView(context);
        infoView.setText("Включено по умолчанию.");
        infoView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        infoView.setTextSize(12);
        infoView.setGravity(Gravity.CENTER);
        infoView.setPadding(AndroidUtilities.dp(12), AndroidUtilities.dp(6), AndroidUtilities.dp(12), AndroidUtilities.dp(6));
        GradientDrawable infoBackground = new GradientDrawable();
        infoBackground.setShape(GradientDrawable.RECTANGLE);
        infoBackground.setCornerRadius(AndroidUtilities.dp(13));
        infoBackground.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 26 : 18));
        infoView.setBackground(infoBackground);
        FrameLayout.LayoutParams infoLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        infoLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        infoLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(232);
        infoLayoutParams.leftMargin = AndroidUtilities.dp(20);
        contentView.addView(infoView, infoLayoutParams);

        final ValueAnimator[] appearanceAnimator = new ValueAnimator[1];
        final float[] currentProgress = new float[] {
                MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true) ? 1f : 0f
        };

        Runnable updateOptionAppearance = () -> {
            boolean enabled = MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true);
            float targetProgress = enabled ? 1f : 0f;
            if (appearanceAnimator[0] != null) {
                appearanceAnimator[0].cancel();
            }
            ValueAnimator animator = ValueAnimator.ofFloat(currentProgress[0], targetProgress);
            appearanceAnimator[0] = animator;
            animator.setDuration(260);
            animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animator.addUpdateListener(valueAnimator -> {
                float progress = (float) valueAnimator.getAnimatedValue();
                currentProgress[0] = progress;
                int enabledCardColor = ColorUtils.blendARGB(defaultCardColor, accentColor, isDarkTheme ? 0.10f : 0.04f);
                int disabledCardColor = ColorUtils.blendARGB(defaultCardColor, Theme.getColor(Theme.key_windowBackgroundGray), isDarkTheme ? 0.22f : 0.10f);
                optionCardBackground.setColor(ColorUtils.blendARGB(disabledCardColor, enabledCardColor, progress));
                optionCardBackground.setStroke(
                        AndroidUtilities.dp(1),
                        ColorUtils.blendARGB(
                                ColorUtils.setAlphaComponent(defaultCardColor, isDarkTheme ? 16 : 10),
                                ColorUtils.setAlphaComponent(accentColor, isDarkTheme ? 42 : 24),
                                progress
                        )
                );

                if (progress > 0.5f) {
                    optionCell.getCheckBox().setColors(
                            Theme.key_switchTrackBlue,
                            Theme.key_switchTrackBlueChecked,
                            Theme.key_switchTrackBlueThumb,
                            Theme.key_switchTrackBlueThumbChecked
                    );
                } else {
                    optionCell.getCheckBox().setColors(
                            Theme.key_switchTrack,
                            Theme.key_switchTrack,
                            Theme.key_windowBackgroundWhite,
                            Theme.key_windowBackgroundWhite
                    );
                }

                infoView.setTextColor(ColorUtils.blendARGB(mutedTextColor, accentColor, progress));
                infoBackground.setColor(ColorUtils.blendARGB(
                        ColorUtils.setAlphaComponent(defaultCardColor, isDarkTheme ? 18 : 12),
                        ColorUtils.setAlphaComponent(accentColor, isDarkTheme ? 26 : 18),
                        progress
                ));
                optionCell.setAlpha(AndroidUtilities.lerp(0.92f, 1.0f, progress));
                infoView.setAlpha(AndroidUtilities.lerp(0.72f, 1.0f, progress));
            });
            animator.start();
        };
        optionCell.setOnClickListener(v -> {
            boolean enabled = !MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true);
            MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_COLLAPSE_SETTINGS_TABS, enabled).apply();
            optionCell.setChecked(enabled);
            updateOptionAppearance.run();
        });
        updateOptionAppearance.run();
        addDialogRadiusContent(context, contentView, isDarkTheme);
    }

    private void addDialogRadiusContent(Context context, FrameLayout contentView, boolean isDarkTheme) {
        TextView sectionHeaderView = new TextView(context);
        sectionHeaderView.setText("Скругление обращений");
        sectionHeaderView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        sectionHeaderView.setTextSize(14);
        sectionHeaderView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams headerLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        headerLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        headerLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(286);
        headerLayoutParams.leftMargin = AndroidUtilities.dp(28);
        contentView.addView(sectionHeaderView, headerLayoutParams);

        FrameLayout previewCard = new FrameLayout(context);
        GradientDrawable previewCardBackground = new GradientDrawable();
        previewCardBackground.setShape(GradientDrawable.RECTANGLE);
        previewCardBackground.setCornerRadius(AndroidUtilities.dp(20));
        previewCardBackground.setColor(ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlueText),
                isDarkTheme ? 0.06f : 0.03f
        ));
        previewCardBackground.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 26 : 16));
        previewCard.setBackground(previewCardBackground);
        FrameLayout.LayoutParams previewCardParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(286));
        previewCardParams.gravity = Gravity.TOP;
        previewCardParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(314);
        previewCardParams.leftMargin = AndroidUtilities.dp(16);
        previewCardParams.rightMargin = AndroidUtilities.dp(16);
        contentView.addView(previewCard, previewCardParams);

        TextView previewLabel = new TextView(context);
        previewLabel.setText("Предпросмотр");
        previewLabel.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        previewLabel.setTextSize(13);
        FrameLayout.LayoutParams previewLabelParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        previewLabelParams.gravity = Gravity.TOP | Gravity.LEFT;
        previewLabelParams.topMargin = AndroidUtilities.dp(16);
        previewLabelParams.leftMargin = AndroidUtilities.dp(18);
        previewCard.addView(previewLabel, previewLabelParams);

        FrameLayout previewStage = new FrameLayout(context);
        GradientDrawable previewStageBackground = new GradientDrawable();
        previewStageBackground.setShape(GradientDrawable.RECTANGLE);
        previewStageBackground.setCornerRadius(AndroidUtilities.dp(18));
        previewStageBackground.setColor(isDarkTheme
                ? ColorUtils.blendARGB(
                        Theme.getColor(Theme.key_windowBackgroundWhite),
                        Theme.getColor(Theme.key_dialogBackground),
                        0.38f
                )
                : ColorUtils.blendARGB(
                        Theme.getColor(Theme.key_windowBackgroundWhiteBlackText),
                        Theme.getColor(Theme.key_windowBackgroundWhiteBlueText),
                        0.09f
                ));
        previewStage.setBackground(previewStageBackground);
        FrameLayout.LayoutParams previewStageParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(154));
        previewStageParams.gravity = Gravity.TOP;
        previewStageParams.topMargin = AndroidUtilities.dp(38);
        previewStageParams.leftMargin = AndroidUtilities.dp(12);
        previewStageParams.rightMargin = AndroidUtilities.dp(12);
        previewCard.addView(previewStage, previewStageParams);

        FrameLayout dialogPreview = new FrameLayout(context);
        GradientDrawable dialogPreviewBackground = new GradientDrawable();
        dialogPreviewBackground.setShape(GradientDrawable.RECTANGLE);
        dialogPreviewBackground.setColor(isDarkTheme
                ? ColorUtils.blendARGB(
                        Theme.getColor(Theme.key_dialogBackground),
                        Theme.getColor(Theme.key_windowBackgroundWhite),
                        0.03f
                )
                : ColorUtils.blendARGB(
                        Theme.getColor(Theme.key_dialogBackground),
                        Theme.getColor(Theme.key_windowBackgroundWhite),
                        0.08f
                ));
        dialogPreviewBackground.setStroke(
                AndroidUtilities.dp(1),
                ColorUtils.setAlphaComponent(
                        isDarkTheme ? Theme.getColor(Theme.key_windowBackgroundWhiteBlueText) : Theme.getColor(Theme.key_windowBackgroundWhite),
                        isDarkTheme ? 22 : 24
                )
        );
        FrameLayout.LayoutParams dialogPreviewParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(126));
        dialogPreviewParams.gravity = Gravity.TOP;
        dialogPreviewParams.topMargin = AndroidUtilities.dp(52);
        dialogPreviewParams.leftMargin = AndroidUtilities.dp(28);
        dialogPreviewParams.rightMargin = AndroidUtilities.dp(28);
        dialogPreview.setBackground(dialogPreviewBackground);
        previewCard.addView(dialogPreview, dialogPreviewParams);

        TextView titleView = new TextView(context);
        titleView.setText("Попробуйте позже");
        titleView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        titleView.setTextSize(18);
        titleView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams titleParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        titleParams.gravity = Gravity.TOP | Gravity.CENTER_HORIZONTAL;
        titleParams.topMargin = AndroidUtilities.dp(16);
        dialogPreview.addView(titleView, titleParams);

        TextView messageView = new TextView(context);
        messageView.setText("Так будут выглядеть системные обращения и предупреждения.");
        messageView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3));
        messageView.setTextSize(14);
        messageView.setGravity(Gravity.CENTER);
        FrameLayout.LayoutParams messageParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        messageParams.gravity = Gravity.TOP;
        messageParams.topMargin = AndroidUtilities.dp(46);
        messageParams.leftMargin = AndroidUtilities.dp(18);
        messageParams.rightMargin = AndroidUtilities.dp(18);
        dialogPreview.addView(messageView, messageParams);

        TextView okView = new TextView(context);
        okView.setText("OK");
        okView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        okView.setTextSize(14);
        okView.setTypeface(AndroidUtilities.bold());
        okView.setGravity(Gravity.CENTER);
        okView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(
                AndroidUtilities.dp(16),
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 18 : 12),
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 30 : 20)
        ));
        FrameLayout.LayoutParams okParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(84), AndroidUtilities.dp(30));
        okParams.gravity = Gravity.BOTTOM | Gravity.RIGHT;
        okParams.rightMargin = AndroidUtilities.dp(14);
        okParams.bottomMargin = AndroidUtilities.dp(12);
        dialogPreview.addView(okView, okParams);

        LinearLayout controlsRow = new LinearLayout(context);
        controlsRow.setOrientation(LinearLayout.HORIZONTAL);
        controlsRow.setGravity(Gravity.CENTER_VERTICAL);
        FrameLayout.LayoutParams controlsRowParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        controlsRowParams.gravity = Gravity.TOP;
        controlsRowParams.topMargin = AndroidUtilities.dp(204);
        controlsRowParams.leftMargin = AndroidUtilities.dp(18);
        controlsRowParams.rightMargin = AndroidUtilities.dp(18);
        previewCard.addView(controlsRow, controlsRowParams);

        TextView resetView = new TextView(context);
        resetView.setText("Сбросить");
        resetView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        resetView.setTextSize(14);
        resetView.setTypeface(AndroidUtilities.bold());
        resetView.setGravity(Gravity.CENTER);
        resetView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(
                AndroidUtilities.dp(14),
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 16 : 12),
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 28 : 20)
        ));
        LinearLayout.LayoutParams resetParams = new LinearLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, AndroidUtilities.dp(30));
        controlsRow.addView(resetView, resetParams);

        View controlsSpacer = new View(context);
        LinearLayout.LayoutParams controlsSpacerParams = new LinearLayout.LayoutParams(0, 1, 1f);
        controlsRow.addView(controlsSpacer, controlsSpacerParams);

        TextView valueView = new TextView(context);
        valueView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        valueView.setTextSize(13);
        valueView.setTypeface(AndroidUtilities.bold());
        controlsRow.addView(valueView);

        SeekBarView seekBarView = new SeekBarView(context, resourceProvider);
        seekBarView.setReportChanges(true);
        seekBarView.setColors(
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 44 : 30),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlueText)
        );
        FrameLayout.LayoutParams seekBarParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(40));
        seekBarParams.gravity = Gravity.BOTTOM;
        seekBarParams.leftMargin = AndroidUtilities.dp(16);
        seekBarParams.rightMargin = AndroidUtilities.dp(16);
        seekBarParams.bottomMargin = AndroidUtilities.dp(18);
        previewCard.addView(seekBarView, seekBarParams);

        Runnable updatePreview = () -> {
            int radiusDp = MessagesController.getGlobalMainSettings().getInt(PREF_DIALOG_CORNER_RADIUS, DEFAULT_DIALOG_CORNER_RADIUS_DP);
            radiusDp = Math.max(MIN_DIALOG_CORNER_RADIUS_DP, Math.min(MAX_DIALOG_CORNER_RADIUS_DP, radiusDp));
            dialogPreviewBackground.setCornerRadius(AndroidUtilities.dp(radiusDp));
            seekBarView.setProgress((radiusDp - MIN_DIALOG_CORNER_RADIUS_DP) / (float) (MAX_DIALOG_CORNER_RADIUS_DP - MIN_DIALOG_CORNER_RADIUS_DP));
            valueView.setText(radiusDp == DEFAULT_DIALOG_CORNER_RADIUS_DP ? "По умолчанию" : radiusDp + " dp");
            resetView.setAlpha(radiusDp == DEFAULT_DIALOG_CORNER_RADIUS_DP ? 0.65f : 1f);
        };

        seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public void onSeekBarDrag(boolean stop, float progress) {
                int radiusDp = MIN_DIALOG_CORNER_RADIUS_DP + Math.round((MAX_DIALOG_CORNER_RADIUS_DP - MIN_DIALOG_CORNER_RADIUS_DP) * progress);
                MessagesController.getGlobalMainSettings().edit().putInt(PREF_DIALOG_CORNER_RADIUS, radiusDp).apply();
                updatePreview.run();
            }
        });

        resetView.setOnClickListener(v -> {
            MessagesController.getGlobalMainSettings().edit().putInt(PREF_DIALOG_CORNER_RADIUS, DEFAULT_DIALOG_CORNER_RADIUS_DP).apply();
            updatePreview.run();
        });

        updatePreview.run();
    }

    private void addGhostContent(Context context, FrameLayout contentView, boolean isDarkTheme) {
        TextView sectionHeaderView = new TextView(context);
        sectionHeaderView.setText("Функции");
        sectionHeaderView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        sectionHeaderView.setTextSize(14);
        sectionHeaderView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams headerLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        headerLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        headerLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(154);
        headerLayoutParams.leftMargin = AndroidUtilities.dp(28);
        contentView.addView(sectionHeaderView, headerLayoutParams);

        LinearLayout ghostLayout = new LinearLayout(context);
        ghostLayout.setOrientation(LinearLayout.VERTICAL);
        FrameLayout.LayoutParams ghostLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        ghostLayoutParams.gravity = Gravity.TOP;
        ghostLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(180);
        ghostLayoutParams.leftMargin = AndroidUtilities.dp(16);
        ghostLayoutParams.rightMargin = AndroidUtilities.dp(16);
        contentView.addView(ghostLayout, ghostLayoutParams);

        final boolean[] currentStates = new boolean[] {
                MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_ONLINE, false),
                MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_READ, false),
                MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_TYPING, false)
        };

        NotificationsCheckCell masterCell = createGhostToggleCell(
                context,
                "Включить",
                "Включает сразу все функции режима призрака. Если всё уже активно, выключает всё одним нажатием."
        );
        NotificationsCheckCell onlineCell = createGhostToggleCell(
                context,
                "Скрытие статуса в сети",
                "Аккуратно скрывает статус сети. Даже если ты в Telegram, у других будет показано, что ты не в сети."
        );
        NotificationsCheckCell readCell = createGhostToggleCell(
                context,
                "Скрытие прочтения",
                "Если ты откроешь чат и прочитаешь сообщение, у собеседника это не будет показано."
        );
        NotificationsCheckCell typingCell = createGhostToggleCell(
                context,
                "Скрытие статуса печати",
                "Не будет показываться, что ты печатаешь, записываешь голосовое, видео или отправляешь файл."
        );

        NotificationsCheckCell[] managedCells = new NotificationsCheckCell[] {onlineCell, readCell, typingCell};
        String[] managedPrefs = new String[] {PREF_GHOST_ONLINE, PREF_GHOST_READ, PREF_GHOST_TYPING};

        Runnable updateGhostCells = () -> {
            currentStates[0] = MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_ONLINE, false);
            currentStates[1] = MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_READ, false);
            currentStates[2] = MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_TYPING, false);

            onlineCell.setChecked(currentStates[0]);
            readCell.setChecked(currentStates[1]);
            typingCell.setChecked(currentStates[2]);

            boolean allEnabled = currentStates[0] && currentStates[1] && currentStates[2];
            masterCell.setChecked(allEnabled);
        };

        masterCell.setOnClickListener(v -> {
            boolean allEnabled = MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_ONLINE, false)
                    && MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_READ, false)
                    && MessagesController.getGlobalMainSettings().getBoolean(PREF_GHOST_TYPING, false);
            boolean target = !allEnabled;
            MessagesController.getGlobalMainSettings().edit()
                    .putBoolean(PREF_GHOST_ONLINE, target)
                    .putBoolean(PREF_GHOST_READ, target)
                    .putBoolean(PREF_GHOST_TYPING, target)
                    .apply();
            updateGhostCells.run();
        });

        for (int i = 0; i < managedCells.length; i++) {
            final int index = i;
            managedCells[i].setOnClickListener(v -> {
                boolean enabled = !MessagesController.getGlobalMainSettings().getBoolean(managedPrefs[index], false);
                MessagesController.getGlobalMainSettings().edit().putBoolean(managedPrefs[index], enabled).apply();
                updateGhostCells.run();
            });
        }

        ghostLayout.addView(createGhostCard(context, masterCell, isDarkTheme));
        ghostLayout.addView(createGhostCard(context, onlineCell, isDarkTheme));
        ghostLayout.addView(createGhostCard(context, readCell, isDarkTheme));
        ghostLayout.addView(createGhostCard(context, typingCell, isDarkTheme));
        updateGhostCells.run();
    }

    private NotificationsCheckCell createGhostToggleCell(Context context, String title, String subtitle) {
        NotificationsCheckCell cell = new NotificationsCheckCell(context, 21, 92, false, resourceProvider);
        cell.setDrawLine(false);
        cell.setBackgroundColor(0);
        cell.setTextAndValueAndCheck(title, subtitle, false, 0, false, false);
        return cell;
    }

    private View createGhostCard(Context context, View cell, boolean isDarkTheme) {
        FrameLayout optionCard = new FrameLayout(context);
        GradientDrawable optionCardBackground = new GradientDrawable();
        optionCardBackground.setShape(GradientDrawable.RECTANGLE);
        optionCardBackground.setCornerRadius(AndroidUtilities.dp(20));
        optionCardBackground.setColor(ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlueText),
                isDarkTheme ? 0.10f : 0.04f
        ));
        optionCardBackground.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 38 : 22));
        optionCard.setBackground(optionCardBackground);
        LinearLayout.LayoutParams optionCardParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        optionCardParams.bottomMargin = AndroidUtilities.dp(10);
        optionCard.setLayoutParams(optionCardParams);
        optionCard.addView(cell, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
        return optionCard;
    }

    private void addSpyContent(Context context, FrameLayout contentView, TextView titleView, boolean isDarkTheme) {
        final int titleStartTop = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(86);
        final int titleTargetTop = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(14);
        final float titleTravel = titleTargetTop - titleStartTop;
        final float titleMinScale = 0.84f;

        spyTopOverlayView = new View(context);
        int overlayBaseColor = Theme.getColor(Theme.key_windowBackgroundGray);
        spyTopOverlayView.setBackgroundColor(ColorUtils.setAlphaComponent(overlayBaseColor, isDarkTheme ? 18 : 24));
        FrameLayout.LayoutParams overlayParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                AndroidUtilities.dp(1)
        );
        overlayParams.gravity = Gravity.TOP;
        contentView.addView(spyTopOverlayView, overlayParams);
        spyTopOverlayView.setAlpha(isDarkTheme ? 0.28f : 0.22f);

        ScrollView scrollView = new ScrollView(context) {
            @Override
            protected void onScrollChanged(int l, int t, int oldl, int oldt) {
                super.onScrollChanged(l, t, oldl, oldt);
                float progress = Math.min(1f, t / (float) AndroidUtilities.dp(92));
                titleView.setTranslationY(titleTravel * progress);
                float scale = AndroidUtilities.lerp(1f, titleMinScale, progress);
                titleView.setScaleX(scale);
                titleView.setScaleY(scale);
                titleView.setAlpha(AndroidUtilities.lerp(1f, 0.96f, progress));
            }
        };
        scrollView.setVerticalScrollBarEnabled(false);
        FrameLayout.LayoutParams scrollParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        scrollParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(56);
        contentView.addView(scrollView, scrollParams);

        LinearLayout container = new LinearLayout(context);
        container.setOrientation(LinearLayout.VERTICAL);
        container.setPadding(AndroidUtilities.dp(16), AndroidUtilities.dp(98), AndroidUtilities.dp(16), AndroidUtilities.dp(28));
        scrollView.addView(container, new ScrollView.LayoutParams(ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));

        TextView sectionHeaderView = new TextView(context);
        sectionHeaderView.setText("Режим шпиона");
        sectionHeaderView.setTextColor(getSpyAccentColor());
        sectionHeaderView.setTextSize(14);
        sectionHeaderView.setTypeface(AndroidUtilities.bold());
        LinearLayout.LayoutParams headerParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        headerParams.bottomMargin = AndroidUtilities.dp(14);
        container.addView(sectionHeaderView, headerParams);

        NotificationsCheckCell deletedCell = createSpyToggleCell(context, "Сохранять удалённые сообщения", "Фото, видео, кружки, файлы, одноразовые медиа и всё, что успеет сохраниться локально.");
        NotificationsCheckCell editsCell = createSpyToggleCell(context, "Сохранять историю правок", "Если сообщение отредактируют, локально останется и предыдущая версия.");
        NotificationsCheckCell botsCell = createSpyToggleCell(context, "Сохранять в чатах с ботами", "Отдельный флаг для ботов, потому что у них правки и удаления встречаются заметно чаще.");
        NotificationsCheckCell readDateCell = createSpyToggleCell(context, "Сохранять дату чтения", "Локально сохраняет время чтения, если сервер позже перестанет его показывать.");
        NotificationsCheckCell lastOnlineCell = createSpyToggleCell(context, "Сохранять последний онлайн", "Запоминает последний известный онлайн для людей со скрытым посещением.");
        NotificationsCheckCell attachmentsCell = createSpyToggleCell(context, "Сохранять вложения", "Настроить чаты и лимиты");

        bindSpyDeletedToggle(deletedCell);
        bindSpyEditsToggle(editsCell);
        bindSpyToggle(botsCell, PREF_SPY_SAVE_BOTS, false);
        bindSpyToggle(readDateCell, PREF_SPY_SAVE_READ_DATE, false);
        bindSpyToggle(lastOnlineCell, PREF_SPY_SAVE_LAST_ONLINE, false);
        bindSpyToggle(attachmentsCell, PREF_SPY_SAVE_ATTACHMENTS, false);

        container.addView(createSpyCard(context, deletedCell, isDarkTheme));
        container.addView(createSpyCard(context, editsCell, isDarkTheme));
        container.addView(createSpyCard(context, botsCell, isDarkTheme));
        container.addView(createSpyCard(context, readDateCell, isDarkTheme));
        container.addView(createSpyCard(context, lastOnlineCell, isDarkTheme));
        container.addView(createSpyCard(context, attachmentsCell, isDarkTheme));
        createSpyActionRow(context, container, R.drawable.msg_mini_customize, "Настроить чаты и лимиты", this::showSpyAttachmentsDialog);
        updateSpyEditsToggleState();

        spyFolderValueView = createSpyValueRow(context, container, "Папка вложений", getSpyFolderLabel(), this::openSpyFolderPicker);

        TextView sizeHeaderView = new TextView(context);
        sizeHeaderView.setText("Максимальный размер папки");
        sizeHeaderView.setTextColor(getSpyAccentColor());
        sizeHeaderView.setTextSize(14);
        sizeHeaderView.setTypeface(AndroidUtilities.bold());
        LinearLayout.LayoutParams sizeHeaderParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        sizeHeaderParams.topMargin = AndroidUtilities.dp(16);
        sizeHeaderParams.bottomMargin = AndroidUtilities.dp(10);
        container.addView(sizeHeaderView, sizeHeaderParams);

        FrameLayout sizeCard = new FrameLayout(context);
        GradientDrawable sizeCardBackground = new GradientDrawable();
        sizeCardBackground.setShape(GradientDrawable.RECTANGLE);
        sizeCardBackground.setCornerRadius(AndroidUtilities.dp(20));
        sizeCardBackground.setColor(ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlueText),
                isDarkTheme ? 0.08f : 0.035f
        ));
        sizeCardBackground.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), isDarkTheme ? 28 : 16));
        sizeCard.setBackground(sizeCardBackground);
        LinearLayout.LayoutParams sizeCardParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(158));
        sizeCardParams.bottomMargin = AndroidUtilities.dp(18);
        container.addView(sizeCard, sizeCardParams);

        LinearLayout labelsRow = new LinearLayout(context);
        labelsRow.setOrientation(LinearLayout.HORIZONTAL);
        labelsRow.setGravity(Gravity.CENTER_VERTICAL);
        FrameLayout.LayoutParams labelsParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        labelsParams.leftMargin = AndroidUtilities.dp(18);
        labelsParams.rightMargin = AndroidUtilities.dp(18);
        labelsParams.topMargin = AndroidUtilities.dp(18);
        sizeCard.addView(labelsRow, labelsParams);

        final TextView[] sizeLabelViews = new TextView[SPY_FOLDER_SIZE_LABELS.length];
        for (int i = 0; i < SPY_FOLDER_SIZE_LABELS.length; i++) {
            TextView labelView = new TextView(context);
            labelView.setText(SPY_FOLDER_SIZE_LABELS[i]);
            labelView.setTextSize(12);
            labelView.setGravity(i == 0 ? Gravity.LEFT : i == SPY_FOLDER_SIZE_LABELS.length - 1 ? Gravity.RIGHT : Gravity.CENTER_HORIZONTAL);
            labelView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
            LinearLayout.LayoutParams labelParams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f);
            labelsRow.addView(labelView, labelParams);
            sizeLabelViews[i] = labelView;
        }

        SeekBarView sizeSeekBar = new SeekBarView(context, resourceProvider);
        sizeSeekBar.setReportChanges(true);
        sizeSeekBar.setColors(
                ColorUtils.setAlphaComponent(getSpyAccentColor(), isDarkTheme ? 58 : 34),
                getSpyAccentColor()
        );
        FrameLayout.LayoutParams sizeSeekParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(44));
        sizeSeekParams.leftMargin = AndroidUtilities.dp(14);
        sizeSeekParams.rightMargin = AndroidUtilities.dp(14);
        sizeSeekParams.topMargin = AndroidUtilities.dp(58);
        sizeCard.addView(sizeSeekBar, sizeSeekParams);

        TextView sizeInfoView = new TextView(context);
        sizeInfoView.setText("Если размер папки превышает этот лимит, самые старые вложения будут удалены с устройства.");
        sizeInfoView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        sizeInfoView.setTextSize(13);
        FrameLayout.LayoutParams sizeInfoParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        sizeInfoParams.leftMargin = AndroidUtilities.dp(18);
        sizeInfoParams.rightMargin = AndroidUtilities.dp(18);
        sizeInfoParams.bottomMargin = AndroidUtilities.dp(16);
        sizeInfoParams.gravity = Gravity.BOTTOM;
        sizeCard.addView(sizeInfoView, sizeInfoParams);

        Runnable updateSizeLabels = () -> {
            int selectedIndex = MessagesController.getGlobalMainSettings().getInt(PREF_SPY_FOLDER_SIZE_INDEX, SPY_FOLDER_SIZE_LABELS.length - 1);
            selectedIndex = Math.max(0, Math.min(SPY_FOLDER_SIZE_LABELS.length - 1, selectedIndex));
            sizeSeekBar.setProgress(selectedIndex / (float) (SPY_FOLDER_SIZE_LABELS.length - 1));
            for (int i = 0; i < sizeLabelViews.length; i++) {
                sizeLabelViews[i].setTextColor(i == selectedIndex ? getSpyAccentColor() : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
                sizeLabelViews[i].setTypeface(i == selectedIndex ? AndroidUtilities.bold() : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            }
        };
        sizeSeekBar.setDelegate((stop, progress) -> {
            int index = Math.max(0, Math.min(SPY_FOLDER_SIZE_LABELS.length - 1, Math.round((SPY_FOLDER_SIZE_LABELS.length - 1) * progress)));
            MessagesController.getGlobalMainSettings().edit().putInt(PREF_SPY_FOLDER_SIZE_INDEX, index).apply();
            updateSizeLabels.run();
        });
        updateSizeLabels.run();

        createSpyActionRow(context, container, R.drawable.msg_share, "Экспорт базы данных", () -> showSpyExportDialog());
        createSpyActionRow(context, container, R.drawable.msg_download, "Импорт базы данных", () -> showSpyImportDialog());
        createSpyActionRow(context, container, R.drawable.msg_delete, "Очистить", () -> showSpyClearDialog());
    }

    private NotificationsCheckCell createSpyToggleCell(Context context, String title, String subtitle) {
        NotificationsCheckCell cell = new NotificationsCheckCell(context, 21, subtitle != null ? 92 : 74, false, resourceProvider);
        cell.setDrawLine(false);
        cell.setBackgroundColor(0);
        cell.setTextAndValueAndCheck(title, subtitle, false, 0, false, false);
        cell.getCheckBox().setColors(
                Theme.key_switchTrack,
                Theme.key_switchTrackChecked,
                Theme.key_windowBackgroundWhite,
                Theme.key_windowBackgroundWhite
        );
        return cell;
    }

    private void bindSpyToggle(NotificationsCheckCell cell, String prefKey, boolean defaultValue) {
        boolean enabled = MessagesController.getGlobalMainSettings().getBoolean(prefKey, defaultValue);
        cell.setChecked(enabled);
        cell.setOnClickListener(v -> {
            boolean newValue = !MessagesController.getGlobalMainSettings().getBoolean(prefKey, defaultValue);
            MessagesController.getGlobalMainSettings().edit().putBoolean(prefKey, newValue).apply();
            cell.setChecked(newValue);
        });
    }

    private void bindSpyDeletedToggle(NotificationsCheckCell cell) {
        spyDeletedMessagesCell = cell;
        boolean enabled = MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_DELETED, false);
        cell.setChecked(enabled);
        cell.setOnClickListener(v -> {
            boolean currentValue = MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_DELETED, false);
            if (currentValue) {
                MessagesController.getGlobalMainSettings().edit()
                        .putBoolean(PREF_SPY_SAVE_DELETED, false)
                        .putBoolean(PREF_SPY_SAVE_EDITS, false)
                        .apply();
                cell.setChecked(false);
                updateSpyEditsToggleState();
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), resourceProvider);
            builder.setTitle("Сохранять удалённые сообщения");
            builder.setMessage("Для полного сохранения удалённых сообщений и одноразовых медиа лучше разрешить AxoGram работать в фоне. Если приложение выгружено, часть удалений может не успеть сохраниться.\n\nЭто также может заметно сильнее расходовать заряд батареи.");
            builder.setPositiveButton("Включить", (dialog, which) -> {
                if (isSpyBackgroundPermissionGranted()) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_SPY_SAVE_DELETED, true).apply();
                    cell.setChecked(true);
                    updateSpyEditsToggleState();
                    return;
                }
                waitingForSpyBackgroundPermission = true;
                openSpyBackgroundSettings();
            });
            builder.setNeutralButton("Включить без настройки", (dialog, which) -> {
                MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_SPY_SAVE_DELETED, true).apply();
                cell.setChecked(true);
                updateSpyEditsToggleState();
            });
            builder.setNegativeButton("Отмена", null);
            showDialog(builder.create());
        });
    }

    private void bindSpyEditsToggle(NotificationsCheckCell cell) {
        spyEditsCell = cell;
        boolean enabled = MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_EDITS, false);
        cell.setChecked(enabled);
        cell.setOnClickListener(v -> {
            if (!MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_DELETED, false)) {
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), "Сначала включите сохранение удалённых сообщений", Toast.LENGTH_SHORT).show();
                }
                updateSpyEditsToggleState();
                return;
            }
            boolean newValue = !MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_EDITS, false);
            MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_SPY_SAVE_EDITS, newValue).apply();
            cell.setChecked(newValue);
            updateSpyEditsToggleState();
        });
        updateSpyEditsToggleState();
    }

    private void updateSpyEditsToggleState() {
        if (spyEditsCell == null) {
            return;
        }
        boolean deletedEnabled = MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_DELETED, false);
        boolean editsEnabled = deletedEnabled && MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_EDITS, false);
        if (!deletedEnabled && MessagesController.getGlobalMainSettings().getBoolean(PREF_SPY_SAVE_EDITS, false)) {
            MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_SPY_SAVE_EDITS, false).apply();
        }
        spyEditsCell.setChecked(editsEnabled);
        spyEditsCell.setAlpha(deletedEnabled ? 1.0f : 0.56f);
        spyEditsCell.setEnabled(deletedEnabled);
    }

    private void openSpyBackgroundSettings() {
        Activity activity = getParentActivity();
        if (activity == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                PowerManager powerManager = (PowerManager) activity.getSystemService(Context.POWER_SERVICE);
                String packageName = activity.getPackageName();
                if (powerManager != null && !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    Intent intent = new Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
                    intent.setData(Uri.parse("package:" + packageName));
                    activity.startActivity(intent);
                    return;
                }
            }
        } catch (Throwable ignore) {
        }
        try {
            Intent intent = new Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS);
            activity.startActivity(intent);
            return;
        } catch (Throwable ignore) {
        }
        try {
            Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            intent.setData(Uri.parse("package:" + activity.getPackageName()));
            activity.startActivity(intent);
        } catch (Throwable e) {
            Toast.makeText(activity, "Не удалось открыть настройки фона", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isSpyBackgroundPermissionGranted() {
        Activity activity = getParentActivity();
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) activity.getSystemService(Context.POWER_SERVICE);
            return powerManager != null && powerManager.isIgnoringBatteryOptimizations(activity.getPackageName());
        } catch (Throwable ignore) {
            return false;
        }
    }

    private View createSpyCard(Context context, View cell, boolean isDarkTheme) {
        FrameLayout card = new FrameLayout(context);
        GradientDrawable background = new GradientDrawable();
        background.setShape(GradientDrawable.RECTANGLE);
        background.setCornerRadius(AndroidUtilities.dp(18));
        background.setColor(ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlackText),
                isDarkTheme ? 0.11f : 0.035f
        ));
        background.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4), isDarkTheme ? 28 : 16));
        card.setBackground(background);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.bottomMargin = AndroidUtilities.dp(10);
        card.setLayoutParams(params);
        card.addView(cell, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
        return card;
    }

    private View createSpyInfoText(Context context, String text) {
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        textView.setTextSize(13);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.leftMargin = AndroidUtilities.dp(6);
        params.rightMargin = AndroidUtilities.dp(6);
        params.topMargin = AndroidUtilities.dp(-2);
        params.bottomMargin = AndroidUtilities.dp(14);
        textView.setLayoutParams(params);
        return textView;
    }

    private TextView createSpyValueRow(Context context, LinearLayout container, String title, String value, Runnable onClick) {
        FrameLayout row = new FrameLayout(context);
        GradientDrawable background = new GradientDrawable();
        background.setShape(GradientDrawable.RECTANGLE);
        background.setCornerRadius(AndroidUtilities.dp(18));
        background.setColor(ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundWhiteBlackText),
                0.06f
        ));
        row.setBackground(background);
        row.setOnClickListener(v -> onClick.run());
        LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(72));
        rowParams.bottomMargin = AndroidUtilities.dp(16);
        container.addView(row, rowParams);

        TextView titleView = new TextView(context);
        titleView.setText(title);
        titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        titleView.setTextSize(17);
        FrameLayout.LayoutParams titleParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        titleParams.gravity = Gravity.LEFT | Gravity.CENTER_VERTICAL;
        titleParams.leftMargin = AndroidUtilities.dp(18);
        row.addView(titleView, titleParams);

        TextView valueView = new TextView(context);
        valueView.setText(value);
        valueView.setTextColor(getSpyAccentColor());
        valueView.setTextSize(16);
        valueView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams valueParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        valueParams.gravity = Gravity.RIGHT | Gravity.CENTER_VERTICAL;
        valueParams.rightMargin = AndroidUtilities.dp(18);
        row.addView(valueView, valueParams);
        return valueView;
    }

    private void createSpyActionRow(Context context, LinearLayout container, int iconRes, String title, Runnable onClick) {
        LinearLayout row = new LinearLayout(context);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getSpyAccentColor(), 22), Theme.RIPPLE_MASK_ALL));
        row.setPadding(AndroidUtilities.dp(12), AndroidUtilities.dp(16), AndroidUtilities.dp(12), AndroidUtilities.dp(16));
        row.setOnClickListener(v -> onClick.run());
        LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        container.addView(row, rowParams);

        ImageView iconView = new ImageView(context);
        iconView.setImageResource(iconRes);
        iconView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(28), AndroidUtilities.dp(28));
        row.addView(iconView, iconParams);

        TextView titleView = new TextView(context);
        titleView.setText(title);
        titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        titleView.setTextSize(18);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        titleParams.leftMargin = AndroidUtilities.dp(18);
        row.addView(titleView, titleParams);

        View divider = new View(context);
        divider.setBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4), 46));
        LinearLayout.LayoutParams dividerParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1);
        dividerParams.leftMargin = AndroidUtilities.dp(58);
        container.addView(divider, dividerParams);
    }

    private void openSpyFolderPicker() {
        try {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
            startActivityForResult(intent, REQUEST_SPY_ATTACHMENTS_FOLDER);
        } catch (Exception e) {
            Toast.makeText(getParentActivity(), "Не удалось открыть выбор папки", Toast.LENGTH_SHORT).show();
        }
    }

    private String getSpyFolderLabel() {
        return MessagesController.getGlobalMainSettings().getString(PREF_SPY_ATTACHMENTS_FOLDER_LABEL, "не выбрана");
    }

    private void showSpyExportDialog() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), resourceProvider);
        builder.setTitle("Экспорт базы данных");
        builder.setItems(new CharSequence[] {"Отправить в Избранное", "Сохранить на устройство"}, (dialog, which) -> {
            if (which == 0) {
                sendSpyDatabaseToSavedMessages();
            } else if (which == 1) {
                exportSpyDatabaseToDevice();
            }
        });
        builder.setNegativeButton("Отмена", null);
        showDialog(builder.create());
    }

    private void showSpyImportDialog() {
        try {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("*/*");
            startActivityForResult(intent, REQUEST_SPY_IMPORT_DATABASE);
        } catch (Exception e) {
            if (getParentActivity() != null) {
                Toast.makeText(getParentActivity(), "Не удалось открыть импорт базы", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void showSpyClearDialog() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), resourceProvider);
        builder.setTitle("Очистить данные шпиона");
        builder.setMessage("Удалит локально сохранённые удалённые сообщения и историю правок из базы шпиона.");
        builder.setPositiveButton("Очистить", (dialog, which) -> {
            boolean cleared = SpyStorage.getInstance(currentAccount).clearDatabase();
            Toast.makeText(getParentActivity(), cleared ? "База шпиона очищена" : "Не удалось очистить базу", Toast.LENGTH_SHORT).show();
        });
        builder.setNegativeButton("Отмена", null);
        showDialog(builder.create());
    }

    private void sendSpyDatabaseToSavedMessages() {
        if (getParentActivity() == null) {
            return;
        }
        File exportFile = SpyStorage.getInstance(currentAccount).createExportFileCopy();
        if (exportFile == null || !exportFile.exists()) {
            Toast.makeText(getParentActivity(), "База ещё не создана", Toast.LENGTH_SHORT).show();
            return;
        }
        Uri exportUri;
        try {
            exportUri = FileProvider.getUriForFile(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", exportFile);
        } catch (Throwable e) {
            Toast.makeText(getParentActivity(), "Не удалось подготовить базу для отправки", Toast.LENGTH_SHORT).show();
            return;
        }
        long selfDialogId = AccountInstance.getInstance(currentAccount).getUserConfig().getClientUserId();
        SendMessagesHelper.prepareSendingDocument(
                AccountInstance.getInstance(currentAccount),
                null,
                null,
                exportUri,
                null,
                "application/x-axo",
                selfDialogId,
                null,
                null,
                null,
                null,
                null,
                true,
                0,
                null,
                null,
                0,
                false
        );
        Toast.makeText(getParentActivity(), "База отправляется в Избранное", Toast.LENGTH_SHORT).show();
    }

    private void exportSpyDatabaseToDevice() {
        try {
            Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("application/octet-stream");
            intent.putExtra(Intent.EXTRA_TITLE, SpyStorage.DATABASE_FILE_NAME);
            startActivityForResult(intent, REQUEST_SPY_EXPORT_DATABASE);
        } catch (Exception e) {
            if (getParentActivity() != null) {
                Toast.makeText(getParentActivity(), "Не удалось открыть экспорт базы", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void showSpyAttachmentsDialog() {
        if (getParentActivity() == null) {
            return;
        }
        Context context = getParentActivity();
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(AndroidUtilities.dp(6), AndroidUtilities.dp(6), AndroidUtilities.dp(6), AndroidUtilities.dp(4));

        final String[] keys = new String[] {
                PREF_SPY_ATTACH_PRIVATE_DIALOGS,
                PREF_SPY_ATTACH_PUBLIC_CHANNELS,
                PREF_SPY_ATTACH_PRIVATE_CHANNELS,
                PREF_SPY_ATTACH_PUBLIC_CHATS,
                PREF_SPY_ATTACH_PRIVATE_CHATS
        };
        final String[] titles = new String[] {
                "Личные чаты",
                "Публичные каналы",
                "Приватные каналы",
                "Публичные чаты",
                "Приватные чаты"
        };
        final boolean[] defaults = new boolean[] {false, false, false, false, false};
        final NotificationsCheckCell[] cells = new NotificationsCheckCell[keys.length];
        for (int i = 0; i < keys.length; i++) {
            NotificationsCheckCell cell = new NotificationsCheckCell(context, 16, 68, false, resourceProvider);
            cell.setDrawLine(false);
            cell.setBackgroundColor(0);
            boolean value = MessagesController.getGlobalMainSettings().getBoolean(keys[i], defaults[i]);
            cell.setTextAndValueAndCheck(titles[i], null, value, 0, false, i != keys.length - 1);
            cell.getCheckBox().setColors(Theme.key_switchTrack, Theme.key_switchTrackChecked, Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhite);
            final int index = i;
            cell.setOnClickListener(v -> {
                boolean newValue = !MessagesController.getGlobalMainSettings().getBoolean(keys[index], defaults[index]);
                MessagesController.getGlobalMainSettings().edit().putBoolean(keys[index], newValue).apply();
                cell.setChecked(newValue);
            });
            layout.addView(cell, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            cells[i] = cell;
        }

        TextView mobileLabel = createSpyDialogHeader(context, "Лимит на размер (моб.)");
        layout.addView(mobileLabel);
        SeekBarView mobileSeekBar = new SeekBarView(context, resourceProvider);
        mobileSeekBar.setReportChanges(true);
        mobileSeekBar.setColors(ColorUtils.setAlphaComponent(getSpyAccentColor(), 48), getSpyAccentColor());
        layout.addView(mobileSeekBar, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(38)));
        TextView mobileValue = createSpyDialogValue(context);
        layout.addView(mobileValue);

        TextView wifiLabel = createSpyDialogHeader(context, "Лимит на размер (WiFi)");
        layout.addView(wifiLabel);
        SeekBarView wifiSeekBar = new SeekBarView(context, resourceProvider);
        wifiSeekBar.setReportChanges(true);
        wifiSeekBar.setColors(ColorUtils.setAlphaComponent(getSpyAccentColor(), 48), getSpyAccentColor());
        layout.addView(wifiSeekBar, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, AndroidUtilities.dp(38)));
        TextView wifiValue = createSpyDialogValue(context);
        layout.addView(wifiValue);

        Runnable updateAttachmentLimits = () -> {
            int mobileIndex = clampSpyLimitIndex(MessagesController.getGlobalMainSettings().getInt(PREF_SPY_ATTACH_MOBILE_LIMIT_INDEX, 1));
            int wifiIndex = clampSpyLimitIndex(MessagesController.getGlobalMainSettings().getInt(PREF_SPY_ATTACH_WIFI_LIMIT_INDEX, 3));
            mobileSeekBar.setProgress(mobileIndex / (float) (SPY_ATTACHMENT_LIMIT_LABELS.length - 1));
            wifiSeekBar.setProgress(wifiIndex / (float) (SPY_ATTACHMENT_LIMIT_LABELS.length - 1));
            mobileValue.setText(SPY_ATTACHMENT_LIMIT_LABELS[mobileIndex]);
            wifiValue.setText(SPY_ATTACHMENT_LIMIT_LABELS[wifiIndex]);
        };
        mobileSeekBar.setDelegate((stop, progress) -> {
            int index = clampSpyLimitIndex(Math.round((SPY_ATTACHMENT_LIMIT_LABELS.length - 1) * progress));
            MessagesController.getGlobalMainSettings().edit().putInt(PREF_SPY_ATTACH_MOBILE_LIMIT_INDEX, index).apply();
            updateAttachmentLimits.run();
        });
        wifiSeekBar.setDelegate((stop, progress) -> {
            int index = clampSpyLimitIndex(Math.round((SPY_ATTACHMENT_LIMIT_LABELS.length - 1) * progress));
            MessagesController.getGlobalMainSettings().edit().putInt(PREF_SPY_ATTACH_WIFI_LIMIT_INDEX, index).apply();
            updateAttachmentLimits.run();
        });
        updateAttachmentLimits.run();

        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourceProvider);
        builder.setTitle("Сохранять вложения");
        builder.setView(layout);
        builder.setNegativeButton("Отмена", null);
        builder.setPositiveButton("Сохранить", null);
        showDialog(builder.create());
    }

    private TextView createSpyDialogHeader(Context context, String text) {
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextColor(getSpyAccentColor());
        textView.setTextSize(15);
        textView.setTypeface(AndroidUtilities.bold());
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.topMargin = AndroidUtilities.dp(16);
        textView.setLayoutParams(params);
        return textView;
    }

    private TextView createSpyDialogValue(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(getSpyAccentColor());
        textView.setTextSize(15);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(Gravity.RIGHT);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.topMargin = AndroidUtilities.dp(2);
        params.bottomMargin = AndroidUtilities.dp(8);
        textView.setLayoutParams(params);
        return textView;
    }

    private int clampSpyLimitIndex(int index) {
        return Math.max(0, Math.min(SPY_ATTACHMENT_LIMIT_LABELS.length - 1, index));
    }

    private int getSpyAccentColor() {
        boolean isDarkTheme = resourceProvider != null ? resourceProvider.isDark() : Theme.isCurrentThemeDark();
        return isDarkTheme ? 0xFFE279AE : 0xFFD75B93;
    }

    @Override
    public void onActivityResultFragment(int requestCode, int resultCode, Intent data) {
        if (resultCode != Activity.RESULT_OK || data == null || data.getData() == null || getParentActivity() == null) {
            return;
        }
        if (requestCode == REQUEST_SPY_EXPORT_DATABASE) {
            boolean exported = SpyStorage.getInstance(currentAccount).exportToOutputStream(data.getData());
            Toast.makeText(getParentActivity(), exported ? "База сохранена" : "Не удалось сохранить базу", Toast.LENGTH_SHORT).show();
            return;
        }
        if (requestCode == REQUEST_SPY_IMPORT_DATABASE) {
            String fileName = MediaController.getFileName(data.getData());
            if (fileName == null || !fileName.toLowerCase().endsWith(".axo")) {
                Toast.makeText(getParentActivity(), "Нужен файл базы .axo", Toast.LENGTH_SHORT).show();
                return;
            }
            boolean imported = SpyStorage.getInstance(currentAccount).importFromUri(data.getData());
            Toast.makeText(getParentActivity(), imported ? "База импортирована" : "Не удалось импортировать базу", Toast.LENGTH_SHORT).show();
            return;
        }
        if (requestCode != REQUEST_SPY_ATTACHMENTS_FOLDER) {
            return;
        }
        Uri uri = data.getData();
        try {
            int flags = Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                getParentActivity().getContentResolver().takePersistableUriPermission(uri, flags);
            }
        } catch (Exception ignore) {
        }
        String label = "выбрана";
        try {
            String documentId = DocumentsContract.getTreeDocumentId(uri);
            if (documentId != null && !documentId.isEmpty()) {
                int separatorIndex = documentId.indexOf(':');
                label = separatorIndex >= 0 && separatorIndex < documentId.length() - 1 ? documentId.substring(separatorIndex + 1) : documentId;
            }
        } catch (Exception ignore) {
        }
        MessagesController.getGlobalMainSettings().edit()
                .putString(PREF_SPY_ATTACHMENTS_FOLDER_URI, uri.toString())
                .putString(PREF_SPY_ATTACHMENTS_FOLDER_LABEL, label)
                .apply();
        if (spyFolderValueView != null) {
            spyFolderValueView.setText(label);
        }
        Toast.makeText(getParentActivity(), "Папка выбрана", Toast.LENGTH_SHORT).show();
    }

    private void addPlaceholderContent(Context context, FrameLayout contentView) {
        TextView sectionHeaderView = new TextView(context);
        sectionHeaderView.setText("Скоро");
        sectionHeaderView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        sectionHeaderView.setTextSize(14);
        sectionHeaderView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams headerLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        headerLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        headerLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(154);
        headerLayoutParams.leftMargin = AndroidUtilities.dp(28);
        contentView.addView(sectionHeaderView, headerLayoutParams);

        LinearLayout placeholderLayout = new LinearLayout(context);
        placeholderLayout.setOrientation(LinearLayout.VERTICAL);
        FrameLayout.LayoutParams placeholderLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        placeholderLayoutParams.gravity = Gravity.TOP;
        placeholderLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(180);
        placeholderLayoutParams.leftMargin = AndroidUtilities.dp(20);
        placeholderLayoutParams.rightMargin = AndroidUtilities.dp(20);
        contentView.addView(placeholderLayout, placeholderLayoutParams);

        placeholderLayout.addView(createSectionRow(context, R.drawable.msg_secret, "Скоро здесь появятся настройки", true));
        placeholderLayout.addView(createSectionRow(context, R.drawable.msg_mini_customize, "Раздел в разработке", false));
    }

    private View createSectionRow(Context context, int iconRes, String title, boolean drawDivider) {
        LinearLayout rowLayout = new LinearLayout(context);
        rowLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout contentLayout = new LinearLayout(context);
        contentLayout.setOrientation(LinearLayout.HORIZONTAL);
        contentLayout.setGravity(Gravity.CENTER_VERTICAL);
        contentLayout.setPadding(AndroidUtilities.dp(8), AndroidUtilities.dp(14), AndroidUtilities.dp(8), AndroidUtilities.dp(14));
        rowLayout.addView(contentLayout, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        ImageView iconView = new ImageView(context);
        iconView.setImageResource(iconRes);
        iconView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        LinearLayout.LayoutParams iconLayoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(32), AndroidUtilities.dp(32));
        contentLayout.addView(iconView, iconLayoutParams);

        TextView titleView = new TextView(context);
        titleView.setText(title);
        titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        titleView.setTextSize(18);
        LinearLayout.LayoutParams titleLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        titleLayoutParams.leftMargin = AndroidUtilities.dp(18);
        contentLayout.addView(titleView, titleLayoutParams);

        if (drawDivider) {
            View dividerView = new View(context);
            dividerView.setBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4), 46));
            LinearLayout.LayoutParams dividerLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1);
            dividerLayoutParams.leftMargin = AndroidUtilities.dp(58);
            rowLayout.addView(dividerView, dividerLayoutParams);
        }
        return rowLayout;
    }

    private String getSectionTitle() {
        switch (type) {
            case TYPE_GHOST:
                return "Режим призрака";
            case TYPE_SPY:
                return "Шпион";
            case TYPE_CUSTOMIZATION:
                return "Кастомизация";
            case TYPE_FEATURES:
                return "Функции";
            default:
                return "AxoGram";
        }
    }
}
