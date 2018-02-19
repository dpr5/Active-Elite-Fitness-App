package com.myFitness.ranad_000.fitness_app.ShoulderWorkouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.BackFly_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.BackWorkouts;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.Back_IsoRow_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.Back_LatPulldown_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.Back_LowRow_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.BackWorkouts.Back_TBarRow_Workout_Activity;
import com.myFitness.ranad_000.fitness_app.Activities.MainActivity;
import com.myFitness.ranad_000.fitness_app.Activities.RecyclerViewClickListener;
import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.Adapters.GridAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.ItemObject;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;


public class ShoulderWorkoutActivity extends AppCompatActivity {

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
                        Intent chest = new Intent(ShoulderWorkoutActivity.this, Shoulder_ArnoldPress_Workout_Activity.class);
                        startActivity(chest);
                        break;
                    case 1:
                        Intent back = new Intent(ShoulderWorkoutActivity.this, Shoulder_Delt_Workout_Activity.class);
                        startActivity(back);
                        break;
                    case 2:
                        Intent arms = new Intent(ShoulderWorkoutActivity.this, Shoulder_FrontRaise_Workout_Activity.class);
                        startActivity(arms);
                        break;
                    case 3:
                        Intent leg = new Intent(ShoulderWorkoutActivity.this, Shoulder_LateralRaise_Workout_Activity.class);
                        startActivity(leg);
                        break;
                    case 4:
                        Intent shoulder = new Intent(ShoulderWorkoutActivity.this, Shoulder_ShoulderPress_Workout_Activity.class);
                        startActivity(shoulder);
                        break;
                    case 5:
                        Intent shoulder2 = new Intent(ShoulderWorkoutActivity.this, Shoulder_UprightRow_Workout_Activity.class);
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
                Intent calendar = new Intent(ShoulderWorkoutActivity.this, com.myFitness.ranad_000.fitness_app.Activities.calendar.class);
                startActivity(calendar);
                return true;
            case R.id.home:
                Intent home = new Intent(ShoulderWorkoutActivity.this, MainActivity.class);
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
        s.setTitle("Arnold Press");
        s.setImageID(R.drawable.arnold_press1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Rear Delt Raise");
        s.setImageID(R.drawable.rear_delt2);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Front Shoulder Raise");
        s.setImageID(R.drawable.front_raise1);
        card.add(s);


        s=new ItemObject();
        s.setTitle("Lateral Shoulder Raise");
        s.setImageID(R.drawable.lateral_raises1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Shoulder Press");
        s.setImageID(R.drawable.shoulder_press1);
        card.add(s);

        s=new ItemObject();
        s.setTitle("Upright Rows");
        s.setImageID(R.drawable.upright_row1);
        card.add(s);


        return card;
    }


}
