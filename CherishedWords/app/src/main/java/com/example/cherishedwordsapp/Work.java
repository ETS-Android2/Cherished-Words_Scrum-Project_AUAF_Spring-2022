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

public class Work extends AppCompatActivity {
    List<Integer> workimgs;
    PageCurlView workpagecurlview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_work);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Work");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        workpagecurlview = (PageCurlView) findViewById(R.id.workimgs);
        workimgs = new ArrayList<>();

        workimgs.add(R.drawable.work1);
        workimgs.add(R.drawable.work2);
        workimgs.add(R.drawable.work3);
        workimgs.add(R.drawable.work4);
        workimgs.add(R.drawable.work5);

        workpagecurlview.setCurlView(workimgs);
        workpagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}