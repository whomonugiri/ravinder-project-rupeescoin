package com.myapps.rupeescoin.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.myapps.rupeescoin.R;
import com.myapps.rupeescoin.fragments.selectLaungaugeFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout_Login, selectLaungaugeFragment.newInstance()).commit();

    }
}