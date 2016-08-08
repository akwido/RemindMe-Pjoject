package w72016.com.remindme.fragments;

import android.app.Fragment;
import android.content.Context;
import android.view.View;

/**
 * Created by 2016W7 on 08.08.2016.
 */
public class AbstractTabFragment extends Fragment {


   protected Context context;
    private static  String TITLE;
    protected  View view;

    //----------------------------------------------------------
    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public  String getTITLE() {
        return TITLE;
    }

    public  void setTITLE(String TITLE) {
        ExempleFragment.TITLE = TITLE;
    }
    //----------------------------------------------------------
}
