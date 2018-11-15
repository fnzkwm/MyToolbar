package com.example.administrator.mytoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler; //인트로를 만들 import 직접 쓰기

public class IntroActivity extends AppCompatActivity {

    private Handler handler;


    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        init(); //정의 해주기
        handler.postDelayed(runnable, 1500); //인트로 페이지 지속시간
    }

    private void init() {
        handler = new Handler();
    }

    /*alt + insert onBack 로 찾기*/
    /*앱이 실행되면서 발생한 안드로이드 시스템 러닝 (runnable)을 동작을 제거한다. 메모리 과부하 방지*/
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        handler.removeCallbacks(runnable);
    }
}
