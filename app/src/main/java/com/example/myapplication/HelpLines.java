package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class HelpLines extends AppCompatActivity {
    ImageView back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_lines);
        init();

    }
    public void init()
    {
        back_btn=findViewById(R.id.back_btn);
    }
}