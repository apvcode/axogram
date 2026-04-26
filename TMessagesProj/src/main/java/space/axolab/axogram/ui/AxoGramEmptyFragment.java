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
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.graphics.ColorUtils;

import space.axolab.axogram.AndroidUtilities;
import space.axolab.axogram.MessagesController;
import space.axolab.axogram.R;
import space.axolab.axogram.ui.ActionBar.ActionBar;
import space.axolab.axogram.ui.ActionBar.BaseFragment;
import space.axolab.axogram.ui.ActionBar.Theme;
import space.axolab.axogram.ui.Cells.NotificationsCheckCell;
import space.axolab.axogram.ui.Components.CubicBezierInterpolator;

import java.util.Random;

public class AxoGramEmptyFragment extends BaseFragment {
    private static final int ID_COLLAPSE_SETTINGS_TABS = 1;
    private static final String PREF_COLLAPSE_SETTINGS_TABS = "axogram_collapse_settings_tabs";

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
            private static final int TAP_BLOB_COUNT = 3;
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
            private final Random random = new Random(0xA8017L);
            private final int[] blobColors = new int[BLOB_COUNT];
            private final Paint[] tapBlobPaints = new Paint[TAP_BLOB_COUNT];
            private final float[] tapBlobX = new float[TAP_BLOB_COUNT];
            private final float[] tapBlobY = new float[TAP_BLOB_COUNT];
            private final float[] tapBlobRadius = new float[TAP_BLOB_COUNT];
            private final int[] tapBlobColor = new int[TAP_BLOB_COUNT];
            private final long[] tapBlobStart = new long[TAP_BLOB_COUNT];
            private final long[] tapBlobDuration = new long[TAP_BLOB_COUNT];
            private final float[] noiseX = new float[NOISE_POINT_COUNT];
            private final float[] noiseY = new float[NOISE_POINT_COUNT];
            private final float[] noiseR = new float[NOISE_POINT_COUNT];
            private final int[] noiseA = new int[NOISE_POINT_COUNT];
            private long animationStart;
            private int nextTapBlob;

            {
                setWillNotDraw(false);
                for (int i = 0; i < BLOB_COUNT; i++) {
                    blobPaints[i] = new Paint(Paint.ANTI_ALIAS_FLAG);
                }
                for (int i = 0; i < TAP_BLOB_COUNT; i++) {
                    tapBlobPaints[i] = new Paint(Paint.ANTI_ALIAS_FLAG);
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
                for (int i = 0; i < TAP_BLOB_COUNT; i++) {
                    tapBlobColor[i] = blobColors[i % blobColors.length];
                    tapBlobStart[i] = 0L;
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                canvas.drawRect(0, 0, getWidth(), getHeight(), backgroundPaint);
                for (int i = 0; i < NOISE_POINT_COUNT; i++) {
                    noisePaint.setAlpha(noiseA[i]);
                    canvas.drawCircle(noiseX[i], noiseY[i], noiseR[i], noisePaint);
                }
                final long now = SystemClock.elapsedRealtime();
                boolean needsMoreFrames = false;
                for (int i = 0; i < BLOB_COUNT; i++) {
                    if (durations[i] <= 0) {
                        continue;
                    }
                    float t = (now - animationStart - delays[i]) / (float) durations[i];
                    if (t >= 1f) {
                        reconfigureBlob(i, getWidth(), getHeight(), 0, false);
                        t = 0f;
                    }
                    if (t < 0f) {
                        t = 0f;
                    }
                    final float eased = cubicBezier(t);
                    final float x = AndroidUtilities.lerp(fromX[i], toX[i], eased);
                    final float y = AndroidUtilities.lerp(fromY[i], toY[i], eased);
                    final float fade = blobVisibility(t);
                    final int innerAlpha = (int) (intensity[i] * fade);
                    final int outerAlpha = (int) (innerAlpha * 0.38f);
                    blobPaints[i].setShader(new RadialGradient(
                            x,
                            y,
                            radius[i],
                            new int[] {
                                    ColorUtils.setAlphaComponent(blobColors[i], innerAlpha),
                                    ColorUtils.setAlphaComponent(blobColors[i], outerAlpha),
                                    0x00000000
                            },
                            new float[] {0f, 0.42f, 1f},
                            Shader.TileMode.CLAMP
                    ));
                    canvas.drawCircle(x, y, radius[i], blobPaints[i]);
                    needsMoreFrames = true;
                }
                for (int i = 0; i < TAP_BLOB_COUNT; i++) {
                    if (tapBlobStart[i] <= 0L || tapBlobDuration[i] <= 0L) {
                        continue;
                    }
                    float t = (now - tapBlobStart[i]) / (float) tapBlobDuration[i];
                    if (t >= 1f) {
                        tapBlobStart[i] = 0L;
                        continue;
                    }
                    final float eased = cubicBezier(Math.max(0f, t));
                    final float fade = 1f - eased;
                    final float currentRadius = AndroidUtilities.lerp(tapBlobRadius[i] * 0.18f, tapBlobRadius[i], eased);
                    final int innerAlpha = (int) (34f * fade);
                    final int outerAlpha = (int) (14f * fade);
                    tapBlobPaints[i].setShader(new RadialGradient(
                            tapBlobX[i],
                            tapBlobY[i],
                            currentRadius,
                            new int[] {
                                    ColorUtils.setAlphaComponent(tapBlobColor[i], innerAlpha),
                                    ColorUtils.setAlphaComponent(tapBlobColor[i], outerAlpha),
                                    0x00000000
                            },
                            new float[] {0f, 0.32f, 1f},
                            Shader.TileMode.CLAMP
                    ));
                    canvas.drawCircle(tapBlobX[i], tapBlobY[i], currentRadius, tapBlobPaints[i]);
                    needsMoreFrames = true;
                }
                if (needsMoreFrames) {
                    invalidate();
                }
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent ev) {
                if (ev.getAction() == MotionEvent.ACTION_DOWN) {
                    spawnTapBlob(ev.getX(), ev.getY());
                }
                return super.dispatchTouchEvent(ev);
            }

            private void reconfigureBlob(int index, int width, int height, long extraDelay, boolean initial) {
                final float safeWidth = Math.max(width, 1);
                final float safeHeight = Math.max(height, 1);
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

            private float blobVisibility(float t) {
                if (t <= 0.18f) {
                    return t / 0.18f;
                } else if (t >= 0.74f) {
                    return 1f - (t - 0.74f) / 0.26f;
                }
                return 1f;
            }

            private float cubicBezier(float t) {
                final float oneMinusT = 1f - t;
                return 1f - oneMinusT * oneMinusT * oneMinusT;
            }

            private void spawnTapBlob(float x, float y) {
                final int index = nextTapBlob++ % TAP_BLOB_COUNT;
                tapBlobX[index] = x;
                tapBlobY[index] = y;
                tapBlobRadius[index] = randomRange(AndroidUtilities.dp(72), AndroidUtilities.dp(128));
                tapBlobColor[index] = blobColors[random.nextInt(blobColors.length)];
                tapBlobDuration[index] = 900L + random.nextInt(300);
                tapBlobStart[index] = SystemClock.elapsedRealtime();
                invalidate();
            }
        };

        ImageView backButtonView = new ImageView(context);
        backButtonView.setImageResource(R.drawable.ic_ab_back);
        backButtonView.setColorFilter(Theme.getColor(Theme.key_actionBarDefaultTitle));
        backButtonView.setScaleType(ImageView.ScaleType.CENTER);
        backButtonView.setBackground(Theme.createSimpleSelectorCircleDrawable(
                AndroidUtilities.dp(40),
                0,
                ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_actionBarDefaultTitle), 24)
        ));
        backButtonView.setOnClickListener(v -> finishFragment());
        FrameLayout.LayoutParams backButtonLayoutParams = new FrameLayout.LayoutParams(
                AndroidUtilities.dp(40),
                AndroidUtilities.dp(40)
        );
        backButtonLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        backButtonLayoutParams.leftMargin = AndroidUtilities.dp(12);
        backButtonLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(10);
        contentView.addView(backButtonView, backButtonLayoutParams);

