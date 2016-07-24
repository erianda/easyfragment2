package com.stmikjayanusa.jayamobile;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DosenDetailFragment extends Fragment {

    public DosenDetailFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_dosen_detail_fragment, container, false);

        return rootView;
    }
}
