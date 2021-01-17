package com.example.g2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 4000);

        this.mytext = (TextView) findViewById(R.id.textSplash);

        Animation desaparecer = AnimationUtils.loadAnimation(this, R.anim.desaparecer);
        desaparecer.setFillAfter(true);
        desaparecer.setRepeatMode(Animation.RESTART);
        desaparecer.setRepeatCount(3);

        this.mytext.startAnimation(desaparecer);
    }
}