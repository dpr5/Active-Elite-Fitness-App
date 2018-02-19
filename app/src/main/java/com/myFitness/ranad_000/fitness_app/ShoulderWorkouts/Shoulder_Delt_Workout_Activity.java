package com.myFitness.ranad_000.fitness_app.ShoulderWorkouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

public class Shoulder_Delt_Workout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        toolbar.inflateMenu(R.menu.nav_bar_menu);

        ImageView image1 = (ImageView) findViewById(R.id.image1);
        ImageView image2 = (ImageView) findViewById(R.id.image2);

        TextView text2 = (TextView) findViewById(R.id.workout_title);
        TextView text1 = (TextView) findViewById(R.id.group_workout_name);

        image1.setImageResource(R.drawable.rear_delt1);
        image2.setImageResource(R.drawable.rear_delt2);

        text1.setText("Shoulder Workout");
        text2.setText("Rear Deltoid Fly");
    }
}
