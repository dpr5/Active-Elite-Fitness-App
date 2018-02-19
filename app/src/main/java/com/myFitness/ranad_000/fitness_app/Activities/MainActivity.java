package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.myFitness.ranad_000.fitness_app.MacrosCalc;
import com.myFitness.ranad_000.fitness_app.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar mTopToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_nav);
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);
        for (int i = 0; i < menuView.getChildCount(); i++) {
            final View iconView = menuView.getChildAt(i).findViewById(android.support.design.R.id.icon);
            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            // set your height here
            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32, displayMetrics);
            // set your width here
            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32, displayMetrics);
            iconView.setLayoutParams(layoutParams);
        }

        */


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
