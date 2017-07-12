package com.leistudy.uitest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;

public class MainActivity extends AppCompatActivity {

    SugarTableView sugarTableView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sugarTableView= (SugarTableView) findViewById(R.id.sugartable);
        sugarTableView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                sugarTableView.setIsNineColum(false);
                sugarTableView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (sugarTableView.isNineColumStyle()){
            sugarTableView.setIsNineColum(false);
        }else {
            sugarTableView.setIsNineColum(true);
        }
    }
}
