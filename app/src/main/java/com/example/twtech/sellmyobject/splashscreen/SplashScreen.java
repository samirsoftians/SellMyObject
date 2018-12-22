package com.example.twtech.sellmyobject.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.twtech.sellmyobject.MainActivity;
import com.example.twtech.sellmyobject.R;
import com.example.twtech.sellmyobject.variables.Variables;

public class SplashScreen extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sparrow);
        final View view = findViewById(R.id.bird);

        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.scale);


        view.startAnimation(anim);




        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

            }
        }, Variables.SPLASH_TIME_OUT);





    }



}
