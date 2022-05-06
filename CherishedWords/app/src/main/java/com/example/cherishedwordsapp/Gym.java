package com.example.cherishedwordsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;

import java.io.File;
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
        actionBar.setDisplayHomeAsUpEnabled(true);
        gympagecurlview = (PageCurlView) findViewById(R.id.gympagecurlview);
        gymimgs = new ArrayList<>();

        gymimgs.add(R.drawable.gym6);
        gymimgs.add(R.drawable.gym7);
        gymimgs.add(R.drawable.gym8);

        gympagecurlview.setCurlView(gymimgs);
        gympagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
    //Menuitems
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_share:
                ApplicationInfo applicationInfo = getApplicationContext().getApplicationInfo();
                String apkpath = applicationInfo.sourceDir;
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("application/vnd.android.package-archive");
                intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
                startActivity(Intent.createChooser(intent, "ShareVia"));
                return true;
            case R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}