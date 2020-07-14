package com.devdroid.tabliveclasssample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tab;
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

        ViewPagerFragmentAdapter adapter = new ViewPagerFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tab.setupWithViewPager(viewPager); //setting tab for viewPager
    }
}