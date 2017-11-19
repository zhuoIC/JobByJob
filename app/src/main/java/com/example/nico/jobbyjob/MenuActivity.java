package com.example.nico.jobbyjob;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.nico.jobbyjob.prefs.AccountSettingActivity;
import com.example.nico.jobbyjob.prefs.GeneralSettingActivity;

public class MenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_account_setting:
                startActivity(new Intent(MenuActivity.this, AccountSettingActivity.class));
                break;
            case R.id.action_general_setting:
                startActivity(new Intent(MenuActivity.this, GeneralSettingActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
