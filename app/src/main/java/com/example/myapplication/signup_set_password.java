package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class signup_set_password extends AppCompatActivity {

    TextView tvSignup, tvSetPass, tvNavLogin;
    TextInputEditText etPass, etConfirmPass;

    Button btnSignup;

    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_set_password);
        init();
    }

    public void init()
    {
        tvSignup = findViewById(R.id.tvSignup);
        tvNavLogin = findViewById(R.id.tvNavLogin);
        tvSetPass = findViewById(R.id.tvSetPass);
        etPass = findViewById(R.id.etPass);
        etConfirmPass = findViewById(R.id.etConfirmPass);
        btnSignup =findViewById(R.id.btnSignup);
    }
}