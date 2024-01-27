package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class signup_vehicle_info extends AppCompatActivity {
    TextView tvSignup, tvVehicleInfo, tvNavLogin;
    TextInputEditText etVehicleName, etVehicleType, etVehicleNumber;

    Button btnNext2;

    ImageView ivBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_vehicle_info);
        init();
    }

    public void init()
    {
        tvSignup = findViewById(R.id.tvSignup);
        tvNavLogin = findViewById(R.id.tvNavLogin);
        tvVehicleInfo = findViewById(R.id.tvVehicleInfo);
        etVehicleName = findViewById(R.id.etVehicleName);
        etVehicleType = findViewById(R.id.etVehicleType);
        etVehicleNumber = findViewById(R.id.etVehicleNumber);
        btnNext2 =findViewById(R.id.btnNext2);
        ivBack = findViewById(R.id.ivBack);
    }
}