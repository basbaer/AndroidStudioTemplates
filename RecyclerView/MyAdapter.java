package com.example.recyclerviewtemplate;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private  ArrayList<String> arrayList;


    public MyAdapter(ArrayList<String> incomingArrayList) {
        arrayList = incomingArrayList;
    }


    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Option 1: Set up given 'look' from Android
        //View viewThatGetsDisplayed = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        //Option 2: Set up your own 'look' via a TextView which functions as a template
        View viewThatGetsDisplayed = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(viewThatGetsDisplayed);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position));

        Log.i("ViewHOlder", "run");
    }

    @Override
    public int getItemCount() {
        Log.i("getItemCount", String.valueOf(arrayList.size()));
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(View incomingTextView){
            super(incomingTextView);
            //Option 1
            //textView = (TextView) incomingTextView;

            //Option 2
            textView = incomingTextView.findViewById(R.id.textViewForRecyclerView);
        }
    }

}
