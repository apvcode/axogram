package space.axolab.axogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.core.graphics.ColorUtils;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import space.axolab.axogram.AndroidUtilities;
import space.axolab.axogram.FileLog;
import space.axolab.axogram.LocaleController;
import space.axolab.axogram.R;
import space.axolab.axogram.ui.ActionBar.BottomSheet;
import space.axolab.axogram.ui.ActionBar.Theme;

import java.util.HashMap;

public class QRCodeBottomSheet extends BottomSheet {

    Bitmap qrCode;
    private String link;
    private final TextView help;
    private final TextView buttonTextView;
    private TextView button2TextView;
    int imageSize;
    RLottieImageView iconImage;
    private final ImageView imageView;
    private final QRRevealOverlayView qrRevealOverlayView;
    private ValueAnimator qrRevealAnimator;

    public QRCodeBottomSheet(Context context, String title, String link, String helpMessage, boolean includeShareLink) {
        this(context, title, link, helpMessage, includeShareLink, null);
    }
    public QRCodeBottomSheet(Context context, String title, String link, String helpMessage, boolean includeShareLink, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        fixNavigationBar();
        this.link = link;

        setTitle(title, true);
        imageView = new ImageView(context) {
            @Override
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                int size = MeasureSpec.getSize(widthMeasureSpec);
                super.onMeasure(MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY));
            }
        };
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12));
                }
            });
            imageView.setClipToOutline(true);
        }

        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(0, AndroidUtilities.dp(16), 0, 0);
        imageView.setImageBitmap(qrCode = createQR(context, link, qrCode));

        iconImage = new RLottieImageView(context);
        iconImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iconImage.setBackgroundColor(Color.WHITE);
        //iconImage.setPadding(-AndroidUtilities.dp(4), -AndroidUtilities.dp(4), -AndroidUtilities.dp(4), -AndroidUtilities.dp(4));

        FrameLayout frameLayout = new FrameLayout(context) {

            float lastX;
            @Override
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                float x = imageSize / 768f * imageView.getMeasuredHeight();
                if (lastX != x) {
                    lastX = x;
                    iconImage.getLayoutParams().height = iconImage.getLayoutParams().width = (int) x;
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }
        };
        frameLayout.addView(imageView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        qrRevealOverlayView = new QRRevealOverlayView(context);
        frameLayout.addView(qrRevealOverlayView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        frameLayout.addView(iconImage, LayoutHelper.createFrame(60, 60, Gravity.CENTER));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(220, 220, Gravity.CENTER_HORIZONTAL, 30, 0,30 ,0));

        help = new TextView(context);
        help.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        help.setText(helpMessage);
        help.setGravity(Gravity.CENTER_HORIZONTAL);
        linearLayout.addView(help, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, 0, 40, 8, 40, 8));

        buttonTextView = new TextView(context);
        buttonTextView.setPadding(AndroidUtilities.dp(34), 0, AndroidUtilities.dp(34), 0);
        buttonTextView.setGravity(Gravity.CENTER);
        buttonTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        buttonTextView.setTypeface(AndroidUtilities.bold());
        buttonTextView.setText(LocaleController.getString(R.string.Close));
        buttonTextView.setOnClickListener(view -> dismiss());
        linearLayout.addView(buttonTextView, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 48, Gravity.BOTTOM, 16, 15, 16, 3));

        if (includeShareLink) {
            button2TextView = new TextView(context);
            button2TextView.setPadding(AndroidUtilities.dp(34), 0, AndroidUtilities.dp(34), 0);
            button2TextView.setGravity(Gravity.CENTER);
            button2TextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
            //        button2TextView.setTypeface(AndroidUtilities.medium());
            button2TextView.setText(LocaleController.getString(R.string.ShareLink));
            button2TextView.setOnClickListener(view -> {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, this.link);
                Intent chooserIntent = Intent.createChooser(shareIntent, LocaleController.getString(R.string.ShareLink));
                chooserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(chooserIntent);
            });
            linearLayout.addView(button2TextView, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, 48, Gravity.BOTTOM, 16, 3, 16, 16));
        }

        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        animateQrReveal(true);
    }

    public Bitmap createQR(Context context, String key, Bitmap oldBitmap) {
        try {
            HashMap<EncodeHintType, Object> hints = new HashMap<>();
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            hints.put(EncodeHintType.MARGIN, 0);
            QRCodeWriter writer = new QRCodeWriter();
            Bitmap bitmap = writer.encode(key, 768, 768, hints, oldBitmap);
            imageSize = writer.getImageSize();
            return bitmap;
        } catch (Exception e) {
            FileLog.e(e);
        }
        return null;
    }

    public void setCenterAnimation(int resId) {
        iconImage.setAutoRepeat(true);
        iconImage.setAnimation(resId, 60, 60);
        iconImage.playAnimation();
    }

    public void setCenterImage(int resId) {
        iconImage.setImageResource(resId);
    }

    public void setCenterImage(Drawable drawable) {
        iconImage.setImageDrawable(drawable);
    }

    public void setCenterImage(Bitmap bitmap) {
        iconImage.setImageBitmap(bitmap);
    }

    public void updateLink(String link) {
        if (link == null || link.equals(this.link)) {
            return;
        }
        this.link = link;
        imageView.setImageBitmap(qrCode = createQR(imageView.getContext(), link, qrCode));
        animateQrReveal(false);
    }

    void updateColors() {
        int accentColor = getThemedColor(Theme.key_featuredStickers_addButton);
        buttonTextView.setTextColor(accentColor);
        buttonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(
                AndroidUtilities.dp(24),
                ColorUtils.setAlphaComponent(accentColor, 28),
                ColorUtils.setAlphaComponent(accentColor, 52)
        ));
        if (button2TextView != null) {
            button2TextView.setTextColor(accentColor);
            button2TextView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(accentColor, Math.min(255, Color.alpha(getThemedColor(Theme.key_listSelector)) * 2)), Theme.RIPPLE_MASK_ROUNDRECT_6DP));
        }
        help.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        help.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
    }

    private void animateQrReveal(boolean firstShow) {
        if (qrRevealAnimator != null) {
            qrRevealAnimator.cancel();
        }
        imageView.setAlpha(firstShow ? 0.18f : 0.34f);
        imageView.setScaleX(firstShow ? 0.78f : 0.86f);
        imageView.setScaleY(firstShow ? 0.78f : 0.86f);
        imageView.setTranslationY(firstShow ? AndroidUtilities.dp(18) : AndroidUtilities.dp(10));
        qrRevealOverlayView.setRevealProgress(0f);
        qrRevealOverlayView.setVisibility(View.VISIBLE);
        qrRevealAnimator = ValueAnimator.ofFloat(0f, 1f);
        qrRevealAnimator.setDuration(firstShow ? 1120L : 820L);
        qrRevealAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        qrRevealAnimator.addUpdateListener(animation -> {
            float progress = (float) animation.getAnimatedValue();
            qrRevealOverlayView.setRevealProgress(progress);
            imageView.setAlpha(firstShow ? (0.18f + 0.82f * progress) : (0.34f + 0.66f * progress));
            float scale = firstShow ? (0.78f + 0.22f * progress) : (0.86f + 0.14f * progress);
            imageView.setScaleX(scale);
            imageView.setScaleY(scale);
            imageView.setTranslationY((firstShow ? AndroidUtilities.dp(18) : AndroidUtilities.dp(10)) * (1f - progress));
        });
        qrRevealAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                qrRevealOverlayView.setRevealProgress(1f);
                qrRevealOverlayView.setVisibility(View.GONE);
                imageView.setAlpha(1f);
                imageView.setScaleX(1f);
                imageView.setScaleY(1f);
                imageView.setTranslationY(0f);
            }
        });
        qrRevealAnimator.start();
    }

    private static class QRRevealOverlayView extends View {

        private final Paint overlayPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF rect = new RectF();
        private float revealProgress = 1f;

        public QRRevealOverlayView(Context context) {
            super(context);
            overlayPaint.setColor(0xff202b3d);
        }

        public void setRevealProgress(float revealProgress) {
            this.revealProgress = revealProgress;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            if (width <= 0 || height <= 0 || revealProgress >= 1f) {
                return;
            }
            float revealY = height * revealProgress;
            rect.set(0, revealY, width, height);
            overlayPaint.setAlpha((int) (255 * (1f - revealProgress)));
            canvas.drawRect(rect, overlayPaint);

            float lineTop = Math.max(0, revealY - AndroidUtilities.dp(34));
            float lineBottom = Math.min(height, revealY + AndroidUtilities.dp(34));
            linePaint.setShader(new LinearGradient(
                    0, lineTop, 0, lineBottom,
                    new int[] {0x00000000, 0x66a8d9ff, 0xffffffff, 0x66a8d9ff, 0x00000000},
                    new float[] {0f, 0.22f, 0.5f, 0.78f, 1f},
                    Shader.TileMode.CLAMP
            ));
            canvas.drawRect(0, lineTop, width, lineBottom, linePaint);
            linePaint.setShader(null);
        }
    }
}
