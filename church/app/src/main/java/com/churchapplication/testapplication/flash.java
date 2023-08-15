package com.churchapplication.testapplication;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class flash extends AppCompatActivity {
    private static int SPLASH_SCREEN = 2300;
    Animation topani , bottomani;
    ImageView image;
    TextView logo, creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.flash);

        topani = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomani = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.splashtitle);
        creator = findViewById(R.id.creator);

        image.setAnimation(topani);
        logo.setAnimation(bottomani);
        creator.setAnimation(bottomani);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iintent = new Intent(flash.this, yschmain.class);
                startActivity(iintent);
                finish();
            }
        }, SPLASH_SCREEN);
    }

}