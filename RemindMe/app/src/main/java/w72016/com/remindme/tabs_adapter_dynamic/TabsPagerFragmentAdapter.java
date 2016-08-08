package w72016.com.remindme.tabs_adapter_dynamic;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import w72016.com.remindme.fragments.AbstractTabFragment;
import w72016.com.remindme.fragments.ExempleFragment;

/**
 * Created by 2016W7 on 08.08.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

   // private String[] tabs;
   // private Map<Integer,Fragment> tabs;
    private Map<Integer,AbstractTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        /*
        tabs = new String[]{
                "Tab1",
                "reMemeber",
                "Tab2"
        };
        */
        this.context = context;
       // tabs.put(0,ExempleFragment.getInstance(context));
      //  tabs.put(1,context.getString(R.string.tab_item_history));
      //  tabs.put(2,context.getString(R.string.tab_item_history));

        initTabsMap(context);
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0,ExempleFragment.getInstance(context));
        tabs.put(1,context.getString(R.string.tab_item_history));
        tabs.put(2,context.getString(R.string.tab_item_history));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position); // получить title по ключу
    }

    @Override
    public Fragment getItem(int position) {
        /*
        switch (position)
        {
            case 0:
                return ExempleFragment.getInstance();
               // break;
            case 1:
                //break;
            return ExempleFragment.getInstance();
            case 2:
                //break;
                return ExempleFragment.getInstance();
        }

        tab.get(position);
        */
        return tabs.get(position); // получить по позиции нужный фрагмент
    }

    @Override
    public int getCount() {
       // return tabs.lenght;
        return tabs.size();
    }
}