        LinearLayout heroLayout = new LinearLayout(context);
        heroLayout.setOrientation(LinearLayout.VERTICAL);
        heroLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        FrameLayout.LayoutParams heroLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        heroLayoutParams.gravity = Gravity.TOP;
        heroLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(28);
        contentView.addView(heroLayout, heroLayoutParams);

        FrameLayout topLogoCard = new FrameLayout(context);
        GradientDrawable topLogoCardBackground = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[] {0xFF12141A, 0xFF090B10}
        );
        topLogoCardBackground.setCornerRadius(AndroidUtilities.dp(30));
        topLogoCardBackground.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 12));
        topLogoCard.setBackground(topLogoCardBackground);
        LinearLayout.LayoutParams topLogoCardLayoutParams = new LinearLayout.LayoutParams(
                AndroidUtilities.dp(156),
                AndroidUtilities.dp(156)
        );
        heroLayout.addView(topLogoCard, topLogoCardLayoutParams);

        ImageView topLogoView = new ImageView(context);
        topLogoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        topLogoView.setImageResource(R.drawable.axogram_logo_app_in_nobg);
        FrameLayout.LayoutParams topLogoLayoutParams = new FrameLayout.LayoutParams(
                AndroidUtilities.dp(128),
                AndroidUtilities.dp(128),
                Gravity.CENTER
        );
        topLogoCard.addView(topLogoView, topLogoLayoutParams);

        TextView heroTitleView = new TextView(context);
        heroTitleView.setText("AxoGram");
        heroTitleView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle));
        heroTitleView.setTextSize(28);
        heroTitleView.setTypeface(AndroidUtilities.bold());
        heroTitleView.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams heroTitleLayoutParams = new LinearLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        heroTitleLayoutParams.topMargin = AndroidUtilities.dp(18);
        heroLayout.addView(heroTitleView, heroTitleLayoutParams);

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
        FrameLayout.LayoutParams optionCardParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        optionCardParams.leftMargin = AndroidUtilities.dp(16);
        optionCardParams.rightMargin = AndroidUtilities.dp(16);
        optionCardParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(292);
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
        FrameLayout.LayoutParams infoLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        infoLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        infoLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(374);
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

                int enabledCardColor = ColorUtils.blendARGB(
                        defaultCardColor,
                        accentColor,
                        isDarkTheme ? 0.10f : 0.04f
                );
                int disabledCardColor = ColorUtils.blendARGB(
                        defaultCardColor,
                        Theme.getColor(Theme.key_windowBackgroundGray),
                        isDarkTheme ? 0.22f : 0.10f
                );
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
                optionCard.invalidate();
                optionCell.invalidate();
                infoView.invalidate();
            });
            animator.start();
        };
        optionCell.setOnClickListener(v -> {
            final boolean enabled = !MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true);
            MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_COLLAPSE_SETTINGS_TABS, enabled).apply();
            optionCell.setChecked(enabled);
            updateOptionAppearance.run();
        });
        updateOptionAppearance.run();

        fragmentView = contentView;
        return fragmentView;
    }
}
