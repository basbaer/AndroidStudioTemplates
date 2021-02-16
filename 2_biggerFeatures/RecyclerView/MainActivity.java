package com.example.recyclerviewtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtemplate.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;
    private RecyclerView.Adapter myAdapterForRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    	View view = activityMainBinding.getRoot();
        setContentView(view);

        //ArrayList which will be displayed
        ArrayList<String> arrayListToBeDisplayed = new ArrayList<>();
        arrayListToBeDisplayed.add("Karl Kani");

        myRecyclerView = findViewById(activityMainBinding.recyclerview);

        //if the view has a fixed size, add this for better performance
        //myRecyclerView.setHasFixedSize(true);

        //setting up the LinearLayoutManager -> there are more possibe, but the 
	//LinearLayoutManager comes closest to the ListView
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        //setting up the Adapter
        myAdapterForRecyclerView = new MyAdapter(arrayListToBeDisplayed);
        myRecyclerView.setAdapter(myAdapterForRecyclerView);

    }
}
