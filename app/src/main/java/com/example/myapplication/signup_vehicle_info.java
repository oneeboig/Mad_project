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
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Vname = Objects.requireNonNull(etVehicleName.getText()).toString().trim();
                String Vtype = Objects.requireNonNull(etVehicleType.getText()).toString().trim();
                String Vnumber = Objects.requireNonNull(etVehicleNumber.getText()).toString().trim();

                Intent intent;
                if(!Vname.isEmpty() && !Vtype.isEmpty() && !Vnumber.isEmpty()){
                    intent = new Intent(signup_vehicle_info.this, signup_set_password.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(signup_vehicle_info.this, "Field can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
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