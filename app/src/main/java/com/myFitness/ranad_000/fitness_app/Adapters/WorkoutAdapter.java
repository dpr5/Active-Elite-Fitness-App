package com.myFitness.ranad_000.fitness_app.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

/**
 * Created by ranad_000 on 7/12/2017.
 */

public class WorkoutAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements View.OnClickListener{

    private String[] titles = {"Chest Workout",
            "Arm Workout",
            "Leg Workout",
            "Shoulder Workout",
            "Core Workout",
            "Body Weight Workout",
            "Crossfit Workout",
            "Coming Soon"};

    private String[] details = {"Click for a chest workout guide",
            "Click for a arm workout guide", "Click for a leg workout guide",
            "Click for a shoulder workout guide", "Click for a core workout guide",
            "Click for a back workout guide", "Click for a crossfit workout guide",
            "Comming Soon"};

    private int[] images = {R.drawable.chest_icon,
            R.drawable.weighticon,
            R.drawable.leg_icon,
            R.drawable.shoulder_icon,
            R.drawable.abs_icon,
            R.drawable.torso_icon,
            R.drawable.weighticon,
            R.drawable.weighticon,
            };

    @Override
    public void onClick(View v) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener((View.OnClickListener) this);
           // itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            //itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            //itemDetail = (TextView) itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
/*
                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
*/
                }
            });
        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardlayout, viewGroup, false);
        RecyclerAdapter.ViewHolder viewHolder = new RecyclerAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
