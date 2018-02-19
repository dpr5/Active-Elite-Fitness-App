package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Arm_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.ChestWorkoutActivity;
import com.myFitness.ranad_000.fitness_app.Activities.LegsWorkout.LegWorkoutActivity;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.BackWorkouts;
import com.myFitness.ranad_000.fitness_app.Adapters.GridAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.ItemObject;
import com.myFitness.ranad_000.fitness_app.R;
import com.myFitness.ranad_000.fitness_app.ShoulderWorkouts.ShoulderWorkoutActivity;

import java.util.ArrayList;
import java.util.List;


public class BodyPartSelection extends AppCompatActivity implements RecyclerViewClickListener {

    private ViewPager mViewPager;

    Toast mToast;

    private List<ItemObject> Data = new ArrayList<>();
    GridAdapter adapter;
    GridView gv;


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
                        Intent chest = new Intent(BodyPartSelection.this, ChestWorkoutActivity.class);
                        startActivity(chest);
                        break;
                    case 1:
                        Intent back = new Intent(BodyPartSelection.this, BackWorkouts.class);
                        startActivity(back);
                        break;
                    case 2:
                        Intent arms = new Intent(BodyPartSelection.this, LegWorkoutActivity.class);
                        startActivity(arms);
                        break;
                    case 3:
                        Intent leg = new Intent(BodyPartSelection.this, ShoulderWorkoutActivity.class);
                        startActivity(leg);
                        break;
                    case 4:
                        Intent shoulder = new Intent(BodyPartSelection.this, Arm_Workout_Activity.class);
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
                Intent calendar = new Intent(BodyPartSelection.this, calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(BodyPartSelection.this, MainActivity.class);
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
        s.setTitle("Chest Workouts");
        s.setImageID(R.drawable.bench_wide1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Back Workouts");
        s.setImageID(R.drawable.tbar_row1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Leg Workouts");
        s.setImageID(R.drawable.front_squat1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Shoulder Workouts");
        s.setImageID(R.drawable.lateral_raises1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Arm Workouts");
        s.setImageID(R.drawable.barbell_curl2);
        card.add(s);


        return card;
    }


    @Override
    public void onListItemClick(int position) {
        switch (position) {
            case 0:
                Intent chest = new Intent(BodyPartSelection.this, ShoulderWorkoutActivity.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(BodyPartSelection.this, BackWorkouts.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(BodyPartSelection.this, Arm_Workout_Activity.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(BodyPartSelection.this, LegWorkoutActivity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(BodyPartSelection.this, ChestWorkoutActivity.class);
                startActivity(shoulder);
                break;
        }
    }

}
