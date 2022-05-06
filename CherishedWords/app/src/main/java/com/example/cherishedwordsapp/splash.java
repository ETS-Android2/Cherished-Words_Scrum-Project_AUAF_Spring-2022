package com.example.cherishedwordsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class splash extends AppCompatActivity {
        Button btnc;
        EditText name,notifnum;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_splash);

            name = findViewById(R.id.uName);
            notifnum = findViewById(R.id.notifNum);

            btnc = findViewById(R.id.btnC);

            btnc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent2 = new Intent (splash.this, thesetting.class);
                    startActivity(intent2);
                }
            });
    }
}