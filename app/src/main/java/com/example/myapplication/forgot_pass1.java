package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

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
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forgot_pass1.this, Home_page.class);
            }
        });
        btnSendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Owner = Objects.requireNonNull(etOwner.getText()).toString().trim();
                String Mtag = Objects.requireNonNull(etMtag.getText()).toString().trim();
                String Phone = Objects.requireNonNull(etPhone.getText()).toString().trim();
                Intent intent;
                if(!Owner.isEmpty() && !Mtag.isEmpty() && !Phone.isEmpty()){
                    intent = new Intent(forgot_pass1.this, forgot_pass_enter_code.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(forgot_pass1.this, "Field(s) can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
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