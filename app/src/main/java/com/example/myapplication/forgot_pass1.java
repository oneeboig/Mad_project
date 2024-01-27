package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class forgot_pass1 extends AppCompatActivity {

    TextView tvForgotPass;

    TextInputEditText etOwner, etMtag, etPhone;

    Button btnSendcode;

    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass1);
        init();
    }

    public void init()
    {
        tvForgotPass = findViewById(R.id.tvForgotPass);
        etOwner = findViewById(R.id.etOwner);
        etMtag = findViewById(R.id.etMtag);
        etPhone = findViewById(R.id.etPhone);
        btnSendcode = findViewById(R.id.btnSendcode);
        ivBack = findViewById(R.id.ivBack);
    }
}