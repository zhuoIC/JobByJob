package com.example.nico.jobbyjob;

import android.content.Intent;
import android.os.Bundle;

import com.example.nico.jobbyjob.login.LoginViewImpl;

public class SplashActivity extends BaseActivity {

    //ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startActivity(new Intent(SplashActivity.this, LoginViewImpl.class));
        /*imgLogo = findViewById(R.id.imgLogo);
        imgLogo.setOnClickListener(this);*/

    }

    /*@Override
    public void onClick(View view) {
        if(view == imgLogo) {
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        }
    }*/
}
