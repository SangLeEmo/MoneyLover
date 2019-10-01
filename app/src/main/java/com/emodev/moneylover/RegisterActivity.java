package com.emodev.moneylover;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    AppCompatButton btnRegister, btnLogin;
    AppCompatEditText txtEmail, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btnRegister_Regis);
        btnLogin = findViewById(R.id.btnLogin_Regis);
        txtEmail = findViewById(R.id.txtEmail_Regis);
        txtPassword = findViewById(R.id.txtPassword_Regis);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                //finish();
            }
        });
    }
}
