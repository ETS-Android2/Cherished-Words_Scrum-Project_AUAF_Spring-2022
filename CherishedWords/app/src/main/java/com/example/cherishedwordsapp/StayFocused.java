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

public class StayFocused extends AppCompatActivity {

    List<Integer> focusimgs;
    PageCurlView focuspagecurlview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_stay_focused);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Stay Focused");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        focuspagecurlview = (PageCurlView) findViewById(R.id.focuspagecurlview);
        focusimgs = new ArrayList<>();

        focusimgs.add(R.drawable.focus1);
        focusimgs.add(R.drawable.focus2);
        focusimgs.add(R.drawable.focus3);
        focusimgs.add(R.drawable.focus4);
        focusimgs.add(R.drawable.focus5);

        focuspagecurlview.setCurlView(focusimgs);
        focuspagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}