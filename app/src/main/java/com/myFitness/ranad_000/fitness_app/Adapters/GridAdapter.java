package com.myFitness.ranad_000.fitness_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myFitness.ranad_000.fitness_app.R;

import java.util.ArrayList;

/**
 * Created by ranad_000 on 2/16/2018.
 */

public class GridAdapter extends BaseAdapter {
    Context c;
    private ArrayList<ItemObject> Data;

    public GridAdapter(Context c, ArrayList<ItemObject> data) {
        this.c = c;
        this.Data = data;
    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int i) {
        return Data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.card_grid__layout,viewGroup,false);
        }

        final ItemObject s= (ItemObject) this.getItem(i);

        ImageView img= (ImageView) view.findViewById(R.id.cardImage);
        TextView nameTxt= (TextView) view.findViewById(R.id.cardText);
        //TextView propTxt= (TextView) view.findViewById(R.id.propellantTxt);

        //BIND
        nameTxt.setText(s.getTitle());
        //propTxt.setText(s.getPropellant());
        img.setImageResource(s.getImageID());


        return view;
    }
}