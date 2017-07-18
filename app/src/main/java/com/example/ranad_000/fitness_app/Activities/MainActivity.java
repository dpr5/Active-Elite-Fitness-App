package com.example.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ranad_000.fitness_app.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    public void myClick(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void nutritionActivity(View v){
        Intent intent = new Intent(this,nutritionActivity.class);
        startActivity(intent);
    }

    public void workoutActivity(View v){
        Intent intent = new Intent(this,WorkoutActivity.class);
        startActivity(intent);
    }

    public void scaleActivty(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateandtime = (TextView)findViewById(R.id.nutrition_text);
        String currentDateandTime = DateFormat.getDateTimeInstance().format(new Date());


    }



}
