package com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

public class Tricep_TricepPushDown_Workout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_push_down__workout_);

        ImageView image1 = (ImageView)findViewById(R.id.image1);
        ImageView image2 = (ImageView)findViewById(R.id.image2);

        TextView text2 = (TextView)findViewById(R.id.workout_title);
        TextView text1 = (TextView)findViewById(R.id.group_workout_name);

        image1.setImageResource(R.drawable.tricep_pushdown1);
        image2.setImageResource(R.drawable.tricep_pushdown2);

        text1.setText("Arm Workout");
        text2.setText("Tricep Pushdown");
    }
}
