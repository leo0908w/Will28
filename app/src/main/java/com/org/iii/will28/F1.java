package com.org.iii.will28;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F1 extends Fragment {
    private TextView textView;
    private String strLottery = null;
    private MainActivity main;

    public static F1 newInstance() {
        F1 fragment = new F1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        main = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f1, container, false);

        textView = (TextView) view.findViewById(R.id.text1);
        if (strLottery != null){
            textView.setText(strLottery);
        }

        View btn = view.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doBtn();
            }
        });

        View btn2 = view.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doBtn2();
            }
        });

        return view;
    }

    private void doBtn() {
        Log.v("will", "f1...");
        strLottery = "Lottery: " + (int)(Math.random()*49+1);
        textView.setText(strLottery);
//        textView.setText((int) (Math.random() * 49));
    }

    private void doBtn2(){
        //main.changeTitle();
        //main.change(null);
        main.getF2().changeF2Mesg(strLottery);
    }
}
