package com.myFitness.ranad_000.fitness_app.ShoulderWorkouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

public class Shoulder_UprightRow_Workout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_layout);

        ImageView image1 = (ImageView)findViewById(R.id.image1);
        ImageView image2 = (ImageView)findViewById(R.id.image2);

        TextView text2 = (TextView)findViewById(R.id.workout_title);
        TextView text1 = (TextView)findViewById(R.id.group_workout_name);

        image1.setImageResource(R.drawable.front_raise1);
        image2.setImageResource(R.drawable.front_raise2);

        text1.setText("Shoulder Workout");
        text2.setText("Front Raise");
    }
}
