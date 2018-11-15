package com.example.administrator.mytoolbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_fragment, container, false);

        RecyclerView view = (RecyclerView) v.findViewById(R.id.main_recyclerView);
        //리사이클러(아이템)을 넣는 대상을 변수로 지정
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        //프래그먼트의 경우 실존하는 액티비티를 갖고 있지 않기 때문에 가상의 메모리에형태를 저장하게 되는데,
        //프래그먼트에서는 실제 현재의 액티비티를 가져와서 생성자를 형성해야 한다. (프래그먼트에서 생성자를 호출시 반드시 getActivity()를 작성해서 그 구성요소를 만들어야 한다.)
        First_Recycler firstRecycler = new First_Recycler();
        //클래스 인자를 가져와서 생성하겠다는 의미
        view.setLayoutManager(layoutManager);
        //전체 리사이클러 뷰를 하나의 구성 공간으로 세팅
        view.setAdapter(firstRecycler);
        //각각의 아이템에 대한 배열리스트를 항목별로 진행하겠다는 의미


        return v;
    }
}
