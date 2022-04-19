package com.example.cherishedwordsapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class Religion extends AppCompatActivity {

    List<Integer> religionimgs;
    PageCurlView religionpagecurlview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_religion);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Religion");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        religionpagecurlview = (PageCurlView) findViewById(R.id.religionpagecurlview);
        religionimgs = new ArrayList<>();

        religionimgs.add(R.drawable.religion1);
        religionimgs.add(R.drawable.religion2);
        religionimgs.add(R.drawable.religion3);
        religionimgs.add(R.drawable.religion4);
        religionimgs.add(R.drawable.religion5);

        religionpagecurlview.setCurlView(religionimgs);
        religionpagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}