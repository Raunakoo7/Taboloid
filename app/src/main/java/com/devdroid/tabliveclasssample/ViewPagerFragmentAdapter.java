package com.devdroid.tabliveclasssample;

import com.devdroid.tabliveclasssample.fragments.AFragment;
import com.devdroid.tabliveclasssample.fragments.BFragment;
import com.devdroid.tabliveclasssample.fragments.CFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerFragmentAdapter extends FragmentPagerAdapter {

    public ViewPagerFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new AFragment();
        } else if (position==1) {
            return new BFragment();
        } else {
            return new CFragment();
        }
    }

    @Override
    public int getCount() {
        return 3; //no of tabs
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "A Frag";
        } else if (position==1){
            return "B Frag";
        } else {
            return "C Frag";
        }
    }
}
