package com.example.nico.jobbyjob.login;

/**
 * Contiene los métodos necesarios/expuestos para que el presentador con la vista
 */

public interface LoginView {
    void navigateToHome();
    void setUserEmptyError();
    void setPasswordEmptyError();
    void setPasswordError();
    void onSucess();
}
