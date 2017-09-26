package com.myFitness.ranad_000.fitness_app.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

import java.util.List;

/**
 * Created by ranad_000 on 9/20/2017.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.NumberViewHolder> {

    private List<Card_for_nutrition> nutritionCard;


    public class NumberViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public ImageView image;

        public NumberViewHolder(View itemView) {
            super(itemView);

            text = (TextView) itemView.findViewById(R.id.card_title);
            image = (ImageView) itemView.findViewById(R.id.card_image);
        }
    }

    public CardAdapter(List<Card_for_nutrition> nutritionCard) {
        this.nutritionCard = nutritionCard;
    }

    @Override
    public CardAdapter.NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
//        Context context = parent.getContext();
//        int layoutForListItem = R.layout.cardlayout;
//        LayoutInflater inflater = LayoutInflater.from(context);
//        boolean shouldAtachToParentImmediately = false;
//        View view = inflater.inflate(layoutForListItem, parent, shouldAtachToParentImmediately);
//        NumberViewHolder viewHolder = new NumberViewHolder(view);
        //return viewHolder;
        return new CardAdapter.NumberViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(CardAdapter.NumberViewHolder holder, int position) {
        Card_for_nutrition card_for_nutrition = nutritionCard.get(position);
        holder.text.setText(card_for_nutrition.getTitle());
        holder.image.setImageResource(card_for_nutrition.getImageID());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return nutritionCard.size();
    }

}
