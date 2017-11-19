package com.example.nico.jobbyjob.prefs;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.example.nico.jobbyjob.R;

public class AccountSettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.account_setting);
    }
}
