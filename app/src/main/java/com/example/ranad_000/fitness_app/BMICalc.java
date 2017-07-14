package com.example.ranad_000.fitness_app;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ranad_000.fitness_app.MainActivity;
import com.example.ranad_000.fitness_app.R;


/**
 * Created by ranad_000 on 6/27/2017.
 */

public class BMICalc extends MainActivity{

    int duration = 10;
    RadioGroup gender = (RadioGroup)findViewById(R.id.gender_group) ;
    RadioButton male = (RadioButton)findViewById(R.id.male_radio);
    RadioButton female = (RadioButton)findViewById(R.id.female_radio);

    TextView input_age = (TextView)findViewById(R.id.age);
    TextView input_height = (TextView)findViewById(R.id.height);
    TextView input_weight = (TextView)findViewById(R.id.weight);

    int age = Integer.parseInt(input_age.toString());
    int height = Integer.parseInt(input_height.toString());
    int weight = Integer.parseInt(input_weight.toString());

    TextView r = (TextView)findViewById(R.id.results);

    Button submit = (Button)findViewById(R.id.submit);


    double output= (10 * weight)+(6.25 * height)-(5 * age)+5;

    String result = Double.toString(output);
    //r.setText(results);

    public void onClick(View v){
        RadioButton selectedBtn = (RadioButton)findViewById(gender.getCheckedRadioButtonId());
        Toast toast = Toast.makeText(this, result, Toast.LENGTH_LONG);
        toast.show();
    }

}
