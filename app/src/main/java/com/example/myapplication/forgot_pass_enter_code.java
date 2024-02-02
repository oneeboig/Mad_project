package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class forgot_pass_enter_code extends AppCompatActivity {

    TextView tvForgotPass;

    TextInputEditText etCode;

    Button btnSubmit;
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass_enter_code);
        init();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forgot_pass_enter_code.this, forgot_pass_confirm.class);
                startActivity(i);
                finish();
            }
        });
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forgot_pass_enter_code.this, forgot_pass1.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void init()
    {
        tvForgotPass = findViewById(R.id.tvForgotPass);
        etCode = findViewById(R.id.etCode);
        btnSubmit = findViewById(R.id.btnSendcode);
        ivBack = findViewById(R.id.ivBack);
    }
}