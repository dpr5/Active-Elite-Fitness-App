package com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts;


import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Activities.MainActivity;
import com.myFitness.ranad_000.fitness_app.Activities.RecyclerViewClickListener;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

public class Arm_Workout_Activity extends AppCompatActivity implements RecyclerViewClickListener {

    private ViewPager mViewPager;

    private CardAdapter adapter;
    private RecyclerView recView;

    Toast mToast;


    private List<Data_for_Cards> Data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        toolbar.inflateMenu(R.menu.nav_bar_menu);


        recView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new CardAdapter(Data, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.calendar:
                Intent calendar = new Intent(Arm_Workout_Activity.this, com.myFitness.ranad_000.fitness_app.Activities.calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(Arm_Workout_Activity.this, MainActivity.class);
                startActivity(home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Barbell Bicep Curl", R.drawable.barbell_curl1);
        Data.add(card);

        card = new Data_for_Cards("Dumbbell BIcep Curl", R.drawable.dubbell_curl1);
        Data.add(card);

        card = new Data_for_Cards("Hammer Curl", R.drawable.hammer_curls1);
        Data.add(card);

        card = new Data_for_Cards("Tricep Pushdown", R.drawable.tricep_pushdown1);
        Data.add(card);

        card = new Data_for_Cards("Tricep Kick Back", R.drawable.tricep_kickback1);
        Data.add(card);

        card = new Data_for_Cards("Skull Crushers", R.drawable.skull_crusher1);
        Data.add(card);

        card = new Data_for_Cards("More Workouts coming soon...", R.drawable.coming_soon);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
        switch (position) {
            case 0:
                Intent chest = new Intent(Arm_Workout_Activity.this, Bicep_BarbellCurl_Workout_Activity.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(Arm_Workout_Activity.this, Bicep_DumbBell_Workout_Activity.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(Arm_Workout_Activity.this, Bicep_HammerCurl_Workout_Activity.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(Arm_Workout_Activity.this, Tricep_TricepExnt_Workout_Activity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(Arm_Workout_Activity.this, Tricep_TricepPushDown_Workout_Activity.class);
                startActivity(shoulder);
                break;
            case 5:
                Intent act5 = new Intent(Arm_Workout_Activity.this, Tricep_SkullCrusher_Workout_Activity.class);
                startActivity(act5);
                break;
        }
    }
}