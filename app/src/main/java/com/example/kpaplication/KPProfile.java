package com.example.kpaplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

public class KPProfile extends AppCompatActivity {
    public static String USER_KEY ="USER_KEY";

    private AppCompatImageView kpPhoto;
    private TextView kpLogin;
    private TextView kpPassword;

    private View.OnClickListener kpOnPhotoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpprofile);

        kpPhoto = findViewById(R.id.ivPhoto);
        kpLogin = findViewById(R.id.tvEmail);
        kpPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();
        User user = (User) bundle.get(USER_KEY);
        kpLogin.setText(user.getKpLogin());
        kpPassword.setText(user.getKpPassword());

        kpPhoto.setOnClickListener(kpOnPhotoClickListener);
    }
}
