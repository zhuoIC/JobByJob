package com.example.nico.jobbyjob;

import android.app.ActionBar;
import android.support.design.widget.Snackbar;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {
    @Nullable
    @Override
    public ActionBar getActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setIcon(R.mipmap.ic_jobbyjob);
        return actionBar;
    }

    public void onError(String message){
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();

    }
    public void onError(int resId){
        Snackbar.make(findViewById(android.R.id.content), getResources().getString(resId), Snackbar.LENGTH_SHORT).show();

    }
}
