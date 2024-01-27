package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextView tvLogin, tvPersonalInfo, tvForgotPass, tvNavSignup;
    TextInputEditText etOwner, etPass;

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    public void init()
    {
        tvLogin=findViewById(R.id.tvLogin);
        tvPersonalInfo=findViewById(R.id.tvPersonalInfo);
        tvNavSignup=findViewById(R.id.tvNavLogin);
        etOwner=findViewById(R.id.etOwner);
        etPass=findViewById(R.id.etPass);
    }
}