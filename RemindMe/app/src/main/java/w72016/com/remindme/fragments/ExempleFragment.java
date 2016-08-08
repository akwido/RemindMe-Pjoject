package w72016.com.remindme.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import w72016.com.remindme.R;


public class ExempleFragment extends AbstractTabFragmen{

    private static final int LAYOUT = R.layout.fragment_example;
   // private static  String TITLE = R.layout.fragment_example;
    /* вынесенов в абстрактный фрагмент
   private static  String TITLE;
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
    */
   // private Context context;
   // private View view;


    ExempleFragmen() {

    }

    public static ExempleFragment getInstance(Context context) {

        //this.context = context;

        Bundle args = new Bundle();
        ExempleFragment fragment = new ExempleFragment();
        fragment.setArguments(args); // установить фрагменту сахраненные данные
        fragment.setContext(context);
        fragment.setTITLE(context.getString(R.string.tab_item_history));

        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstanceState){

        view = inflater(LAYOUT,container,false);


        return view;
          //return super.onCreateView(inflater,container,savedInstanceState);
    }


}
