package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

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
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = Objects.requireNonNull(etPass.getText().toString().trim());
                String confirmPass = Objects.requireNonNull(etConfirmPass.getText().toString().trim());

                if (!password.isEmpty() && !confirmPass.isEmpty()) {
                    Intent i = new Intent(signup_set_password.this, Home_page.class);
                }
                else {
                    Toast.makeText(signup_set_password.this, "Password feild(s) can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
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