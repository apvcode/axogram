package space.axolab.axogram;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public final class TeamBadgeDrawableHelper {

    private TeamBadgeDrawableHelper() {
    }

    public static Drawable create(Context context, boolean darkTheme, int widthDp, int heightDp, int iconDp, int bigStarDp, int smallStarDp) {
        Drawable icon = ContextCompat.getDrawable(context, darkTheme ? R.drawable.axo_lab_icon_white : R.drawable.axo_lab_icon_black);
        if (icon == null) {
            return icon;
        }
        return new SparkleBadgeDrawable(
            icon.mutate(),
            darkTheme,
            AndroidUtilities.dp(widthDp),
            AndroidUtilities.dp(heightDp),
            AndroidUtilities.dp(iconDp),
            AndroidUtilities.dp(bigStarDp),
            AndroidUtilities.dp(smallStarDp)
        );
    }

    private static class SparkleBadgeDrawable extends Drawable {
        private final Drawable icon;
        private final Paint particlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final int width;
        private final int height;
        private final int iconSize;
        private final int maxParticleSize;
        private final int minParticleSize;
        private final int particleColor;
        private int alpha = 0xFF;
        private ColorFilter colorFilter;

        private SparkleBadgeDrawable(Drawable icon, boolean darkTheme, int width, int height, int iconSize, int maxParticleSize, int minParticleSize) {
            this.icon = icon;
            this.width = width;
            this.height = height;
            this.iconSize = iconSize;
            this.maxParticleSize = Math.max(maxParticleSize, AndroidUtilities.dp(2));
            this.minParticleSize = Math.max(1, minParticleSize);
            this.particleColor = darkTheme ? Color.WHITE : 0xFF111111;
            particlePaint.setStrokeCap(Paint.Cap.ROUND);
        }

        @Override
        public void draw(@NonNull Canvas canvas) {
            Rect bounds = getBounds();
            long now = SystemClock.uptimeMillis();
            int left = bounds.left + (bounds.width() - iconSize) / 2;
            int top = bounds.top + (bounds.height() - iconSize) / 2;
            icon.setBounds(left, top, left + iconSize, top + iconSize);
            icon.setAlpha(alpha);
            icon.setColorFilter(colorFilter);
            icon.draw(canvas);
            drawParticles(canvas, bounds, now);
            invalidateSelf();
        }

        private void drawParticles(Canvas canvas, Rect bounds, long now) {
            float centerX = bounds.exactCenterX();
            float centerY = bounds.exactCenterY();
            float baseRadius = iconSize * 0.28f;
            for (int i = 0; i < 10; i++) {
                long seed = 197L * (i + 3L);
                float progress = ((now + seed) % 1900L) / 1900f;
                float lifecycle = getLifecycle(progress);
                float angle = (float) (((seed * 0.137f) % (Math.PI * 2.0)) + Math.sin((now + seed * 3L) / 520.0) * 0.35f);
                float drift = baseRadius + AndroidUtilities.dp(0.6f) + progress * AndroidUtilities.dp(4f);
                float x = centerX + (float) Math.cos(angle) * drift;
                float y = centerY + (float) Math.sin(angle) * (drift * 0.72f) - progress * AndroidUtilities.dp(1.6f);
                float size = minParticleSize + (maxParticleSize - minParticleSize) * (0.18f + 0.42f * lifecycle);
                int particleAlpha = (int) (alpha * (0.03f + 0.18f * lifecycle));
                particlePaint.setColor(particleColor);
                particlePaint.setAlpha(Math.max(0, Math.min(255, particleAlpha)));
                float arm = size * 0.55f;
                float armDiag = arm * 0.7f;
                particlePaint.setStrokeWidth(Math.max(0.7f, size * 0.16f));
                canvas.drawLine(x - arm, y, x + arm, y, particlePaint);
                canvas.drawLine(x, y - arm, x, y + arm, particlePaint);
                particlePaint.setStrokeWidth(Math.max(0.55f, size * 0.1f));
                canvas.drawLine(x - armDiag, y - armDiag, x + armDiag, y + armDiag, particlePaint);
                canvas.drawLine(x - armDiag, y + armDiag, x + armDiag, y - armDiag, particlePaint);
            }
        }

        private float getLifecycle(float progress) {
            if (progress <= 0.2f) {
                return easeInOut(progress / 0.2f);
            } else if (progress >= 0.72f) {
                return easeInOut((1f - progress) / 0.28f);
            }
            return 1f;
        }

        private float easeInOut(float value) {
            value = Math.max(0f, Math.min(1f, value));
            return value * value * (3f - 2f * value);
        }

        @Override
        public void setAlpha(int alpha) {
            this.alpha = alpha;
            invalidateSelf();
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }

        @Override
        public int getOpacity() {
            return PixelFormat.TRANSLUCENT;
        }

        @Override
        public int getIntrinsicWidth() {
            return width;
        }

        @Override
        public int getIntrinsicHeight() {
            return height;
        }
    }
}
