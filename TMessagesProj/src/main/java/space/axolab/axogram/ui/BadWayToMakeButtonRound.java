package space.axolab.axogram.ui;

import android.view.View;

import space.axolab.axogram.utils.ViewOutlineProviderImpl;

public class BadWayToMakeButtonRound {
    public static void round(View view) {
        view.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
        view.setClipToOutline(true);
    }
}
