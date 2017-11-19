package com.example.nico.jobbyjob.login;

/**
 * Created by usuario on 10/11/17.
 */

public interface LoginInteractor{
    void validateCredentials(String user, String password, LoginInteractor.OnLoginFinishedListener onLoginFinishedListener);
    interface OnLoginFinishedListener{
      void onUserEmptyError();
      void onPasswordEmptyError();
      void onPasswordError();
      void onSucess();
    };
}
