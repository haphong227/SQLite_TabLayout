package com.example.sqlite_tablayout.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.sqlite_tablayout.fragment.FragmentHistory;
import com.example.sqlite_tablayout.fragment.FragmentHome;
import com.example.sqlite_tablayout.fragment.FragmentSearch;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int numPage;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numPage=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FragmentHome();
            case 1:return new FragmentHistory();
            case 2:return new FragmentSearch();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numPage;
    }
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:return "Home";
            case 1:return "History";
            case 2:return "Search";

        }
        return null;
    }
}
