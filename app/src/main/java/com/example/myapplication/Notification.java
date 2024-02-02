package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Notification extends AppCompatActivity {
    ImageView back_btn , btn_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        init();
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notification.this, Home_page.class);
                startActivity(i);
                finish();
            }
        });
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notification.this, menu.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void init()
    {
        back_btn = findViewById(R.id.back_btn);
        btn_menu = findViewById(R.id.btn_menu);
    }
}