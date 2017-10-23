package com.myFitness.ranad_000.fitness_app.Activities;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.myFitness.ranad_000.fitness_app.Adapters.CardAdapter;
import com.myFitness.ranad_000.fitness_app.Adapters.Data_for_Cards;
import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;


public class ShoulderWorkoutActivity extends AppCompatActivity implements RecyclerViewClickListener {

    private ViewPager mViewPager;

    private CardAdapter adapter;
    private RecyclerView recView;

    Toast mToast;


    private List<Data_for_Cards> Data = new ArrayList<>();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.nav_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.calendar:
                Intent calendar = new Intent(ShoulderWorkoutActivity.this, calendar.class);
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

    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Shoulder Press", R.drawable.shoulder_press1);
        Data.add(card);

        card = new Data_for_Cards("Arnold Shoulder Press", R.drawable.arnold_press1);
        Data.add(card);

        card = new Data_for_Cards("Lateral Raise", R.drawable.lateral_raises1);
        Data.add(card);

        card = new Data_for_Cards("Front Raise", R.drawable.front_raise1);
        Data.add(card);

        card = new Data_for_Cards("Upright Row", R.drawable.upright_row1);
        Data.add(card);

        card = new Data_for_Cards("Rear Delt Workout", R.drawable.rear_delt1);
        Data.add(card);

        card = new Data_for_Cards("More Workouts coming soon...", R.drawable.coming_soon);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
        switch (position) {
            case 0:
                Intent bench = new Intent(ShoulderWorkoutActivity.this, Shoulder_ShoulderPress_Workout_Activity.class);
                startActivityForResult(bench, 0);
                break;
            case 1:
                Intent incline = new Intent(ShoulderWorkoutActivity.this, Shoulder_ArnoldPress_Workout_Activity.class);
                startActivityForResult(incline, 0);
                break;
            case 2:
                Intent decline = new Intent(ShoulderWorkoutActivity.this, Shoulder_LateralRaise_Workout_Activity.class);
                startActivityForResult(decline, 0);
                break;
            case 3:
                Intent act4 = new Intent(ShoulderWorkoutActivity.this, Shoulder_FrontRaise_Workout_Activity.class);
                startActivityForResult(act4, 0);
                break;
            case 4:
                Intent fly = new Intent(ShoulderWorkoutActivity.this, Shoulder_UprightRow_Workout_Activity.class);
                startActivityForResult(fly, 0);
                break;
            case 5:
                Intent last = new Intent(ShoulderWorkoutActivity.this, Shoulder_Delt_Workout_Activity.class);
                startActivityForResult(last, 0);
                break;
        }
    }
}