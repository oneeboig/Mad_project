package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class forgot_pass_confirm extends AppCompatActivity {

    ImageView ivBack;

    TextInputEditText etPass, etConfirmPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass_confirm);
        init();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forgot_pass_confirm.this, Home_page.class);
                Toast.makeText(forgot_pass_confirm.this,"Password Changed",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void init()
    {
        ivBack=findViewById(R.id.ivBack);
        etPass=findViewById(R.id.etNewPass);
        etConfirmPass=findViewById(R.id.etConfirmNew);
        btnLogin=findViewById(R.id.btnLogin);
    }
}