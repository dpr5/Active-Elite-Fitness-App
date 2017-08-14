package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.myFitness.ranad_000.fitness_app.R;

public class nutritionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_actitity);


        String[] Diets_list = {"Keto Diet", "Intermittent Fasting", "Paleo Diet", "more diets coming soon..."};
        ListAdapter diets = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Diets_list);
        ListView mylist = (ListView) findViewById(R.id.my_list);
        mylist.setAdapter(diets);

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent bench = new Intent(view.getContext(), Keto_Diet.class);
                    startActivityForResult(bench, 0);
                }
                if (position == 1) {
                    Intent incline = new Intent(view.getContext(), Intermittent_Fasting.class);
                    startActivityForResult(incline, 0);
                }
                if (position == 2) {
                    Intent decline = new Intent(view.getContext(), Paleo_Diet.class);
                    startActivityForResult(decline, 0);
                }
                if (position == 3) {
                    Intent decline = new Intent(view.getContext(), LegWorkoutActivity.class);
                    startActivityForResult(decline, 0);
                }
            }
        });


    }

}
