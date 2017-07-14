package com.leistudy.uitest;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

import java.util.Queue;

/**
 * Created by tom on 2017/7/14.
 */

public class SugarDialView extends RelativeLayout implements View.OnClickListener, Animation.AnimationListener {


    private TranslateAnimation mShowAction;
    private TranslateAnimation mHiddenAction;
    private boolean isAni=false;

    @Override
    public void onAnimationStart(Animation animation) {
        isAni=true;
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        isAni=false;
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    public class DialObject {
        public static final String TYPE_INT = "typeint";
        public static final String TYPE_POINT = "typepoint";
        public static final String TYPE_DEL = "typedel";
        public static final String TYPE_OK = "typeok";

        private int dialnumber;
        private String type;

        public int getDialnumber() {
            return dialnumber;
        }

        public void setDialnumber(int dialnumber) {
            this.dialnumber = dialnumber;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public interface DialNumListener {
        void onDial(DialObject dialObject);
    }

    private View mainView;
    private DialNumListener mdialListener;
    public SugarDialView(Context context) {
        super(context);
        iniView(context);
    }

    public SugarDialView(Context context, AttributeSet attrs) {
        super(context, attrs);
        iniView(context);
    }

    public SugarDialView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        iniView(context);
    }

    private void iniView(Context context) {
        mainView = LayoutInflater.from(context).inflate(R.layout.item_inputnum, this);
        findViewById(R.id.tv_input0).setOnClickListener(this);
        findViewById(R.id.tv_input1).setOnClickListener(this);
        findViewById(R.id.tv_input2).setOnClickListener(this);
        findViewById(R.id.tv_input3).setOnClickListener(this);
        findViewById(R.id.tv_input4).setOnClickListener(this);
        findViewById(R.id.tv_input5).setOnClickListener(this);
        findViewById(R.id.tv_input6).setOnClickListener(this);
        findViewById(R.id.tv_input7).setOnClickListener(this);
        findViewById(R.id.tv_input8).setOnClickListener(this);
        findViewById(R.id.tv_input9).setOnClickListener(this);
        findViewById(R.id.tv_inputpoint).setOnClickListener(this);
        findViewById(R.id.tv_inputdel).setOnClickListener(this);
        findViewById(R.id.tv_ok).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DialObject dialObject = new DialObject();
        switch (v.getId()) {
            case R.id.tv_input0:
                dialObject.setDialnumber(0);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input1:
                dialObject.setDialnumber(1);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input2:
                dialObject.setDialnumber(2);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input3:
                dialObject.setDialnumber(3);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input4:
                dialObject.setDialnumber(4);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input5:
                dialObject.setDialnumber(5);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input6:
                dialObject.setDialnumber(6);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input7:
                dialObject.setDialnumber(7);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input8:
                dialObject.setDialnumber(8);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_input9:
                dialObject.setDialnumber(9);
                dialObject.setType(DialObject.TYPE_INT);
                break;
            case R.id.tv_inputpoint:
                dialObject.setType(DialObject.TYPE_POINT);
                break;
            case R.id.tv_inputdel:
                dialObject.setType(DialObject.TYPE_DEL);
                break;
            case R.id.tv_ok:
                dialObject.setType(DialObject.TYPE_OK);
                break;
        }
        if (!TextUtils.isEmpty(dialObject.getType())&&mdialListener!=null){
            mdialListener.onDial(dialObject);
        }

    }

    public DialNumListener getMdialListener() {
        return mdialListener;
    }

    public void setMdialListener(DialNumListener mdialListener) {
        this.mdialListener = mdialListener;
    }

    public void hide(){
        if (isAni||getVisibility()==GONE)return;
        if (mHiddenAction==null) {
            mHiddenAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF,
                    0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                    Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                    1.0f);
            mHiddenAction.setDuration(150);
            mHiddenAction.setAnimationListener(this);
        }
        startAnimation(mHiddenAction);
        setVisibility(GONE);
    }
    public void show(){
        if (isAni||getVisibility()==VISIBLE)return;
        if (mShowAction==null) {
            mShowAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                    Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                    1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
            mShowAction.setDuration(150);
            mShowAction.setAnimationListener(this);

        }
        startAnimation(mShowAction);
        setVisibility(VISIBLE);
    }
}
