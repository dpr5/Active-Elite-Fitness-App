package com.myFitness.ranad_000.fitness_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MacrosCalc extends AppCompatActivity {


    private EditText weighttext;
    private EditText heighttext;
    private EditText agetext;

    int finalWeight;
    int finalHeight;
    int finalAge;

    private TextView results;

    private boolean male;
    private boolean female;

    private int male_result;
    private int female_results;

    Button submitbtn;
    Spinner mspin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros_calc);

        mspin=(Spinner) findViewById(R.id.mspinner1);
        Integer[] items = new Integer[]{1,2,3,4};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, items);
        mspin.setAdapter(adapter);

        mspin=(Spinner) findViewById(R.id.mspinner2);
        //ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, items);
        mspin.setAdapter(adapter);

        mspin=(Spinner) findViewById(R.id.mspinner3);
        //ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, items);
        mspin.setAdapter(adapter);

//        weighttext = (EditText) findViewById(R.id.weight);
//        heighttext = (EditText) findViewById(R.id.height);
//        agetext = (EditText) findViewById(R.id.age);
//
//
//        String weight = weighttext.getText().toString();
//        final int finalWeight = Integer.parseInt(weight);
//
//        String height = heighttext.getText().toString();
//        final int finalHeight = Integer.parseInt(height);
//
//        String age = agetext.getText().toString();
//        final int finalAge = Integer.parseInt(age);
//        //males
//        // 10 * weight(kg) + 6.25 * height(cm) - 5 * age + 5
//
//        //females
//        // 10 * weight(kg) + 6.25 * height(cm) - 5 * age + 161
//
//        submitbtn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                male_result = (int) (10 * finalWeight + 6.25 * finalHeight - 5 * finalAge + 5);
//                results = (TextView) findViewById(R.id.results);
//                results.setText(male_result);
//            }
//        });
    }

    public void macrosCalculate(View v) {
//        if (male == true) try {
        male_result = (int) (10 * finalWeight + 6.25 * finalHeight - 5 * finalAge + 5);
        results = (TextView) findViewById(R.id.results);
        results.setText(male_result);
//        } catch (Exception e) {
////            Toast error = makeText(this, "Please enter all the feilds", LENGTH_LONG).show();
//        }if(female == true){
//            female_results = (int) (10 * weight + 6.25 * height - 5 * age + 161);
//        }
    }


}
