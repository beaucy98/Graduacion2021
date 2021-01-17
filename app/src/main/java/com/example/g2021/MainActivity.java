package com.example.g2021;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cancion);
        mediaPlayer.start();


        this.text1 = (TextView) findViewById(R.id.textView);
        this.text2 = (TextView) findViewById(R.id.textView1);
        this.text3 = (TextView) findViewById(R.id.textView2);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        rotate.setFillAfter(true);
        rotate.setRepeatMode(Animation.RESTART);
        rotate.setRepeatCount(1);

        this.text1.startAnimation(rotate);
        this.text2.startAnimation(rotate);
        this.text3.startAnimation(rotate);
    }
}