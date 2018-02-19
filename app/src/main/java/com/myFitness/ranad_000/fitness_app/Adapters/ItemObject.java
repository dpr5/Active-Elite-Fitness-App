package com.myFitness.ranad_000.fitness_app.Adapters;

/**
 * Created by ranad_000 on 2/16/2018.
 */

public class ItemObject {

    private String title;
    private int ImageID;



    public ItemObject() {

    }

    public ItemObject(String title, int ImageID) {
        this.title = title;
        this.ImageID = ImageID;
    }

    //private List<Card_for_nutrition> card;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

}