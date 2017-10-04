package com.myFitness.ranad_000.fitness_app.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

public class WorkoutActivity extends AppCompatActivity {


    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> nutritionCard = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        recView = (RecyclerView) findViewById(R.id.recView);
        //adapter = new CardAdapter(nutritionCard);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();

    }

    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Keto", R.drawable.keto_diet_image);
        nutritionCard.add(card);

        card = new Data_for_Cards("Fasting", R.drawable.intermittent_fasting);
        nutritionCard.add(card);

        card = new Data_for_Cards("KCalorieeto", R.drawable.calf_raise1);
        nutritionCard.add(card);

        card = new Data_for_Cards("Keto", R.drawable.keto_diet_image);
        nutritionCard.add(card);

    }
}