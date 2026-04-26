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
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.graphics.ColorUtils;

import space.axolab.axogram.AndroidUtilities;
import space.axolab.axogram.BuildVars;
import space.axolab.axogram.R;
import space.axolab.axogram.ui.ActionBar.ActionBar;
import space.axolab.axogram.ui.ActionBar.BaseFragment;
import space.axolab.axogram.ui.ActionBar.Theme;
import space.axolab.axogram.browser.Browser;
import space.axolab.axogram.ui.Components.CubicBezierInterpolator;

import java.util.Random;

public class AxoGramEmptyFragment extends BaseFragment {
    private ValueAnimator logoRotationAnimator;

    @Override
    public View createView(Context context) {
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

        FrameLayout logoCardContainer = new FrameLayout(context);
        LinearLayout.LayoutParams logoCardContainerLayoutParams = new LinearLayout.LayoutParams(
                AndroidUtilities.dp(196),
                AndroidUtilities.dp(196)
        );
        heroLayout.addView(logoCardContainer, logoCardContainerLayoutParams);

        final float[] logoPressLevel = new float[] {0f};

        FrameLayout topLogoCard = new FrameLayout(context);
        GradientDrawable topLogoCardBackground = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[] {0xFF12141A, 0xFF090B10}
        );
        topLogoCardBackground.setCornerRadius(AndroidUtilities.dp(30));
        topLogoCardBackground.setStroke(AndroidUtilities.dp(1), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 12));
        topLogoCard.setBackground(topLogoCardBackground);

        FrameLayout.LayoutParams topLogoCardLayoutParams = new FrameLayout.LayoutParams(
                AndroidUtilities.dp(156),
                AndroidUtilities.dp(156)
        );
        topLogoCardLayoutParams.gravity = Gravity.CENTER;
        logoCardContainer.addView(topLogoCard, topLogoCardLayoutParams);

        ImageView topLogoView = new ImageView(context);
        topLogoView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        topLogoView.setImageResource(R.drawable.axogram_logo_app_in_nobg);
        FrameLayout.LayoutParams topLogoLayoutParams = new FrameLayout.LayoutParams(
                AndroidUtilities.dp(152),
                AndroidUtilities.dp(152),
                Gravity.CENTER
        );
        topLogoCard.addView(topLogoView, topLogoLayoutParams);

        logoCardContainer.setOnTouchListener((v, event) -> {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    v.animate().scaleX(0.92f).scaleY(0.92f).setDuration(180).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    animateLogoPress(logoPressLevel, topLogoView, 1f);
                    return true;
                case MotionEvent.ACTION_UP:
                    v.animate().scaleX(1f).scaleY(1f).setDuration(220).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    animateLogoPress(logoPressLevel, topLogoView, 0f);
                    v.performClick();
                    return true;
                case MotionEvent.ACTION_CANCEL:
                    v.animate().scaleX(1f).scaleY(1f).setDuration(220).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    animateLogoPress(logoPressLevel, topLogoView, 0f);
                    return true;
                default:
                    return true;
            }
        });
        logoRotationAnimator = ValueAnimator.ofFloat(0f, 1f);
        logoRotationAnimator.setDuration(4600);
        logoRotationAnimator.setInterpolator(new LinearInterpolator());
        logoRotationAnimator.setRepeatCount(ValueAnimator.INFINITE);
        logoRotationAnimator.addUpdateListener(animation -> {
            float phase = (float) animation.getAnimatedValue();
            float rotation;
            if (phase < 0.10f) {
                rotation = easeInSegment(0f, 40f, phase / 0.10f);
            } else if (phase < 0.18f) {
                rotation = easeInSegment(40f, 150f, (phase - 0.10f) / 0.08f);
            } else if (phase < 0.34f) {
                rotation = linearSegment(150f, 430f, (phase - 0.18f) / 0.16f);
            } else if (phase < 0.48f) {
                rotation = easeOutSegment(430f, 540f, (phase - 0.34f) / 0.14f);
            } else if (phase < 0.74f) {
                rotation = 540f;
            } else if (phase < 0.84f) {
                rotation = easeOutSegment(540f, 650f, (phase - 0.74f) / 0.10f);
            } else if (phase < 1f) {
                rotation = easeOutSegment(650f, 720f, (phase - 0.84f) / 0.16f);
            } else {
                rotation = 720f;
            }
            topLogoView.setRotation(rotation);
        });
        logoRotationAnimator.start();

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
        heroTitleLayoutParams.topMargin = AndroidUtilities.dp(8);
        heroLayout.addView(heroTitleView, heroTitleLayoutParams);

        TextView heroVersionView = new TextView(context);
        heroVersionView.setText(BuildVars.BUILD_VERSION_STRING);
        heroVersionView.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_actionBarDefaultTitle), 160));
        heroVersionView.setTextSize(13);
        heroVersionView.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams heroVersionLayoutParams = new LinearLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        heroVersionLayoutParams.topMargin = AndroidUtilities.dp(2);
        heroLayout.addView(heroVersionView, heroVersionLayoutParams);

        TextView categoriesHeaderView = new TextView(context);
        categoriesHeaderView.setText("Категории");
        categoriesHeaderView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        categoriesHeaderView.setTextSize(14);
        categoriesHeaderView.setTypeface(AndroidUtilities.bold());
        FrameLayout.LayoutParams categoriesHeaderLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        categoriesHeaderLayoutParams.gravity = Gravity.TOP | Gravity.LEFT;
        categoriesHeaderLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(308);
        categoriesHeaderLayoutParams.leftMargin = AndroidUtilities.dp(28);
        contentView.addView(categoriesHeaderView, categoriesHeaderLayoutParams);

        LinearLayout categoriesLayout = new LinearLayout(context);
        categoriesLayout.setOrientation(LinearLayout.VERTICAL);
        FrameLayout.LayoutParams categoriesLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        categoriesLayoutParams.gravity = Gravity.TOP;
        categoriesLayoutParams.topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(334);
        categoriesLayoutParams.leftMargin = AndroidUtilities.dp(20);
        categoriesLayoutParams.rightMargin = AndroidUtilities.dp(20);
        contentView.addView(categoriesLayout, categoriesLayoutParams);

        categoriesLayout.addView(createSectionRow(context, R.drawable.ghost, "Режим призрака", () -> presentFragment(new AxoGramSectionFragment(AxoGramSectionFragment.TYPE_GHOST))));
        categoriesLayout.addView(createSectionRow(context, R.drawable.msg_bot, "Шпион", () -> presentFragment(new AxoGramSectionFragment(AxoGramSectionFragment.TYPE_SPY))));
        categoriesLayout.addView(createSectionRow(context, R.drawable.msg_mini_customize, "Кастомизация", () -> presentFragment(new AxoGramSectionFragment(AxoGramSectionFragment.TYPE_CUSTOMIZATION))));
        categoriesLayout.addView(createSectionRow(context, R.drawable.msg_settings, "Функции", () -> presentFragment(new AxoGramSectionFragment(AxoGramSectionFragment.TYPE_FEATURES))));

        LinearLayout linksLayout = new LinearLayout(context);
        linksLayout.setOrientation(LinearLayout.VERTICAL);
        FrameLayout.LayoutParams linksLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        linksLayoutParams.gravity = Gravity.BOTTOM;
        linksLayoutParams.leftMargin = AndroidUtilities.dp(20);
        linksLayoutParams.rightMargin = AndroidUtilities.dp(20);
        linksLayoutParams.bottomMargin = AndroidUtilities.dp(28);
        contentView.addView(linksLayout, linksLayoutParams);

        View dividerView = new View(context);
        GradientDrawable dividerDrawable = new GradientDrawable(
                GradientDrawable.Orientation.LEFT_RIGHT,
                new int[] {
                        ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), 0),
                        ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), 120),
                        ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), 0)
                }
        );
        dividerDrawable.setCornerRadius(AndroidUtilities.dp(2));
        dividerView.setBackground(dividerDrawable);
        LinearLayout.LayoutParams dividerLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                AndroidUtilities.dp(2)
        );
        dividerLayoutParams.bottomMargin = AndroidUtilities.dp(16);
        linksLayout.addView(dividerView, dividerLayoutParams);

        TextView linksHeaderView = new TextView(context);
        linksHeaderView.setText("Ссылки");
        linksHeaderView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        linksHeaderView.setTextSize(14);
        linksHeaderView.setTypeface(AndroidUtilities.bold());
        LinearLayout.LayoutParams linksHeaderLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linksHeaderLayoutParams.bottomMargin = AndroidUtilities.dp(10);
        linksLayout.addView(linksHeaderView, linksHeaderLayoutParams);

        linksLayout.addView(createSectionRow(
                context,
                R.drawable.msg_channel,
                "AxoGram Releases",
                () -> Browser.openUrl(context, "https://t.me/AxoGramReleases")
        ));

        fragmentView = contentView;
        return fragmentView;
    }

    @Override
    public void onFragmentDestroy() {
        if (logoRotationAnimator != null) {
            logoRotationAnimator.cancel();
            logoRotationAnimator = null;
        }
        super.onFragmentDestroy();
    }

    private static void animateLogoPress(float[] pressLevel, View logoView, float to) {
        ValueAnimator animator = ValueAnimator.ofFloat(pressLevel[0], to);
        animator.setDuration(to > pressLevel[0] ? 160 : 220);
        animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animator.addUpdateListener(a -> {
            pressLevel[0] = (float) a.getAnimatedValue();
            float scale = AndroidUtilities.lerp(1f, 0.96f, pressLevel[0]);
            logoView.setScaleX(scale);
            logoView.setScaleY(scale);
        });
        animator.start();
    }

    private View createSectionRow(Context context, int iconRes, String title, Runnable onClick) {
        FrameLayout rowLayout = new FrameLayout(context);
        rowLayout.setClickable(true);
        rowLayout.setFocusable(true);
        rowLayout.setOnClickListener(v -> onClick.run());

        int rowDefaultColor = ColorUtils.blendARGB(
                Theme.getColor(Theme.key_windowBackgroundWhite),
                Theme.getColor(Theme.key_windowBackgroundGray),
                Theme.isCurrentThemeDark() ? 0.16f : 0.05f
        );
        int rowPressedColor = ColorUtils.blendARGB(
                rowDefaultColor,
                Theme.getColor(Theme.key_windowBackgroundWhiteBlueText),
                Theme.isCurrentThemeDark() ? 0.12f : 0.08f
        );
        rowLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(
                AndroidUtilities.dp(22),
                rowDefaultColor,
                rowPressedColor
        ));
        LinearLayout.LayoutParams rowLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                AndroidUtilities.dp(58)
        );
        rowLayoutParams.bottomMargin = AndroidUtilities.dp(8);
        rowLayout.setLayoutParams(rowLayoutParams);

        LinearLayout contentLayout = new LinearLayout(context);
        contentLayout.setOrientation(LinearLayout.HORIZONTAL);
        contentLayout.setGravity(Gravity.CENTER_VERTICAL);
        contentLayout.setPadding(AndroidUtilities.dp(12), AndroidUtilities.dp(0), AndroidUtilities.dp(12), AndroidUtilities.dp(0));
        rowLayout.addView(contentLayout, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));

        GradientDrawable iconPillDrawable = new GradientDrawable();
        iconPillDrawable.setShape(GradientDrawable.RECTANGLE);
        iconPillDrawable.setCornerRadius(AndroidUtilities.dp(16));
        iconPillDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText), Theme.isCurrentThemeDark() ? 20 : 12));
        FrameLayout iconHolder = new FrameLayout(context);
        iconHolder.setBackground(iconPillDrawable);
        LinearLayout.LayoutParams iconHolderLayoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(34), AndroidUtilities.dp(34));
        iconHolderLayoutParams.rightMargin = AndroidUtilities.dp(12);
        contentLayout.addView(iconHolder, iconHolderLayoutParams);

        ImageView iconView = new ImageView(context);
        iconView.setImageResource(iconRes);
        iconView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
        iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams iconFrameLayoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(20), AndroidUtilities.dp(20), Gravity.CENTER);
        iconHolder.addView(iconView, iconFrameLayoutParams);

        TextView titleView = new TextView(context);
        titleView.setText(title);
        titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        titleView.setTextSize(16);
        titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        LinearLayout.LayoutParams titleLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        contentLayout.addView(titleView, titleLayoutParams);

        TextView chevronView = new TextView(context);
        chevronView.setText("›");
        chevronView.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4), 135));
        chevronView.setTextSize(19);
        LinearLayout.LayoutParams chevronLayoutParams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f);
        chevronLayoutParams.gravity = Gravity.CENTER_VERTICAL;
        chevronLayoutParams.leftMargin = AndroidUtilities.dp(12);
        View spacerView = new View(context);
        contentLayout.addView(spacerView, chevronLayoutParams);
        contentLayout.addView(chevronView, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        return rowLayout;
    }

    private static float easeInOutSegment(float from, float to, float t) {
        t = Math.max(0f, Math.min(1f, t));
        float eased = (1f - (float) Math.cos(Math.PI * t)) * 0.5f;
        return AndroidUtilities.lerp(from, to, eased);
    }

    private static float easeOutSegment(float from, float to, float t) {
        t = Math.max(0f, Math.min(1f, t));
        float eased = 1f - (1f - t) * (1f - t);
        return AndroidUtilities.lerp(from, to, eased);
    }

    private static float linearSegment(float from, float to, float t) {
        t = Math.max(0f, Math.min(1f, t));
        return AndroidUtilities.lerp(from, to, t);
    }

    private static float easeInSegment(float from, float to, float t) {
        t = Math.max(0f, Math.min(1f, t));
        float eased = t * t;
        return AndroidUtilities.lerp(from, to, eased);
    }
}
