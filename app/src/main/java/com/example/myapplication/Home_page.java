package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Home_page extends AppCompatActivity {
    ImageView home_menu_btn , btn_notifications;
    Button btn_alert , btn_map , btn_image , btn_video , btn_rate_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
}