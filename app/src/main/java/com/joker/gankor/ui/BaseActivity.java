package com.joker.gankor.ui;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.joker.gankor.utils.LazyUtil;
import com.joker.gankor.utils.NetUtil;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LazyUtil.log(getClass().getName(), "     onCreate");
        setActivityState(this);

        initView(savedInstanceState);
        initData();
    }

    public void setActivityState(Activity activity) {
//        设置 APP 只能竖屏显示
        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    protected void initData() {
    }

    protected abstract void initView(Bundle savedInstanceState);

    public boolean isNetConnect() {
        return NetUtil.isNetConnect(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        LazyUtil.log(getClass().getName(), "     onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LazyUtil.log(getClass().getName(), "     onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LazyUtil.log(getClass().getName(), "     onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LazyUtil.log(getClass().getName(), "     onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LazyUtil.log(getClass().getName(), "     onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LazyUtil.log(getClass().getName(), "     onPause");
    }
}
