package com.gts.gts.WelcomeActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.gts.gts.LoginActivity.Login2Activity;
import com.gts.gts.LoginActivity.LoginActivity;
import com.gts.gts.LoginActivity.LoginCustomActivity;
import com.gts.gts.MainActivity;
import com.gts.gts.R;

public class Splash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);

       /* final Intent i = new Intent(this, MainActivity.class);*/
        final Intent i = new Intent(this, LoginCustomActivity.class);
        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }
                 catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }//end run
        };
        splash.start();
    }
}
