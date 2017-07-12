package com.leistudy.uitest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.leistudy.uitest.model.WeekySugarData;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tom on 2017/7/5.
 */

public class SugarTableView extends LinearLayout {

    private View view;
    private int width = 0;
    private boolean isNineColumStyle = true;
    private ArrayList<Guideline> guidelinescolum;
    private ArrayList<Guideline> guideLinesRow;
    private int coloumwith;
    private HashMap<Long, HashMap<String, WeekySugarData.DayDataListEntity.CellsEntity.QualifiedAndValueEntity>> sugarDatas;
    private ConstraintLayout constraintLayout;
    private SugarViewItem[][] sugarViewItems = new SugarViewItem[7][11];
    private float dpi;

    public boolean isNineColumStyle() {
        return isNineColumStyle;
    }

    public void setNineColumStyle(boolean nineColumStyle) {
        isNineColumStyle = nineColumStyle;
    }

    public SugarTableView(Context context) {
        super(context);
        iniView(context);
    }

    public SugarTableView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        iniView(context);
    }

    public SugarTableView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        iniView(context);
    }

    private void iniView(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.view_suagrweektable, this);
        constraintLayout = (ConstraintLayout) view.findViewById(R.id.constraint_sugartable);
        guidelinescolum = new ArrayList<>();
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime0));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime1));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime2));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime3));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime4));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime5));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime6));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime7));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime8));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime9));
        guidelinescolum.add((Guideline) constraintLayout.findViewById(R.id.linetime10));
        guideLinesRow = new ArrayList<>();
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday0));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday1));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday2));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday3));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday4));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday5));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday6));
        guideLinesRow.add((Guideline) constraintLayout.findViewById(R.id.lineday7));

        for (int row = 0; row < 7; row++)
            for (int colum = 0; colum < 11; colum++) {
                SugarViewItem sugarViewItem = new SugarViewItem(getContext());
                constraintLayout.addView(sugarViewItem);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) sugarViewItem.getLayoutParams();
                layoutParams.leftToLeft = (colum == 0 ? constraintLayout.getId() : guidelinescolum.get(colum - 1).getId());
                layoutParams.rightToRight = guidelinescolum.get(colum).getId();
                layoutParams.topToTop = guideLinesRow.get(row).getId();
                layoutParams.bottomToBottom = guideLinesRow.get(row + 1).getId();
                sugarViewItem.setLayoutParams(layoutParams);
                if (row!=2) {
                    sugarViewItem.setBackgroundColor(0xffffffff);
                }else {
                    sugarViewItem.setBackgroundColor(0xfff7f7f7);
                }
                sugarViewItems[row][colum] = sugarViewItem;
            }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e("ui", "onmeasure");
        if (width == 0) {
            width = getMeasuredWidth();
            Log.e("ui", width + "");
            coloumwith = width / 9;
            dpi = getResources().getDisplayMetrics().density;
            Log.e("dis", coloumwith + "," + dpi);
            for (int row = 0; row < 7; row++) {
                for (int colum = 0; colum < 11; colum++) {
                    sugarViewItems[row][colum].setHeightandWidth((int) (30 * dpi - 2), coloumwith - 2);
                }
            }
            sugarViewItems[2][2].setBackgroundResource(R.drawable.shadowitem);
        }
    }

    private void changeViewColumWidth() {

        int last = 0;
        for (int i = 0; i < 11; i++) {
            Guideline guideline = guidelinescolum.get(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) guideline.getLayoutParams();
            if (i == 0) {
                layoutParams.guideBegin = coloumwith;
            } else {
                if (isNineColumStyle && (i == 3 || i == 6 || i == 9)) {
                    layoutParams.guideBegin = last;
                } else {
                    layoutParams.guideBegin = last + coloumwith;
                }
            }
            last = layoutParams.guideBegin;
            guideline.setLayoutParams(layoutParams);

        }
        for (int i = 0; i < 7; i++) {
            if (isNineColumStyle) {
                sugarViewItems[i][3].setVisibility(GONE);
                sugarViewItems[i][6].setVisibility(GONE);
                sugarViewItems[i][9].setVisibility(GONE);
            } else {
                sugarViewItems[i][3].setVisibility(VISIBLE);
                sugarViewItems[i][6].setVisibility(VISIBLE);
                sugarViewItems[i][9].setVisibility(VISIBLE);
            }

        }
    }


    public void setIsNineColum(boolean isNineColum) {
        if (isNineColum) {
            isNineColumStyle = true;
        } else {
            isNineColumStyle = false;
        }
        if (width != 0) {
            changeViewColumWidth();
        } else {
            requestLayout();
        }
    }
}
