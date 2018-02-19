package com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts;

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
import android.widget.GridView;

import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Arm_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.BodyPartSelection;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.ChestWorkoutActivity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_CablePress_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.LegsWorkout.LegWorkoutActivity;
import com.myFitness.ranad_000.fitness_app.Activities.MainActivity;
import com.myFitness.ranad_000.fitness_app.Activities.RecyclerViewClickListener;
import com.myFitness.ranad_000.fitness_app.Activities.calendar;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.Adapters.GridAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.ItemObject;
import com.myFitness.ranad_000.fitness_app.R;
import com.myFitness.ranad_000.fitness_app.ShoulderWorkouts.ShoulderWorkoutActivity;

import java.util.ArrayList;
import java.util.List;

public class BackWorkouts extends AppCompatActivity{

    GridAdapter adapter;
    GridView gv;


    private List<Data_for_Cards> Data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.inflateMenu(R.menu.nav_bar_menu);


        gv= (GridView) findViewById(R.id.gridview);

        adapter=new GridAdapter(this,getData());
        gv.setAdapter(adapter);


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Position: " + position, Toast.LENGTH_SHORT).show();
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
                        Intent shoulder = new Intent(BackWorkouts.this, BackFly_Workout_Activity.class);
                        startActivity(shoulder);
                        break;
                }
            }
        });
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
                Intent calendar = new Intent(BackWorkouts.this, com.myFitness.ranad_000.fitness_app.Activities.calendar.class);
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

    private ArrayList getData()
    {
        ArrayList<ItemObject> card=new ArrayList<>();

        ItemObject s=new ItemObject();
        s.setTitle("Iso Row");
        s.setImageID(R.drawable.isorow1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Lat Pulldown");
        s.setImageID(R.drawable.latpulldown1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Low Row");
        s.setImageID(R.drawable.bent_over_row1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Tbar Row");
        s.setImageID(R.drawable.tbar_row1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Back Fly");
        s.setImageID(R.drawable.backfly1);
        card.add(s);


        return card;
    }

}
