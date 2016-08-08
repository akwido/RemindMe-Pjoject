package w72016.com.remindme.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import w72016.com.remindme.R;


public class ExempleFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_example;

    private View view;


    ExempleFragmen() {

    }

    public static ExempleFragment getInstance() {
        Bundle args = new Bundle();
        ExempleFragment fragment = new ExempleFragment();
        fragment.setArguments(args); // установить фрагменту сахраненные данные

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
