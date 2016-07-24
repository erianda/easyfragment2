package com.stmikjayanusa.jayamobile;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Dosen extends Fragment {

    String[] listArray={"RAHADIAN AULIA FIRDA","HADDAD SAMIR","NOVINALDI","KHAIRIL HAMDI","TOMI " +
            "LOVERI","WIRA BUANA"};


    public Dosen(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_dosen, container, false);

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),R.layout.activity_listview, listArray);
        ListView listview =(ListView) rootView.findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                FragmentTransaction tx = getFragmentManager().beginTransaction();
                final String[] fragments ={
                        "com.stmikjayanusa.jayamobile.DosenDetailFragment"};
                tx.replace(R.id.frame_container, Fragment.instantiate(getActivity(), fragments[0] ));
                tx.commit();

            }
            @SuppressWarnings("unused")
            public void onClick(View v){
            };
        });


        return rootView;
    }




}
