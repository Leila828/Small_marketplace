package com.example.mytp2application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionStatePageAdapter extends FragmentStatePagerAdapter {
    public final List<Fragment> mFragmentList = new ArrayList<>();
    public final List<String> mFragmentTitreList = new ArrayList<>();

    public SectionStatePageAdapter(FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment,String title){
        mFragmentList.add(fragment);
        mFragmentTitreList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
