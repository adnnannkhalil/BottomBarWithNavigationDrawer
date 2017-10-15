package com.example.adnan.bottombarwithnavigationdrawer.DashBoard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adnan.bottombarwithnavigationdrawer.Adapters.ViewPagerAdapter;
import com.example.adnan.bottombarwithnavigationdrawer.R;

import java.util.ArrayList;

/**
 * Created by Adnan on 9/13/2017.
 */

public class TabsFragment extends Fragment {

    ViewPager viewPager;

    public static TabsFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        TabsFragment firstFragment = new TabsFragment();
        firstFragment.setArguments(args);
        return firstFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabs_fragment,container,false);

        viewPager = (ViewPager) view.findViewById(R.id.pager_dashboard);

        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_maintainence);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        tabLayout.setTabTextColors(Color.parseColor("#FFCFCFCF"), Color.parseColor("#FFFFFF"));
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        adapter.addFrag(new StatInfoFragment(), "STATS INFO", null);
        adapter.addFrag(new RecentAdFragment(), "RECENT AD", null);
        adapter.addFrag(new TotalAdsFragment(), "TOTAL ADS", null);

        viewPager.setAdapter(adapter);
    }
}
