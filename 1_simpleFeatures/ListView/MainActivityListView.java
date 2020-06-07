package com.basbaer.simplelistviewtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect the listView variable with the listView from the layout
        listView = findViewById(R.id.listView);

        //in the ArrayList, you save all the entries for your List
        ArrayList<String> myList = new ArrayList<>();

        //add entries to the list
        myList.add("Basti");
        myList.add("Adri");

        //ArrayAdapter handles to put the entries of the ArrayList into the ListView
        //first parameter: context -> here: this
        //second parameter: layout of the listView -> android.R.layout.simple_list_item_1 is a standard simple layout
        //third parameter: the ArrayList that should be displayed
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);

        //connect the Adapter with the ListView
        listView.setAdapter(arrayAdapter);

        //important: if you change the ArrayList, after you have created the Adapter (for example, when you updated it)
        //you have to notify the adapter, that the list has changed
        arrayAdapter.notifyDataSetChanged();



        //Optinonal
        //1. add a OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //write here code for what should happen, if someone taps on an list entry

            }
        });


        //2. add a Listener for what should happen if somebode long presses on a entry
        listView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //code for what should happen on long press of an entry

                //return must be true. If not, the 'normal' onItemClicked method get's called
                return true;
            }
        });


    }
}
