package com.example.cherishedwordsapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class StuLife extends AppCompatActivity {

    List<Integer> imgs;
    PageCurlView stupagecurlview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_stu_life);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Student Life");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        stupagecurlview = (PageCurlView) findViewById(R.id.imgs);
        imgs = new ArrayList<>();

        imgs.add(R.drawable.stu1);
        imgs.add(R.drawable.stu2);
        imgs.add(R.drawable.stu3);
        imgs.add(R.drawable.stu4);
        imgs.add(R.drawable.stu5);

        stupagecurlview.setCurlView(imgs);
        stupagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}