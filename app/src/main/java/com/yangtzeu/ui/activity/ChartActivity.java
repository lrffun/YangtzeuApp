package com.yangtzeu.ui.activity;

import android.os.Bundle;

import com.blankj.utilcode.util.ScreenUtils;
import com.yangtzeu.R;
import com.yangtzeu.entity.GradeBean;
import com.yangtzeu.presenter.ChartPresenter;
import com.yangtzeu.ui.activity.base.BaseActivity;
import com.yangtzeu.ui.view.ChartView;
import com.yangtzeu.utils.MyUtils;

import java.util.List;

import androidx.appcompat.widget.Toolbar;
import lecho.lib.hellocharts.view.LineChartView;


public class ChartActivity extends BaseActivity implements ChartView {

    private List<GradeBean> datas;
    private Toolbar toolbar;
    private LineChartView mLineChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        datas = ((GradeBean) getIntent().getSerializableExtra("data")).getGradeBeans();
        super.onCreate(savedInstanceState);
        ScreenUtils.setLandscape(this);
        setContentView(R.layout.activity_chart);
        init();
        MyUtils.setToolbarBackToHome(this, toolbar);
    }

    @Override
    public void findViews() {
        toolbar = findViewById(R.id.toolbar);
        mLineChartView = findViewById(R.id.mLineChartView);

    }

    @Override
    public void setEvents() {
        ChartPresenter president = new ChartPresenter(this, this);
        president.setChart();

    }

    @Override
    public LineChartView getLineChartView() {
        return mLineChartView;
    }


    @Override
    public List<GradeBean> getData() {
        return datas;
    }
}
