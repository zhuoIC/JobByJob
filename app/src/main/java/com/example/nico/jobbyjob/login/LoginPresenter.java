package com.example.nico.jobbyjob.login;

/**
 * Created by nico on 18/11/17.
 */

public interface LoginPresenter {
    void validateCredentials(String user, String password);

    void onDestroy();
}
