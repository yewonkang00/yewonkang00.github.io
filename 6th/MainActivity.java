package com.example.a6th;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View view){
        // LENGTH_LONG : 길게 화면에 나타남 // LENGTH_SHORT : 짧게 화면에 나타남
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yewonkang00.github.io/"));
        startActivity(intent);

    }
    // 웹 페이지 띄우기
    public void onButton2Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kim-jeongmin.github.io/"));
        startActivity(intent);
    }

    public void onButton3Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seongbinyoon.github.io/"));
        startActivity(intent);
    }

}
