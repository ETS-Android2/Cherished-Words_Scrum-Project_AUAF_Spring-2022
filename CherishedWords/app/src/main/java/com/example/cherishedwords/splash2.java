package com.example.cherishedwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class splash2 extends AppCompatActivity {
    Button btnc;

    EditText name,notifnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash2);

        name = findViewById(R.id.userName);
        notifnum = findViewById(R.id.notificationNum);

        btnc = findViewById(R.id.btnCon);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (splash2.this, dashboard.class);
                startActivity(intent2);
            }
        });
    }
}