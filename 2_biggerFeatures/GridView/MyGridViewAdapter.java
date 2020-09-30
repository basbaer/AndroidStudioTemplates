package com.basbaer.baked;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;

public class MyGridViewAdapter extends BaseAdapter {

    private Context context;

    //there can also be other variables be created;

    //implementing an constructor
    public MyGridViewAdapter(Context context){
        super();

        this.context = context;
    }



    //returns the amount of items
    @Override
    public int getCount() {
        return <amount of items>;
    }



    @Override
    public Object getItem(int position) {
      //gets the item out of a ArrayList or something
        return <item>;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //get's the layout from a xml file
        View view = LayoutInflater.from(context).inflate(<your_layout_file>, parent, false);

        //setting up the views
        /*example:
        ImageView colorImageView = view.findViewById(R.id.colorIV);
        final CardView outerCardView = view.findViewById(R.id.outerCardView);
        final String currentColor = ColorHandler.getColorsArrayList().get(position);
        */


        //manipulating the views
        /*example:
        colorImageView.setBackgroundColor(Color.parseColor(currentColor));
        */

        //Optional: creating on click listener
        /*example:
        colorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddActivity.color = currentColor;

                outerCardView.setCardBackgroundColor(Color.parseColor("#000000"));

                Log.i("TappedColor", ColorHandler.getColorsArrayList().get(position));

            }
        });
        */

        return view;
    }



}
