package com.myFitness.ranad_000.fitness_app.Activities;

import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ranad_000 on 9/18/2017.
 */

public class Cards {

    private int imageID;
    private String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static List<Cards> getObjectList() {
        List<Cards> datalist = new ArrayList<>();
        int[] images = getImages();

        for (int i = 0;i < images.length; i++) {
            Cards card = new Cards();
            card.setImageID(images[i]);
            card.setTitle("Picture " + i);
            datalist.add(card);
        }
        return datalist;
    }

    private static int[] getImages() {
        int[] images = {
                R.drawable.cable_press1,
                R.drawable.calf_raise1,
                R.drawable.bench_wide1,
                R.drawable.lat_speed_set1,
                R.drawable.leg_extension1,
                R.drawable.shoulder_press1,
                R.drawable.lateral_raises2,

        };
        return images;
    }
}



