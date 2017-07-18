package com.example.ranad_000.fitness_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

//import com.example.ranad_000.Fitness_App.R;

public class chestWorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout);

        String[] workouts = {"Bench", "Incline Bench", "Decline Bench", "Cable Bench", "Chest Fly" };
        ListAdapter chestworkouts = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1 , workouts);
        ListView mylist = (ListView)findViewById(R.id.my_list);
        mylist.setAdapter(chestworkouts);

        TextView dateandtime = (TextView)findViewById(R.id.date_and_time);
        String currentDateandTime = DateFormat.getDateTimeInstance().format(new Date());

        dateandtime.setText(currentDateandTime);


    }
}
