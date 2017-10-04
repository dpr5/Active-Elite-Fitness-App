package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;


public class BodyPartSelection extends AppCompatActivity implements RecyclerViewClickListener {

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> Data = new ArrayList<>();

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_selection);


        recView = (RecyclerView) findViewById(R.id.recView);

        adapter = new CardAdapter(Data, this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();


    }


    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Chest Workouts", R.drawable.bench_wide1);
        Data.add(card);

        card = new Data_for_Cards("Back Workouts", R.drawable.latpulldown1);
        Data.add(card);

        card = new Data_for_Cards("Arm Workouts", R.drawable.barbell_curl1);
        Data.add(card);

        card = new Data_for_Cards("Leg Workouts", R.drawable.front_squat1);
        Data.add(card);

        card = new Data_for_Cards("Shoulder Workouts", R.drawable.lateral_raises1);
        Data.add(card);

        card = new Data_for_Cards("More Workouts coming soon...", R.drawable.coming_soon);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
        String toastMessage = "Item #" + position + " clicked";
        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
        mToast.show();
//        switch (position) {
//            case 0:
//                Intent chest = new Intent(BodyPartSelection.this, nutritionActivity.class);
//                startActivity(chest);
//                break;
//            case 1:
//                Intent back = new Intent(BodyPartSelection.this, BackWorkouts.class);
//                startActivity(back);
//                break;
//            case 2:
//                Intent arms = new Intent(BodyPartSelection.this, Arm_Workout_Activity.class);
//                startActivity(arms);
//                break;
//            case 3:
//                Intent leg = new Intent(BodyPartSelection.this, LegWorkoutActivity.class);
//                startActivity(leg);
//                break;
//            case 4:
//                Intent shoulder = new Intent(BodyPartSelection.this, ShoulderWorkoutActivity.class);
//                startActivity(shoulder);
//                break;
//        }
    }
}

