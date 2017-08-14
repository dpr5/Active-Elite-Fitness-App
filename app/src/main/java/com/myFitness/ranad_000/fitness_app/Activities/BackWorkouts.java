package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.myFitness.ranad_000.fitness_app.R;

public class BackWorkouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_workouts);

        String[] workouts = {"Lat Pulldown", "Bent Over Row" , "Back Fly", "T-Bar Row", "Iso Row"};
        ListAdapter shoulderworkouts = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, workouts);
        ListView mylist = (ListView) findViewById(R.id.my_list);
        mylist.setAdapter(shoulderworkouts);


        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent bench = new Intent(view.getContext(), LatPulldown_Workout_Activity.class);
                    startActivityForResult(bench, 0);
                }
                if (position == 1) {
                    Intent incline = new Intent(view.getContext(), LowRow_Workout_Activity.class);
                    startActivityForResult(incline, 0);
                }
                if (position == 2) {
                    Intent decline = new Intent(view.getContext(), BackFly_Workout_Activity.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 3) {
                    Intent decline = new Intent(view.getContext(), TBarRow_Workout_Activity.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 4) {
                    Intent fly = new Intent(view.getContext(), IsoRow_Workout_Activity.class);
                    startActivityForResult(fly, 0);
                }
            }
        });
    }
}
