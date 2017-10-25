package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import com.myFitness.ranad_000.fitness_app.MacrosCalc;
import com.myFitness.ranad_000.fitness_app.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }


    public void workoutPlans(View v) {
        Intent intent = new Intent(this, Workout_Plans.class);
        startActivity(intent);
    }

    public void nutritionActivity(View v) {
        Intent intent = new Intent(this, nutritionActivity.class);
        startActivity(intent);
    }

    public void workoutActivity(View v) {
        Intent intent = new Intent(this, BodyPartSelection.class);
        startActivity(intent);
    }

    public void scaleActivty(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void macrosCalc(View v) {
        Intent intent = new Intent(this, MacrosCalc.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_bar_menu, menu);
        return true;
    }


}
