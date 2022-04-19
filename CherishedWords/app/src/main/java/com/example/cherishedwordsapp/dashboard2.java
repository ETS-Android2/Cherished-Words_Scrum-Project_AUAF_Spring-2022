package com.example.cherishedwordsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class dashboard2 extends AppCompatActivity {
    Button btn_help, btn_fav, btn_settings, btn_exit;
    private CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Dashboard");

        card1 = (CardView) findViewById(R.id.opt1);
        card2 = (CardView) findViewById(R.id.opt2);
        card3 = (CardView) findViewById(R.id.opt3);
        card4 = (CardView) findViewById(R.id.opt4);
        card5 = (CardView) findViewById(R.id.opt5);
        card6 = (CardView) findViewById(R.id.opt6);
        //btn_help = (Button) findViewById(R.id.btnhelp);
        //btn_fav = (Button) findViewById(R.id.btnfav);
        //btn_settings = (Button) findViewById(R.id.btnsettings);
        //btn_exit = (Button) findViewById(R.id.btnexit);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent (dashboard2.this, StuLife.class);
                startActivity(intent1);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (dashboard2.this, StayFocused.class);
                startActivity(intent2);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent (dashboard2.this, Gym.class);
                startActivity(intent3);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent (dashboard2.this, Work.class);
                startActivity(intent4);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent (dashboard2.this, Religion.class);
                startActivity(intent4);
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent (dashboard2.this, Relationship.class);
                startActivity(intent4);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_help:
                Intent help = new Intent(dashboard2.this, StuLife.class );
                startActivity(help);
                return true;
            case R.id.action_favorites:
                Intent fav = new Intent(dashboard2.this, StuLife.class );
                startActivity(fav);
                return true;
            case R.id.action_settings:
                Intent setting = new Intent(dashboard2.this, StuLife.class );
                startActivity(setting);
                return true;
            case R.id.action_exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}























