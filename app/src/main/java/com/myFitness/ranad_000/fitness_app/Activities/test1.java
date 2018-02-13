package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Bicep_BarbellCurl_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

public class test1 extends AppCompatActivity implements RecyclerViewClickListener {

    private ViewPager mViewPager;

    private CardAdapter adapter;
    private RecyclerView recView;

    Toast mToast;


    private List<Data_for_Cards> Data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_selection);

        recView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new CardAdapter(Data, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();
    }


    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Chest Workouts", R.drawable.chest_image);
        Data.add(card);

        card = new Data_for_Cards("Back Workouts", R.drawable.backfly1);
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
        switch (position) {
            case 0:
                Intent chest = new Intent(test1.this, test2.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(test1.this, Bicep_BarbellCurl_Workout_Activity.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(test1.this, Bicep_BarbellCurl_Workout_Activity.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(test1.this, Bicep_BarbellCurl_Workout_Activity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(test1.this, Bicep_BarbellCurl_Workout_Activity.class);
                startActivity(shoulder);
                break;
        }
    }
}