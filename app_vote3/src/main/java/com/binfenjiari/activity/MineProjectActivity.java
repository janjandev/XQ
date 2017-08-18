package com.binfenjiari.activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.binfenjiari.R;
import com.binfenjiari.fragment.ProjectListFragment;
import com.biu.modulebase.common.base.ContentActivity;

/**
 * @author tangjin
 * @Title: {标题}
 * @Description:{描述}
 * @date 2017/6/15
 */
public class MineProjectActivity extends ContentActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected int getContentView() {
        setBackNavigationIcon();
        return R.layout.activity_tablayout_viewpage;
    }

    @Override
    protected String getToolbarTitle() {
        return "我的课题";
    }

    @Override
    protected void setViewData() {

        tabLayout = (TabLayout) findViewById(R.id.tablayout_title);
        viewPager = (ViewPager) findViewById(R.id.viewpager_content);

        ViewPagerAdapter mIcanPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mIcanPagerAdapter);
//        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);
//        viewPager.setCurrentItem(posi);
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        String[] names = {"未发表", "已发表"};

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ProjectListFragment.newInstance();
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return names[position];
        }
    }

    public static void beginActivity(Context context) {
        Intent intent = new Intent(context, MineProjectActivity.class);
        context.startActivity(intent);

    }

}
