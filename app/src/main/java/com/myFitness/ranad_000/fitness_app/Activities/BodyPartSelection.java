package com.myFitness.ranad_000.fitness_app.Activities;

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

import com.myFitness.ranad_000.fitness_app.R;

public class BodyPartSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_selection);

        String[] workouts = {"Chest Workouts", "Back Workouts", "Arm Workouts", "Leg Workouts", "Shoulder Workouts", "coming soon..."};
        ListAdapter shoulderworkouts = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, workouts);
        ListView mylist = (ListView) findViewById(R.id.my_list);
        mylist.setAdapter(shoulderworkouts);

        final ImageView first_image = (ImageView) findViewById(R.id.image1);
        final ImageView second_image = (ImageView) findViewById(R.id.image2);

        final TextView workout_title = (TextView) findViewById(R.id.workout_title);

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //first_image.setImageResource(R.drawable.arnold_press1);
                    //second_image.setImageResource(R.drawable.arnold_press2);
                    //workout_title.setText("Arnold Press");
                    //first_image.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.arnold_press1,null));

                    //first_image.setImageResource(R.drawable.arnold_press1);
                    Intent bench = new Intent(view.getContext(), chestWorkoutActivity.class);
                    startActivityForResult(bench, 0);
                }
                if (position == 1) {
                    Intent incline = new Intent(view.getContext(), BackWorkouts.class);
                    startActivityForResult(incline, 0);
                }
                if (position == 2) {
                    Intent decline = new Intent(view.getContext(), Arm_Workout_Activity.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 3) {
                    Intent decline = new Intent(view.getContext(), LegWorkoutActivity.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 4) {
                    Intent fly = new Intent(view.getContext(), ShoulderWorkoutActivity.class);
                    startActivityForResult(fly, 0);
                }
                if (position == 4) {
                    Intent fly = new Intent(view.getContext(), SkullCrusher_Workout_Activity.class);
                    startActivityForResult(fly, 0);
                }
            }
        });

    }
}
