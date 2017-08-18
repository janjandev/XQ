package com.biu.modulebase.binfenjiari.activity;

import android.support.v4.app.Fragment;

import com.biu.modulebase.binfenjiari.fragment.AboutFragment;
import com.biu.modulebase.common.base.BaseActivity;

/**
 * @author Lee
 * @Title: {标题}
 * @Description:{描述}
 * @date 2016/4/14
 */
public class AboutActivity extends BaseActivity {
    @Override
    protected Fragment getFragment() {
        return new AboutFragment();
    }

    @Override
    protected String getToolbarTitle() {
        return "关于";
    }
}
