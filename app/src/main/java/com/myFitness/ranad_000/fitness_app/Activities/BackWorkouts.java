package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

public class BackWorkouts extends AppCompatActivity implements RecyclerViewClickListener {

    private CardAdapter adapter;
    private RecyclerView recView;



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
                Intent calendar = new Intent(BackWorkouts.this, calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(BackWorkouts.this, MainActivity.class);
                startActivity(home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Iso Row", R.drawable.isorow1);
        Data.add(card);

        card = new Data_for_Cards("Laeral Pulldown", R.drawable.latpulldown1);
        Data.add(card);

        card = new Data_for_Cards("Low Row", R.drawable.bent_over_row1);
        Data.add(card);

        card = new Data_for_Cards("T-Bar Row", R.drawable.tbar_row1);
        Data.add(card);

        card = new Data_for_Cards("More Workouts coming soon...", R.drawable.coming_soon);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
        switch (position) {
            case 0:
                Intent chest = new Intent(BackWorkouts.this, Back_IsoRow_Workout_Activity.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(BackWorkouts.this, Back_LatPulldown_Workout_Activity.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(BackWorkouts.this, Back_LowRow_Workout_Activity.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(BackWorkouts.this, Back_TBarRow_Workout_Activity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(BackWorkouts.this, Chest_CablePress_Workout_Activity.class);
                startActivity(shoulder);
                break;
        }
    }
}


