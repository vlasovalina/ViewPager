package com.example.user.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CustomAdapter extends PagerAdapter {

    private int [] imageResources ={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
    };

    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context c)
    {
        ctx=c;
    }

    @Override
    public int getCount() {

        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView=layoutInflater.inflate(R.layout.swap_layout,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.image_view);
        imageView.setImageResource(imageResources[position]);
        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==(LinearLayout)object);
    }
}

