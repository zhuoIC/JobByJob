package com.example.nico.jobbyjob.login;

import android.text.TextUtils;

import com.example.nico.jobbyjob.db.repository.UserRepository;
import com.example.nico.jobbyjob.utils.CommonUtils;


/**
 * Created by usuario on 10/11/17.
 */

public class LoginInteractorImpl {

    public void validateCredentials(String user, String password, LoginInteractor.OnLoginFinishedListener onLoginFinishedListener) {
        // Realiza todas las comprobaciones
        // Si el password es vacío
        if (TextUtils.isEmpty(user)){
            onLoginFinishedListener.onUserEmptyError();
        }
        else if (TextUtils.isEmpty(password)){
            onLoginFinishedListener.onPasswordEmptyError();
        }
        else if (!CommonUtils.isPasswordValid(password)){
            onLoginFinishedListener.onPasswordError();
        }
        else if (UserRepository.getInstance().validateCredentials(user, password)){
            onLoginFinishedListener.onSucess();
        }


        // Y es correcto
    }
}
