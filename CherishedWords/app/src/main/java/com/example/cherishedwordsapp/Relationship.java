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

public class Relationship extends AppCompatActivity {
    List<Integer> relationshipimgs;
    PageCurlView relationshippagecurlview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_relationship);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Relationship");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        relationshippagecurlview = (PageCurlView) findViewById(R.id.rltnshpimgs);
        relationshipimgs = new ArrayList<>();

        relationshipimgs.add(R.drawable.relationship1);
        relationshipimgs.add(R.drawable.relationship2);
        relationshipimgs.add(R.drawable.relationship3);
        relationshipimgs.add(R.drawable.relationship4);
        relationshipimgs.add(R.drawable.relationship5);

        relationshippagecurlview.setCurlView(relationshipimgs);
        relationshippagecurlview.setCurlSpeed(665);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}