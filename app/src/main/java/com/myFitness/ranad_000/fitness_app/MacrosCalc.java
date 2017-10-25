package com.myFitness.ranad_000.fitness_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;


public class MacrosCalc extends AppCompatActivity {

    private int weight;
    private int height;
    private int age;
    private TextView results;

    private boolean male;
    private boolean female;

    private int male_result;
    private int female_results;

    private Spinner genderSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros_calc);

        TextView weight = (TextView) findViewById(R.id.weight);
//        genderSpinner = (Spinner) findViewById(R.id.spinner);
//
//
//        String[] array = getResources().getStringArray(R.array.age);
//        Integer[] age_array = new Integer[array.length];
//        for (int i = 0; i < 100; i++) {
//            age_array[i] = Integer.parseInt(array[i]);
//        }
//
//        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, age_array);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        genderSpinner.setAdapter(adapter);
        //males
        // 10 * weight(kg) + 6.25 * height(cm) - 5 * age + 5

        //females
        // 10 * weight(kg) + 6.25 * height(cm) - 5 * age + 161
    }

    public void macrosCalculate(View v) {
//        if (male == true) try {
            male_result = (int) (10 * weight + 6.25 * height - 5 * age + 5);
            results = (TextView)findViewById(R.id.results);
            results.setText(male_result);
//        } catch (Exception e) {
////            Toast error = makeText(this, "Please enter all the feilds", LENGTH_LONG).show();
//        }if(female == true){
//            female_results = (int) (10 * weight + 6.25 * height - 5 * age + 161);
//        }
    }
}
