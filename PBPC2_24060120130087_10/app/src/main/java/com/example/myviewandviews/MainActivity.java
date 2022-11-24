package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Gameboy Advance SP Cobalt Blue Teal Buttons Upgraded IPS Backlit screen");
        }

        Button btnBuy = findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(this);
        Button btnCall = findViewById(R.id.btn_call);
        btnCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_buy:
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(buyIntent);
                break;
            case R.id.btn_call:
                String phone = "081290077440";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
