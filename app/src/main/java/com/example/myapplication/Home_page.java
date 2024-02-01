package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home_page extends AppCompatActivity {
    ImageView home_menu_btn , btn_notifications;
    Button btn_alert , btn_map , btn_image , btn_video , btn_rate_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        init();
        btn_rate_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Rate_us.class);
            }
        });

        btn_notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this,Notification.class);
            }
        });
    }
    public void init()
    {
        home_menu_btn = findViewById(R.id.home_menu_btn);
        btn_notifications = findViewById(R.id.btn_notifications);
        btn_alert = findViewById(R.id.btn_alert);
        btn_map = findViewById(R.id.btn_map);
        btn_image = findViewById(R.id.btn_image);
        btn_video = findViewById(R.id.btn_video);
        btn_rate_us = findViewById(R.id.btn_rate_us);
    }
}