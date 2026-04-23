package space.axolab.axogram.ui.Components;

import android.view.View;

import space.axolab.axogram.ImageReceiver;

public interface AttachableDrawable {
    void onAttachedToWindow(ImageReceiver parent);
    void onDetachedFromWindow(ImageReceiver parent);

    default void setParent(View view) {}
}
