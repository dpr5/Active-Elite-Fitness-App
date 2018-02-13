package com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.Activities.MainActivity;
import com.myFitness.ranad_000.fitness_app.R;

public class Back_LatPulldown_Workout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat_pulldown__workout_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        toolbar.inflateMenu(R.menu.nav_bar_menu);

        ImageView image1 = (ImageView)findViewById(R.id.image1);
        ImageView image2 = (ImageView)findViewById(R.id.image2);
        ImageView image3 = (ImageView)findViewById(R.id.workout_activity_background);

        TextView text2 = (TextView)findViewById(R.id.workout_title);
        TextView text1 = (TextView)findViewById(R.id.group_workout_name);
        image3.setImageResource(R.drawable.back_main);

        image1.setImageResource(R.drawable.latpulldown1);
        image2.setImageResource(R.drawable.latpulldown2);

        text1.setText("Back Workout");
        text2.setText("Lat Pulldown");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.calendar:
                Intent calendar = new Intent(Back_LatPulldown_Workout_Activity.this, com.myFitness.ranad_000.fitness_app.Activities.calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(Back_LatPulldown_Workout_Activity.this, MainActivity.class);
                startActivity(home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}


