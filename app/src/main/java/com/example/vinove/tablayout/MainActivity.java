package com.example.vinove.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(), "ITEM ONE");
        adapter.addFragment(new TwoFragment(), "ITEM TWO ");
        adapter.addFragment(new ThreeFragment(), "ITEM THREE");
        adapter.addFragment(new FourFragment(), "ITEM FOUR");
        adapter.addFragment(new FiveFragment(), "ITEM FIVE");
        adapter.addFragment(new SixFragment(), "ITEM SIX");
        adapter.addFragment(new SevenFragment(), "ITEM SEVEN");
        adapter.addFragment(new EightFragment(), "ITEM EIGHT");
        adapter.addFragment(new NineFragment(), "ITEM NINE");
        adapter.addFragment(new TenFragment(), "ITEM TEN");

        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);
/*
        tabLayout.getTabAt(0).setIcon(R.drawable.account);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart);*/

    }
}
