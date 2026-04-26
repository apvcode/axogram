package space.axolab.axogram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.graphics.ColorUtils;

import java.util.Random;

import space.axolab.axogram.AndroidUtilities;
import space.axolab.axogram.MessagesController;
import space.axolab.axogram.R;
import space.axolab.axogram.ui.ActionBar.ActionBar;
import space.axolab.axogram.ui.ActionBar.BaseFragment;
import space.axolab.axogram.ui.ActionBar.Theme;
import space.axolab.axogram.ui.Cells.NotificationsCheckCell;
import space.axolab.axogram.ui.Components.CubicBezierInterpolator;

public class AxoGramSectionFragment extends BaseFragment {
    public static final int TYPE_GHOST = 0;
    public static final int TYPE_SPY = 1;
    public static final int TYPE_CUSTOMIZATION = 2;
    public static final int TYPE_FEATURES = 3;

    private static final String PREF_COLLAPSE_SETTINGS_TABS = "axogram_collapse_settings_tabs";

    private final int type;

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
        } else {
            addPlaceholderContent(context, contentView);
        }

        fragmentView = contentView;
        return fragmentView;
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
