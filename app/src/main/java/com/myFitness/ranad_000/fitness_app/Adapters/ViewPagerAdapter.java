package com.myFitness.ranad_000.fitness_app.Adapters;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.myFitness.ranad_000.fitness_app.R;

/**
 * Created by ranad_000 on 8/21/2017.
 */

public class ViewPagerAdapter extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.burpee1, R.drawable.jumping_jack1, R.drawable.arnold_press1};

    public ViewPagerAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slideshow_cardio, null);

        ImageView imageView = (ImageView)view.findViewById(R.id.cardio_slideshow);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager)container;
        View view = (View)object;
        vp.removeView(view);
    }
}
