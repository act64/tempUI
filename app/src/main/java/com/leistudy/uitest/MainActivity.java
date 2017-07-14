package com.leistudy.uitest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SugarDialView.DialNumListener {

    SugarDialView sugarDialView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sugarDialView= (SugarDialView) findViewById(R.id.sugardial);
        sugarDialView.setMdialListener(this);
    }


    @Override
    public void onDial(SugarDialView.DialObject dialObject) {
        if(dialObject.getType()== SugarDialView.DialObject.TYPE_INT){
            Toast.makeText(this,dialObject.getDialnumber()+"",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        if (sugarDialView.getVisibility()== View.VISIBLE){
            sugarDialView.hide();
        }else {
            sugarDialView.show();
        }
    }
}
