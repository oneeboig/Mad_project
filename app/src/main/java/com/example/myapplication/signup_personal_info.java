package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class signup_personal_info extends AppCompatActivity {

    TextView tvSignup, tvPersonalInfo, tvNavLogin;

    TextInputEditText etOwner, etMtag, etCnic;

    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_personal_info);
        init();
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Owner = Objects.requireNonNull(etOwner.getText()).toString().trim();
                String Mtag = Objects.requireNonNull(etMtag.getText()).toString().trim();
                String Cnic = Objects.requireNonNull(etCnic.getText()).toString().trim();
                Intent intent;
                if(!Owner.isEmpty() && !Mtag.isEmpty() && !Cnic.isEmpty()){
                    intent = new Intent(signup_personal_info.this, signup_vehicle_info.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(signup_personal_info.this, "Field can not be empty", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void init()
    {
        tvSignup=findViewById(R.id.tvSignup);
        tvPersonalInfo=findViewById(R.id.tvPersonalInfo);
        tvNavLogin=findViewById(R.id.tvNavLogin);
        etOwner=findViewById(R.id.etOwner);
        etMtag=findViewById(R.id.etMtag);
        etCnic=findViewById(R.id.etCnic);
        btnNext1=findViewById(R.id.btnNext1);
    }
}