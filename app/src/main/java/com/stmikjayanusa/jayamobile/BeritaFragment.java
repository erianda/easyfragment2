package com.stmikjayanusa.jayamobile;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BeritaFragment extends Fragment {
    String[] listArray={"Prodi Sistem Informasi berhasil mendapatkan Akreditasi B BAN PT",
            "Mahasiswa Sistem Komputer Menciptakan Alat Pendeteksi Kebohongan","Jalan Sehat Ulang" +
            " Tahun Stmik Jayanusa","Lomba Futsal di Juarai SK 2014","Studi Tur Ke Malaka 2016",
            "Pembayaran Uang Kuliah Semester Ganjil","Beasiswa Mahasiswa Akan Segera di Cairkan",
            "Inilah mahasiswa STMIK Jayanusa yang berprestasi tingkat Nasional "};
	public BeritaFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_berita, container, false);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),R.layout.activity_listview, listArray);
        ListView listview =(ListView) rootView.findViewById(R.id.listView1);
        listview.setAdapter(adapter);




        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                FragmentTransaction tx = getFragmentManager().beginTransaction();
                final String[] fragments ={
                        "com.stmikjayanusa.jayamobile.Berita"};
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
