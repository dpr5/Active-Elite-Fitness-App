package com.myFitness.ranad_000.fitness_app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ranad_000 on 7/14/2017.
 */

public class NutritionAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String[] titles = {"Keto Diet",
            "Nutrition Plans",
            "Low Carb Diet",
            "Caloric Defict Diet",
            "Excess Caloric Diet",

            "Coming Soon"};

    private String[] details = {"Click for a keto diet guide",
            "Click for a nutrition plan guide", "Click for a low carb diet guide",
            "Click for a caloric defict diet guide", "Click for a excess caloric dietcore guide",
            "Comming Soon"};

    private int[] images = {R.drawable.weighticon,
            R.drawable.weighticon,
            R.drawable.weighticon,
            R.drawable.weighticon,
            R.drawable.weighticon,
            R.drawable.weighticon};

    static class ViewHolder extends RecyclerView.ViewHolder {

        public int currentItem;
        private ImageView itemImage;
        private TextView itemTitle;
        private TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);

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

