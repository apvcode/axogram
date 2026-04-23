package space.axolab.axogram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import space.axolab.axogram.ui.ActionBar.BaseFragment;
import space.axolab.axogram.ui.Components.SizeNotifierFrameLayout;

public class EmptyBaseFragment extends BaseFragment {

    @Override
    public View createView(Context context) {
        return fragmentView = new SizeNotifierFrameLayout(context);
    }

}
