package com.myFitness.ranad_000.fitness_app.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Card_for_nutrition;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

public class nutritionActivity extends AppCompatActivity {

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Card_for_nutrition> nutritionCard = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_actitity);

        recView = (RecyclerView) findViewById(R.id.recView);
        adapter = new CardAdapter(nutritionCard);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();

    }

    private void initData(){
        Card_for_nutrition card = new Card_for_nutrition("Keto", R.drawable.keto_diet_image);
        nutritionCard.add(card);

        card = new Card_for_nutrition("Fasting", R.drawable.intermittent_fasting);
        nutritionCard.add(card);

        card = new Card_for_nutrition("KCalorieeto", R.drawable.calf_raise1);
        nutritionCard.add(card);

        card = new Card_for_nutrition("Keto", R.drawable.keto_diet_image);
        nutritionCard.add(card);

    }


}
