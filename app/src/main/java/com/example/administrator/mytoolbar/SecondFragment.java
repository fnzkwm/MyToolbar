package com.example.administrator.mytoolbar;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);

        Button btnFragment1 = (Button) view.findViewById(R.id.move_first_btn);
        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main_frameLayout, new FirstFragment());
                fr.commit();

            }
        });


        Button btnFragment2 = (Button) view.findViewById(R.id.move_third_btn);
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main_frameLayout, new ThirdFragment());
                fr.commit();

            }
        });



        return view;
    }
}
