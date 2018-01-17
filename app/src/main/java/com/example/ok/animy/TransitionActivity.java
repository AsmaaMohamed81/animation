package com.example.ok.animy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class TransitionActivity extends AppCompatActivity {
TextView e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        e1=(TextView) findViewById(R.id.txt_welcom);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.e5faa);
        e1.startAnimation(animation);

    }

}
