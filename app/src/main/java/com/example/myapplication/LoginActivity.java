package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        tvNavSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, signup_personal_info.class);
                startActivity(i);
                finish();
            }
        });
        tvForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, forgot_pass1.class);
                startActivity(i);
                finish();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String owner = etOwner.getText().toString().trim();
                String password = etPass.getText().toString().trim();
                if (!owner.isEmpty() && !password.isEmpty())
                {
                Intent i = new Intent(LoginActivity.this, Home_page.class);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Field(s) can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void init()
    {
        tvLogin=findViewById(R.id.tvLogin);
        tvPersonalInfo=findViewById(R.id.tvPersonalInfo);
        tvForgotPass=findViewById(R.id.tvForgotPass);
        tvNavSignup=findViewById(R.id.tvNavLogin);
        etOwner=findViewById(R.id.etOwner);
        etPass=findViewById(R.id.etPass);
        btnLogin=findViewById(R.id.btnLogin);
    }
}