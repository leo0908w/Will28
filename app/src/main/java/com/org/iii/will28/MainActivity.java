package com.org.iii.will28;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private F1 f1;
    private F2 f2;
    private boolean isF2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = F1.newInstance();
        f2 = new F2();

        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void change(View v) {
        isF2 = !isF2;

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, isF2?f2:f1);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public F1 getF1() { return f1; }
    public F2 getF2() { return f2; }
}
