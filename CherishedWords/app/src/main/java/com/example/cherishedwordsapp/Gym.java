package com.example.cherishedwordsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class Gym extends AppCompatActivity {

    List<Integer> gymimgs;
    PageCurlView gympagecurlview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gym);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Gym Motivation");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        gympagecurlview = (PageCurlView) findViewById(R.id.gympagecurlview);
        gymimgs = new ArrayList<>();

        gymimgs.add(R.drawable.gym1);
        gymimgs.add(R.drawable.gym2);
        gymimgs.add(R.drawable.gym3);
        gymimgs.add(R.drawable.gym4);
        gymimgs.add(R.drawable.gym5);

        gympagecurlview.setCurlView(gymimgs);
        gympagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}