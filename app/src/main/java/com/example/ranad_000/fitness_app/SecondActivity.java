package com.example.ranad_000.fitness_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        RadioGroup gender = (RadioGroup) findViewById(R.id.gender_group);
        RadioButton male = (RadioButton) findViewById(R.id.male_radio);
        RadioButton female = (RadioButton) findViewById(R.id.female_radio);

        EditText input_age = (EditText) findViewById(R.id.age);
        EditText input_height = (EditText) findViewById(R.id.height);
        EditText input_weight = (EditText) findViewById(R.id.weight);
        EditText results = (EditText) findViewById(R.id.results);





        int age = Integer.parseInt(input_age.getText().toString());
        int height = Integer.parseInt(input_height.getText().toString());
        int weight = Integer.parseInt(input_weight.getText().toString());



        Button submit = (Button) findViewById(R.id.submit);


        double output = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        String result = Double.toString(output);
        results.setText(result);


    }

}
