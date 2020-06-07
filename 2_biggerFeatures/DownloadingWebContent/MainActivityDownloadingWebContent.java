package com.basbaer.downloadingwebcontenttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadTask task = new DownloadTask();

        //create a variable, where you place the url
        //example: download content from my website
        String urlIwantToDownload = "https://discobreak21.github.io/";


        try {

            //the exectute method need a try-catch-block
            String downloadedContent = task.execute(urlIwantToDownload).get();

            //show the result in the console
            Log.i("DownloadedContent", downloadedContent);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
