package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.myFitness.ranad_000.fitness_app.R;

public class Workout_Plans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout__plans);
    }

    public void workoutPlans(View v) {
        Intent intent = new Intent(this, Cardio_Plan.class);
        startActivity(intent);
    }

    public void chestPlans(View v) {
        Intent intent = new Intent(this, Chest_Plan.class);
        startActivity(intent);
    }


}


