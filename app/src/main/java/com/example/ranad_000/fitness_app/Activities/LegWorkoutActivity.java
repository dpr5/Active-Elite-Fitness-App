package com.example.ranad_000.fitness_app.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ranad_000.fitness_app.R;

import java.text.DateFormat;
import java.util.Date;

public class LegWorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_workout);

        String[] workouts = {"Squats", "Leg Press", "Leg Extention", "Lunges", "Hamstring Curls", "Calves"};
        ListAdapter chestworkouts = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, workouts);
        ListView mylist = (ListView) findViewById(R.id.my_list);
        mylist.setAdapter(chestworkouts);

        TextView dateandtime = (TextView) findViewById(R.id.date_and_time);
        String currentDateandTime = DateFormat.getDateTimeInstance().format(new Date());

        dateandtime.setText(currentDateandTime);

        ImageView logo = (ImageView) findViewById(R.id.leg_image);
        logo.setAlpha(0.4f);
    }
}
