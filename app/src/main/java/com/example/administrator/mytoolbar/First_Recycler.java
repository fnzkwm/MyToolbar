package com.example.administrator.mytoolbar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class First_Recycler extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<ItemList> itemLists = new ArrayList<>();

    public First_Recycler(){
        itemLists.add(new ItemList(R.drawable.img1,"아디다스 운동화1","슈즈 01"));
        itemLists.add(new ItemList(R.drawable.img2,"아디다스 운동화2","슈즈 02"));
        itemLists.add(new ItemList(R.drawable.img3,"아디다스 운동화3","슈즈 03"));
        itemLists.add(new ItemList(R.drawable.img4,"아디다스 운동화4","슈즈 04"));
        itemLists.add(new ItemList(R.drawable.img1,"아디다스 운동화1","슈즈 01"));
        itemLists.add(new ItemList(R.drawable.img2,"아디다스 운동화2","슈즈 02"));
        itemLists.add(new ItemList(R.drawable.img3,"아디다스 운동화3","슈즈 03"));
        itemLists.add(new ItemList(R.drawable.img4,"아디다스 운동화4","슈즈 04"));
        itemLists.add(new ItemList(R.drawable.img1,"아디다스 운동화1","슈즈 01"));
        itemLists.add(new ItemList(R.drawable.img2,"아디다스 운동화2","슈즈 02"));
        itemLists.add(new ItemList(R.drawable.img3,"아디다스 운동화3","슈즈 03"));
        itemLists.add(new ItemList(R.drawable.img4,"아디다스 운동화4","슈즈 04"));
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        /*xml 파일을 연동하는 역할 & 각 항목에 대한 메서드(함수)를 호출한다. */
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_item, viewGroup, false);
        return new Rowcell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        /*각 항목별 배열리스트를 부여하는 기능*/
        ((Rowcell)viewHolder).itemView_item.setImageResource(itemLists.get(position).item_image);
        ((Rowcell)viewHolder).textView_title.setText(itemLists.get(position).item_subTitle);
        ((Rowcell)viewHolder).textView_sub.setText(itemLists.get(position).item_subTitle);
    }

    @Override
    public int getItemCount() {
        /*배열의 개수를 나열하는 역할*/
        return itemLists.size();
    }

    private class Rowcell extends RecyclerView.ViewHolder {

        ImageView itemView_item;
        TextView textView_title;
        TextView textView_sub;


        public Rowcell(View view) {
            super(view);
            itemView_item = (ImageView) view.findViewById(R.id.itemImageView);
            textView_title = (TextView) view.findViewById(R.id.itemTitle);
            textView_sub = (TextView) view.findViewById(R.id.itemSubTitle);

        }
    }
}
