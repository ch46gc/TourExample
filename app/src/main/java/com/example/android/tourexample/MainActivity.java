package com.example.android.tourexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

 public class MainActivity extends AppCompatActivity {


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);


         //Create the ViewPager for the list Fragments
         ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

         //Create the PagerAdapter
         PagerAdapter pagerAdapter = new TourGuidePagerAdapter(this, getSupportFragmentManager());
         //Set the PagerAdapter to the ViewPager
         viewPager.setAdapter(pagerAdapter);
         //Create the main TabLayout
         TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
         //Call the setupWithViewPager method to connect TabLayout automatically
         tabLayout.setupWithViewPager(viewPager);


     }
 }

