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

import java.text.DateFormat;
import java.util.Date;

public class Chest_Plan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest__plan);

        String[] workouts = {"Bench", "Incline Bench", "Decline Bench", "Cable Bench", "Chest Fly"};
        ListAdapter chestworkouts = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, workouts);
        ListView mylist = (ListView) findViewById(R.id.my_list);
        mylist.setAdapter(chestworkouts);

        TextView dateandtime = (TextView) findViewById(R.id.date_and_time);
        String currentDateandTime = DateFormat.getDateTimeInstance().format(new Date());

        dateandtime.setText(currentDateandTime);

        ImageView logo = (ImageView) findViewById(R.id.logo);
        logo.setAlpha(0.4f);

        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chest_image);
        //RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        //roundedBitmapDrawable.setCircular(true);
        //logo.setImageDrawable(roundedBitmapDrawable);


        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent bench = new Intent(view.getContext(), Bench_Workout_Activity.class);
                    startActivityForResult(bench, 0);
                }
                if (position == 1) {
                    Intent incline = new Intent(view.getContext(), Incline_Bench_Activity.class);
                    startActivityForResult(incline, 0);
                }
                if (position == 2) {
                    Intent decline = new Intent(view.getContext(), Decline_Workout_Activity.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 3) {
                    Intent decline = new Intent(view.getContext(), CablePress_Workout_Activity.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 4) {
                    Intent fly = new Intent(view.getContext(), ChestFly_Workout_Activity.class);
                    startActivityForResult(fly, 0);
                }


            }
        });

    }

}

