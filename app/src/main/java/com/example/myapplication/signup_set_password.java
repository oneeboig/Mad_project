package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
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
        Intent intent = getIntent();
        String Owner = intent.getStringExtra("Owner");
        String Mtag = intent.getStringExtra("Mtag");
        String Cnic = intent.getStringExtra("Cnic");
        String Vname = intent.getStringExtra("Vname");
        String Vtype = intent.getStringExtra("Vtype");
        String Vnumber = intent.getStringExtra("Vnumber");
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = Objects.requireNonNull(etPass.getText().toString().trim());
                String confirmPass = Objects.requireNonNull(etConfirmPass.getText().toString().trim());

                if (!password.isEmpty() && !confirmPass.isEmpty()) {
                    if(password.equals(confirmPass)) {
                        HashMap <String , Object> data =new HashMap<>();
                        data.put("Owner",Owner);
                        data.put("Mtag",Mtag);
                        data.put("Cnic",Cnic);
                        data.put("Vname",Vname);
                        data.put("Vtype",Vtype);
                        data.put("Vnumber",Vnumber);
                        data.put("password",password);

                        FirebaseDatabase.getInstance().getReference()
                                .child("Users").push()
                                .setValue(data)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void unused) {
                                        Toast.makeText(signup_set_password.this, "Registration sucessfull", Toast.LENGTH_SHORT).show();
                                        Intent i = new Intent(signup_set_password.this, Home_page.class);
                                        startActivity(i);
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(signup_set_password.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                });


                    }
                    else{
                        Toast.makeText(signup_set_password.this, "Password not matched", Toast.LENGTH_SHORT).show();
                    }
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