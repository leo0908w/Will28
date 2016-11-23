package com.org.iii.will28;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F2 extends Fragment {
    private TextView textView;
    private String strMesg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f2, container, false);
        textView = (TextView)view.findViewById(R.id.text2);
        if (strMesg != null){
            textView.setText(strMesg);
        }
        return view;
    }

    public void changeF2Mesg(String newMesg){
        strMesg = newMesg;
    }
}
