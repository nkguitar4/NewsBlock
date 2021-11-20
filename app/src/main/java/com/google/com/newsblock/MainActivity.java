package com.google.com.newsblock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,mtech,mentertainment,msports;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api= "6659c7ab3bae4b9bb7dca985820b76f1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome = findViewById(R.id.home);
        mscience = findViewById(R.id.science);
        msports = findViewById(R.id.sports);
        mtech = findViewById(R.id.technology);
        mentertainment = findViewById(R.id.entertainment);
        mhealth = findViewById(R.id.health);


        ViewPager viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.include);

        /* Set the pager adapter first */
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 7);
        viewPager.setAdapter(pagerAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5||tab.getPosition()==6)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
     viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}