package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class signup_personal_info extends AppCompatActivity {

    TextView tvSignup, tvPersonalInfo, tvNavLogin;

    TextInputEditText etOwner, etMtag, etCnic;

    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_personal_info);
        init();
    }
    public void init()
    {
        tvSignup=findViewById(R.id.tvSignup);
        tvPersonalInfo=findViewById(R.id.tvPersonalInfo);
        tvNavLogin=findViewById(R.id.tvNavLogin);
        etOwner=findViewById(R.id.etOwner);
        etMtag=findViewById(R.id.etMtag);
        etCnic=findViewById(R.id.etCnic);
    }
}