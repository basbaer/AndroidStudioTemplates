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

public class ColorPickerAdapter extends BaseAdapter {

    private Context context;
    private String selectedColor;

    //standard constructor (without a preselected Color)
    public ColorPickerAdapter(Context context){
        super();

        this.context = context;
        this.selectedColor = null;
    }

    //can be called if you want to preselect a color
    public ColorPickerAdapter(Context context, String selectedColor){
        super();

        this.context = context;
        this.selectedColor = selectedColor;


    }


    //returns the amount of items (in this case, there are 15 different colors)
    @Override
    public int getCount() {
        return 15;
    }



    @Override
    public Object getItem(int position) {
        return ColorHandler.getColorsArrayList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //get's the layout
        View view = LayoutInflater.from(context).inflate(R.layout.color_picker_layout, parent, false);

        ImageView colorImageView = view.findViewById(R.id.colorIV);

        //the BackgroundColor of the outerCardView is the color that surrounds the circles -> shows, which color is currently selected
        final CardView outerCardView = view.findViewById(R.id.outerCardView);

        //the ColorHandler class manages all stuff regarding the colors
        final String currentColor = ColorHandler.getColorsArrayList().get(position);

        //sets one color as selected, if the constructor is calles, which sets a color as selected (it is selected, only if it exists)
        if(selectedColor != null && selectedColor.equals(currentColor)) {

            outerCardView.setCardBackgroundColor(Color.parseColor("#000000"));

        }



        //sets the different colors as backgrounds
        colorImageView.setBackgroundColor(Color.parseColor(currentColor));


        //creating on click listener
        colorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddActivity.color = currentColor;

                outerCardView.setCardBackgroundColor(Color.parseColor("#000000"));

                Log.i("TappedColor", ColorHandler.getColorsArrayList().get(position));

            }
        });

        return view;
    }



}
