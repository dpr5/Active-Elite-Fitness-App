package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_Plan;
import com.myFitness.ranad_000.fitness_app.Activities.Diets.Intermittent_Fasting;
import com.myFitness.ranad_000.fitness_app.Activities.Diets.Keto_Diet;
import com.myFitness.ranad_000.fitness_app.Activities.LegsWorkout.LegWorkoutActivity;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;
import com.myFitness.ranad_000.fitness_app.ShoulderWorkouts.ShoulderWorkoutActivity;

import java.util.ArrayList;
import java.util.List;

public class nutritionActivity extends AppCompatActivity implements RecyclerViewClickListener {

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> nutritionCard = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_actitity);

        recView = (RecyclerView) findViewById(R.id.recView);

        adapter = new CardAdapter(nutritionCard, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.nav_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.calendar:
                Intent calendar = new Intent(nutritionActivity.this, calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(nutritionActivity.this, MainActivity.class);
                startActivity(home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

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

    @Override
    public void onListItemClick(int clickedItemIndex) {
        switch (clickedItemIndex) {
            case 0:
                Intent chest = new Intent(nutritionActivity.this, Keto_Diet.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(nutritionActivity.this, Intermittent_Fasting.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(nutritionActivity.this, Chest_Plan.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(nutritionActivity.this, LegWorkoutActivity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(nutritionActivity.this, ShoulderWorkoutActivity.class);
                startActivity(shoulder);
                break;
        }
    }
}
