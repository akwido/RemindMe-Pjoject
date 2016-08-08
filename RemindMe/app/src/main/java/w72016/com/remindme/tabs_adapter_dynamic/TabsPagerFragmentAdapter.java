package w72016.com.remindme.tabs_adapter_dynamic;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import w72016.com.remindme.fragments.ExempleFragment;

/**
 * Created by 2016W7 on 08.08.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab1",
                "reMemeber",
                "Tab2"
        };
    }

    @Override
    public Fragment getItem(int position) {
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
        return null;
    }

    @Override
    public int getCount() {
        return tabs.lenght;
    }
}
