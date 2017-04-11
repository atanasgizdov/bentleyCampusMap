package com.example.agizdov.bentleycampusmap;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/**
 * Created by agizdov on 4/11/2017.
 */

public class IntroPage extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_page);

        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();

                    ImageView favicon = (ImageView) findViewById(R.id.intro_pic);
                    RotateAnimation r = new RotateAnimation(0,360,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    r.setDuration((long) 2*1500);
                    r.setRepeatCount(5);
                    favicon.startAnimation(r);

                    sleep(10000);  //Delay of 10 seconds


                } catch (Exception e) {

                } finally {

                    Intent i = new Intent(IntroPage.this,
                            MapsActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
