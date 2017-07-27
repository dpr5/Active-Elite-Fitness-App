package com.example.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent workout1 = new Intent(view.getContext(), Squats_Workout_Activity.class);
                    startActivityForResult(workout1, 0);
                }
                if (position == 1) {
                    Intent workout2 = new Intent(view.getContext(), LegPress_Workout_Activity.class);
                    startActivityForResult(workout2, 0);
                }
                if (position == 2) {
                    Intent workout3 = new Intent(view.getContext(), LegExtn_Workout_Activity.class);
                    startActivityForResult(workout3, 0);
                }
                if (position == 3) {
                    Intent workout4 = new Intent(view.getContext(), Lunges_Workout_Activity.class);
                    startActivityForResult(workout4, 0);
                }
                if (position == 4) {
                    Intent workout5 = new Intent(view.getContext(), Hamstrings_Workout_Activity.class);
                    startActivityForResult(workout5, 0);
                }
                if (position == 5) {
                    Intent workout6 = new Intent(view.getContext(), Calves_Workout_Activity.class);
                    startActivityForResult(workout6, 0);
                }
            }
        });
    }
}
