package com.example.pharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends base {
    ExplosionField  explosionField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        findViews();
        handler();
        explosionField = ExplosionField.attach2Window(this);
    }
//    This method is used to implement the introduction page at the beginning of our app.
//    This method is used in Android to delay code execution and perform operations after a specified time.
    public void handler(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                explosionField.explode(img_title);
                explosionField.explode(image);            }
        }, 2500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashScreen.this,MainActivity.class));
                finish();
            }
        },4000);
    }

}