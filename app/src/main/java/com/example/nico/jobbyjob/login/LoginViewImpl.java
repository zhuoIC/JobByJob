package com.example.nico.jobbyjob.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nico.jobbyjob.BaseActivity;
import com.example.nico.jobbyjob.MenuActivity;
import com.example.nico.jobbyjob.R;


public class LoginViewImpl extends BaseActivity implements LoginView{
    private Button btnSignIn;
    private EditText edtPassword;
    private EditText edtUser;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginPresenter = new LoginPresenterImpl(this);
        setContentView(R.layout.activity_login);
        edtPassword = findViewById(R.id.edtPassword);
        edtUser = findViewById(R.id.edtUser);
        //txvSignUp.setPaintFlags(txvSignUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loginPresenter.validateCredentials(edtUser.getText().toString(), edtPassword.getText().toString());
            }
        });
    }

    @Override
    public void navigateToHome() {
        Intent intent = new Intent(LoginViewImpl.this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    public void setUserEmptyError() {
        onError(R.string.errorUserEmpty);
    }

    @Override
    public void setPasswordEmptyError() {
        onError(R.string.errorPasswordEmpty);
    }

    @Override
    public void setPasswordError() {
        onError(R.string.errorPasswordLenght);
    }

    @Override
    public void onSucess() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.onDestroy();
        loginPresenter = null;
    }
}
