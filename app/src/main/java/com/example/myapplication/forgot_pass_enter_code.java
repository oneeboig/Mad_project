package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class forgot_pass_enter_code extends AppCompatActivity {

    TextView tvForgotPass;

    TextInputEditText etCode;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass_enter_code);
        init();
    }

    public void init()
    {
        tvForgotPass = findViewById(R.id.tvForgotPass);
        etCode = findViewById(R.id.etCode);
        btnSubmit = findViewById(R.id.btnSendcode);
    }
}