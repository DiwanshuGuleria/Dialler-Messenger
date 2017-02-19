package com.example.user.diallermessenger;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewpager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tablayout = (TabLayout)findViewById(R.id.tablayout);
        viewpager = (ViewPager)findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragments(new Contacts(),"Contacts");
        viewPagerAdapter.AddFragments(new Sms(),"Sms");
        viewpager.setAdapter(viewPagerAdapter);
        tablayout.setupWithViewPager(viewpager);

    }
}
