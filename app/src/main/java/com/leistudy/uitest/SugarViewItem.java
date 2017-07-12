package com.leistudy.uitest;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.leistudy.uitest.model.WeekySugarData.DayDataListEntity.CellsEntity;

import com.leistudy.uitest.model.WeekySugarData;

import java.util.Random;

/**
 * Created by tom on 2017/7/5.
 */

public class SugarViewItem extends RelativeLayout {
    private View mainView;
    private boolean isRecommend=false;
    private ImageView ivBigBluePoint;
    private ImageView ivLittleBluePoint;
    private ImageView ivremark;
    private View rlValContent;
    private ImageView ivAddmark;
    private TextView tvVal;
    private WeekySugarData.DayDataListEntity.CellsEntity mCellsEntity;

    public SugarViewItem(Context context) {
        super(context);
        iniView(context);
    }

    public SugarViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        iniView(context);
    }

    public SugarViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        iniView(context);
    }

    private void iniView(Context context){
        mainView= LayoutInflater.from(context).inflate(R.layout.item_sugarview,this);
        mainView.setBackgroundColor(0xfffcfcfc);
        ivBigBluePoint= (ImageView) mainView.findViewById(R.id.iv_bigblue_point);
        ivLittleBluePoint= (ImageView) mainView.findViewById(R.id.iv_little_blue);
        ivremark= (ImageView) mainView.findViewById(R.id.iv_remark);
        rlValContent=mainView.findViewById(R.id.rl_contentMain);
        ivAddmark= (ImageView) mainView.findViewById(R.id.iv_add);
        tvVal= (TextView) mainView.findViewById(R.id.tv_val);
        //test
        Random ran=new Random();
        boolean isnull = ran.nextBoolean();
        if (!isnull){
            CellsEntity cellsEntity=new CellsEntity();
            cellsEntity.setRecommended( ran.nextBoolean());
            cellsEntity.setComment(ran.nextBoolean()?"sadfasfaf":null);
            cellsEntity.setQualifiedAndValue(new CellsEntity.QualifiedAndValueEntity());
            cellsEntity.getQualifiedAndValue().setValue(ran.nextInt(2)*11);
            setSugardataBing(cellsEntity);
        }else {
            setSugardataBing(null);
        }
        //endtest
    }

    public void setSugardataBing(CellsEntity celldata){
        mCellsEntity=celldata;
        setitemViewState();
    }

    public void setHeightandWidth(int height,int width){
        ViewGroup.LayoutParams layoutParams = mainView.getLayoutParams();
        layoutParams.width=width;
        layoutParams.height=height;
        mainView.setLayoutParams(layoutParams);
    }

    private void setitemViewState(){
        if (mCellsEntity==null){
            ivAddmark.setVisibility(VISIBLE);
            rlValContent.setVisibility(GONE);
            ivremark.setVisibility(GONE);
            ivBigBluePoint.setVisibility(GONE);
        }else {
            if (mCellsEntity.isRecommended()){
                if (mCellsEntity.getQualifiedAndValue()!=null&&mCellsEntity.getQualifiedAndValue().getValue()>0){
                    rlValContent.setVisibility(VISIBLE);
                    ivAddmark.setVisibility(GONE);
                    ivBigBluePoint.setVisibility(GONE);
                    tvVal.setVisibility(VISIBLE);
                    ivLittleBluePoint.setVisibility(VISIBLE);
                    tvVal.setText(String.format("%.1f",mCellsEntity.getQualifiedAndValue().getValue()));
                }else {
                    ivAddmark.setVisibility(GONE);
                    rlValContent.setVisibility(GONE);
                    ivBigBluePoint.setVisibility(VISIBLE);
                }
            }else {
                if (mCellsEntity.getQualifiedAndValue()!=null&&mCellsEntity.getQualifiedAndValue().getValue()>0){
                    rlValContent.setVisibility(VISIBLE);
                    ivAddmark.setVisibility(GONE);
                    ivBigBluePoint.setVisibility(GONE);
                    tvVal.setVisibility(VISIBLE);
                    ivLittleBluePoint.setVisibility(GONE);
                    tvVal.setText(String.format("%.1f",mCellsEntity.getQualifiedAndValue().getValue()));
                }else {
                    ivAddmark.setVisibility(VISIBLE);
                    rlValContent.setVisibility(GONE);
                    ivBigBluePoint.setVisibility(GONE);
                }
            }
            if (TextUtils.isEmpty(mCellsEntity.getComment())){
                ivremark.setVisibility(GONE);
            }else {
                ivremark.setVisibility(VISIBLE);
            }
        }
    }
}
