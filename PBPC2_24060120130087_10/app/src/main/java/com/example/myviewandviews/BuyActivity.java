package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Gameboy Advance SP Cobalt Blue Teal Buttons Upgraded IPS Backlit screen");
        }
    }
}