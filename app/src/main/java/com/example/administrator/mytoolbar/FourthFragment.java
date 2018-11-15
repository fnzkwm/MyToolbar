package com.example.administrator.mytoolbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class FourthFragment extends Fragment {

    View view;
    ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fourth_fragment, container, false);

        changeView(0); //첫 화면에 첫번째 이미지를 보여준다.

        Button btn_img1 = (Button) view.findViewById(R.id.map_btn1);
        btn_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(0);
            }
        });

        Button btn_img2 = (Button) view.findViewById(R.id.map_btn2);
        btn_img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(1);
            }
        });

        return view;

    }

    private void changeView(int index){
        RelativeLayout view_img01 = (RelativeLayout) view.findViewById(R.id.map_view1);
        RelativeLayout view_img02 = (RelativeLayout) view.findViewById(R.id.map_view2);


        /* 스위치문으로 대입 들어올때 VISIBLE(보여주기), INVISIBLE(숨기기)  */
        switch (index){
            case 0 :
                view_img01.setVisibility(View.VISIBLE);
                view_img02.setVisibility(View.INVISIBLE);
                break;
            case 1 :
                view_img01.setVisibility(View.INVISIBLE);
                view_img02.setVisibility(View.VISIBLE);
                break;
        }

    }

}
