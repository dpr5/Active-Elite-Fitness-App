package com.myFitness.ranad_000.fitness_app.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.myFitness.ranad_000.fitness_app.R;

public class Bottom_Navigation_Bar extends AppCompatActivity {

    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom__navigation__bar);

        final FloatingActionButton fab_buttom = (FloatingActionButton) findViewById(R.id.fab_menu);
        final FloatingActionButton fab_home = (FloatingActionButton) findViewById(R.id.fab_menu_home);
        final FloatingActionButton fab_stopwatch = (FloatingActionButton) findViewById(R.id.fab_menu_stopwatch);

        final Animation fab_open = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        final Animation fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        final Animation fab_rotClockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        final Animation fab_rotAntiClockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anti_clockwise);

        fab_buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOpen){
                    fab_buttom.startAnimation(fab_rotAntiClockwise);
                    fab_home.startAnimation(fab_close);
                    fab_stopwatch.startAnimation(fab_close);
                    fab_buttom.setClickable(true);
                    isOpen = true;
                }
                else{
                    fab_buttom.startAnimation(fab_rotClockwise);
                    fab_home.startAnimation(fab_open);
                    fab_stopwatch.startAnimation(fab_open);
                    fab_buttom.setClickable(true);
                    isOpen = true;

                }
            }
        });

    }
}
