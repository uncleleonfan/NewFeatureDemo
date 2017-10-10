package com.example.leon.newfeaturedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Leon on 0010.
 */

public class TabLayoutActivity extends AppCompatActivity {

    private static final String[] TITLES = {"Volley", "OKhttp", "Retrofit"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(mPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private PagerAdapter mPagerAdapter = new PagerAdapter() {
        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView textView = new TextView(TabLayoutActivity.this);
            textView.setText(TITLES[position]);
            textView.setGravity(Gravity.CENTER);
            container.addView(textView);
            return textView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }
    };
}
