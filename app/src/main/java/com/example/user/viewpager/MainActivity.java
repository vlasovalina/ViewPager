package com.example.user.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CustomAdapter  customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.pager);
        customAdapter=new CustomAdapter(this);
        viewPager.setAdapter(customAdapter);

        CirclePageIndicator circleIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        circleIndicator.setSnap(true);
        circleIndicator.setViewPager(viewPager);


    }
}

