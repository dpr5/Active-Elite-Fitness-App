package com.myFitness.ranad_000.fitness_app.Activities.LegsWorkout;

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

import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Arm_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Bicep_BarbellCurl_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Bicep_DumbBell_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Bicep_HammerCurl_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Tricep_SkullCrusher_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Tricep_TricepExnt_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.ArmWorkouts.Tricep_TricepPushDown_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.BackWorkouts;
import com.myFitness.ranad_000.fitness_app.Activities.BodyPartSelection;
import com.myFitness.ranad_000.fitness_app.Activities.ChestWorkouts.ChestWorkoutActivity;
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

public class LegWorkoutActivity extends AppCompatActivity implements RecyclerViewClickListener {

    private ViewPager mViewPager;

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
                        Intent chest = new Intent(LegWorkoutActivity.this, Leg_Calves_Workout_Activity.class);
                        startActivity(chest);
                        break;
                    case 1:
                        Intent back = new Intent(LegWorkoutActivity.this, Leg_Hamstrings_Workout_Activity.class);
                        startActivity(back);
                        break;
                    case 2:
                        Intent arms = new Intent(LegWorkoutActivity.this, Leg_LegExtn_Workout_Activity.class);
                        startActivity(arms);
                        break;
                    case 3:
                        Intent leg = new Intent(LegWorkoutActivity.this, Leg_LegPress_Workout_Activity.class);
                        startActivity(leg);
                        break;
                    case 4:
                        Intent shoulder = new Intent(LegWorkoutActivity.this, Leg_Lunges_Workout_Activity.class);
                        startActivity(shoulder);
                        break;
                    case 5:
                        Intent shoulder1 = new Intent(LegWorkoutActivity.this, Leg_Squats_Workout_Activity.class);
                        startActivity(shoulder1);
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
                Intent calendar = new Intent(LegWorkoutActivity.this, com.myFitness.ranad_000.fitness_app.Activities.calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(LegWorkoutActivity.this, MainActivity.class);
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
        s.setTitle("Calf Workout");
        s.setImageID(R.drawable.calf_raise1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Hamstring Workout");
        s.setImageID(R.drawable.hamstring1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Leg Extension Workout");
        s.setImageID(R.drawable.leg_extension1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Leg Press Workout");
        s.setImageID(R.drawable.leg_press1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Lunge Workout");
        s.setImageID(R.drawable.lunges1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Squats Workout");
        s.setImageID(R.drawable.front_squat1);
        card.add(s);

        return card;
    }


    @Override
    public void onListItemClick(int position) {
        switch (position) {
            case 0:
                Intent chest = new Intent(LegWorkoutActivity.this, ShoulderWorkoutActivity.class);
                startActivity(chest);
                break;
            case 1:
                Intent back = new Intent(LegWorkoutActivity.this, BackWorkouts.class);
                startActivity(back);
                break;
            case 2:
                Intent arms = new Intent(LegWorkoutActivity.this, Arm_Workout_Activity.class);
                startActivity(arms);
                break;
            case 3:
                Intent leg = new Intent(LegWorkoutActivity.this, LegWorkoutActivity.class);
                startActivity(leg);
                break;
            case 4:
                Intent shoulder = new Intent(LegWorkoutActivity.this, ChestWorkoutActivity.class);
                startActivity(shoulder);
                break;
        }
    }

}
