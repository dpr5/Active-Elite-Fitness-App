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
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.ChestWorkoutActivity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_Bench_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_CablePress_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_Decline_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_Fly_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.Chest_Incline_Bench_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.MainActivity;
import com.myFitness.ranad_000.fitness_app.Activities.RecyclerViewClickListener;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.Adapters.GridAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.ItemObject;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

public class Arm_Workout_Activity extends AppCompatActivity{

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
                        Intent leg = new Intent(Arm_Workout_Activity.this, Tricep_SkullCrusher_Workout_Activity.class);
                        startActivity(leg);
                        break;
                    case 4:
                        Intent shoulder = new Intent(Arm_Workout_Activity.this, Tricep_TricepExnt_Workout_Activity.class);
                        startActivity(shoulder);
                        break;
                    case 5:
                        Intent shoulder2 = new Intent(Arm_Workout_Activity.this, Tricep_TricepPushDown_Workout_Activity.class);
                        startActivity(shoulder2);
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

    private ArrayList getData()
    {
        ArrayList<ItemObject> card=new ArrayList<>();

        ItemObject s=new ItemObject();
        s.setTitle("Barbell Bicep Curl");
        s.setImageID(R.drawable.barbell_curl2);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Dumbell Bicep Curl");
        s.setImageID(R.drawable.dubbell_curl2);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Dumbell Hammer Curl");
        s.setImageID(R.drawable.hammer_curls2);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Skull Crushers");
        s.setImageID(R.drawable.skull_crusher1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Tricep Extension");
        s.setImageID(R.drawable.dubbell_tricep2);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Tricep Pushdown");
        s.setImageID(R.drawable.tricep_pushdown1);
        card.add(s);

        return card;
    }


}
