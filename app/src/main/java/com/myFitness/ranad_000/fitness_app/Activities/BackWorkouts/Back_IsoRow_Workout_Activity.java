package com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

public class Back_IsoRow_Workout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iso_row__workout_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        toolbar.inflateMenu(R.menu.nav_bar_menu);

        ImageView image1 = (ImageView) findViewById(R.id.image1);
        ImageView image2 = (ImageView) findViewById(R.id.image2);
        ImageView image3 = (ImageView)findViewById(R.id.workout_activity_background);

        TextView text2 = (TextView) findViewById(R.id.workout_title);
        TextView text1 = (TextView) findViewById(R.id.group_workout_name);
        image3.setImageResource(R.drawable.back_main);

        image1.setImageResource(R.drawable.isorow1);
        image2.setImageResource(R.drawable.isorow2);

        text1.setText("Back Workout");
        text2.setText("Iso Low Row");
    }
}
