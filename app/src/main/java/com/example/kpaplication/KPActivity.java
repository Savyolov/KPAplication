package com.example.kpaplication;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KPActivity extends AppCompatActivity {

    private EditText kpLogin;
    private EditText kpPassword;
    private Button kpEnter;
    private Button kpRegister;

    private View.OnClickListener mOnEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (isEmailValid() && isPasswordValid()) {
                Intent startProfileIntent = new Intent(KPActivity.this, KPProfile.class);
                startProfileIntent.putExtra(KPProfile.USER_KEY, new User(kpLogin.getText().toString(), kpPassword.getText().toString()));
                startActivity(startProfileIntent);
            } else {
                showMessage(R.string.login_input_error);
            }
        }
    };

    private View.OnClickListener mOnRegisterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TO DO
        }
    };

    private boolean isEmailValid(){
        return !TextUtils.isEmpty(kpLogin.getText())
                && Patterns.EMAIL_ADDRESS.matcher(kpLogin.getText()).matches();
    }
    private boolean isPasswordValid(){
        return !TextUtils.isEmpty(kpPassword.getText());
    }

    private void showMessage(@StringRes int string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Найдем View-elements
        kpLogin = findViewById(R.id.kp_Login);
        kpPassword = findViewById(R.id.kp_Password);
        kpEnter = findViewById(R.id.kp_Enter);
        kpRegister = findViewById(R.id.kp_Register);

        kpEnter.setOnClickListener(mOnEnterClickListener);
        kpRegister.setOnClickListener(mOnRegisterClickListener);
    }
}