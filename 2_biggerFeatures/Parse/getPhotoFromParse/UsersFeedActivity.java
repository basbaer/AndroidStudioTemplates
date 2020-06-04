package com.basti.runcleshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;

import com.parse.FindCallback;
import com.parse.GetDataCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

public class UsersFeedActivity extends AppCompatActivity {

    RecyclerView usersFeedRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_feed);

       
		//ImageView which displays the picture later
        final ImageView imageView = findViewById(R.id.ImageFeed);

        ParseQuery<ParseObject> imageQuery = ParseQuery.getQuery("Image");

		//sucht sich nur die Bilder, die von karlkani hochgeladen wurden
        imageQuery.whereEqualTo("username", "karlkani"));

        imageQuery.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    Log.i("findInBackground", "Retrieved " + objects.size() + " objects");

                    if(objects.size() > 0){

						//führt diese Aktion für jedes gefunden Object aus
                        for(ParseObject object : objects){

                            ParseFile file = object.getParseFile("image");

                            file.getDataInBackground(new GetDataCallback() {
                                @Override
                                public void done(byte[] data, ParseException e) {
                                    Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);

                                    imageView.setImageBitmap(bitmap);
                                }
                            });

                        }
                    }
                }
            }
        });

    }
}
