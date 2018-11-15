package com.example.administrator.mytoolbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    private String [] text_arr = {"슬라이드01","슬라이드02","슬라이드03","슬라이드04"};

    /*Constructor 이용*/
    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    /*PagerAdapter에 커서 대고 Alt + Enter 이용*/
    @Override
    public int getCount() {
        /*배열의 개수를 반환*/
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        /*객체화된 데이터 값을 보여주겠다는 의미*/
        return view == object;
    }

    /*alt + insert 로 찾기*/

    /*아이템을 메모리에 저장*/
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.viewpager_slide, null); //대상물을 가져오겠다는 역할

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);    //인플레이트된 부분을  인지값을 정의
        TextView textView = (TextView) view.findViewById(R.id.textView);

        imageView.setImageResource(images[position]);   //배열 데이터를 지정된 곳에 넣어주겠다는 것을 의미

        //String text = (position + 1) + "/" + images.length; //1부터 시작하겠다.
        textView.setText(text_arr[position]);

        ViewPager vp = (ViewPager) container;   //containter은 지정된 곳에 담겠다는 의미
        vp.addView(view, 0);    //모든 배열을 추가하겠다는 것을 의미 (최초의 배열 데이터부터 맞디막 배열까지...)

        return view;
    }


    /*alt + insert 로 찾기*/
    /*인스턴트화 한다는 것 자체가 안드로이드 시스템에서 메모리 공간을 차지하게 되는데, 실제 사용하지 않는 메모리는 제거해야 합니다. 종료 역할을 하게 됨*/
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }

}
