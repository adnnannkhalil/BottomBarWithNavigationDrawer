package com.example.adnan.bottombarwithnavigationdrawer.DashBoard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adnan.bottombarwithnavigationdrawer.R;

/**
 * Created by Adnan on 9/13/2017.
 */

public class RecentAdFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}
