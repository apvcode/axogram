package space.axolab.axogram.ui;

import android.content.Context;
import android.view.View;

import space.axolab.axogram.MessagesController;
import space.axolab.axogram.R;
import space.axolab.axogram.ui.ActionBar.ActionBar;
import space.axolab.axogram.ui.ActionBar.BaseFragment;
import space.axolab.axogram.ui.ActionBar.Theme;
import space.axolab.axogram.ui.Components.UItem;
import space.axolab.axogram.ui.Components.UniversalAdapter;
import space.axolab.axogram.ui.Components.UniversalRecyclerView;

import java.util.ArrayList;

public class AxoGramEmptyFragment extends BaseFragment {
    private static final int ID_COLLAPSE_SETTINGS_TABS = 1;
    private static final String PREF_COLLAPSE_SETTINGS_TABS = "axogram_collapse_settings_tabs";

    private UniversalRecyclerView listView;

    @Override
    public View createView(Context context) {
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setTitle("AxoGram");
        actionBar.setAllowOverlayTitle(true);
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });

        listView = new UniversalRecyclerView(this, this::fillItems, null, null);
        listView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        listView.setOnItemClickListener((view, position, x, y) -> {
            UItem item = listView.adapter.getItem(position);
            if (item == null) {
                return;
            }
            if (item.id == ID_COLLAPSE_SETTINGS_TABS) {
                final boolean enabled = !MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean(PREF_COLLAPSE_SETTINGS_TABS, enabled).apply();
                item.checked = enabled;
                listView.adapter.update(true);
            }
        });

        fragmentView = listView;
        return fragmentView;
    }

    private void fillItems(ArrayList<UItem> items, UniversalAdapter adapter) {
        items.add(UItem.asCheck(ID_COLLAPSE_SETTINGS_TABS, "Сворачивать нижнюю панель в настройках")
                .setChecked(MessagesController.getGlobalMainSettings().getBoolean(PREF_COLLAPSE_SETTINGS_TABS, true)));
        items.add(UItem.asShadow("Если выключить, нижняя панель в настройках останется видимой как раньше."));
    }
}
