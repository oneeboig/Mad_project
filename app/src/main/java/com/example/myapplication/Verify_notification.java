package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Verify_notification extends AppCompatActivity {
    ImageView back_btn , btn_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_notification);
        init();
    }
    public void init()
    {
        back_btn=findViewById(R.id.back_btn);
        btn_menu=findViewById(R.id.btn_menu);
    }
}