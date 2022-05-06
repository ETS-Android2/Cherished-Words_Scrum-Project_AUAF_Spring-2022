package com.example.cherishedwordsapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.io.File;
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
        actionBar.setDisplayHomeAsUpEnabled(true);

        stupagecurlview = (PageCurlView) findViewById(R.id.imgs);
        imgs = new ArrayList<>();

        imgs.add(R.drawable.stu6);
        imgs.add(R.drawable.stu7);
        imgs.add(R.drawable.stu8);

        stupagecurlview.setCurlView(imgs);
        stupagecurlview.setCurlSpeed(665);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            //implementing share button
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