package com.basbaer.downloadingwebcontenttemplate;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadTask extends AsyncTask <String, Void, String> {
    //AsyncTask handles that the download is not managed in the current thread
    //Parameters:
    //first String: the URL where you want to get the data from
    //void: here is place for a method, that shows the progress of the Task (e.g. for downloading big files)
    //second string: Variable that is given back by the DownloadTask

    //this method is needed to run a downloadTask
    //Datatype: String... can be handled like a String[]
    @Override
    protected String doInBackground(String... strings) {

        //create a String, in which the downloadedContent will be saved
        String result = "";

        //create a URL variable in which you save the url, you give the method
        URL url;

        //create a variable to build a connection
        HttpURLConnection httpURLConnection;

        try{
            //get the url (needs a catch-clause)
            url = new URL(strings[0]);

            //establish a connection (also needs a catch-clause)
            httpURLConnection = (HttpURLConnection) url.openConnection();

            //InputStream transfers the data from the other server to yours
            InputStream inputStream = httpURLConnection.getInputStream();

            //InputStreamReader handels the incoming data
            InputStreamReader inputStreamReader =  new InputStreamReader(inputStream);

            //reads the data char by char
            int data = inputStreamReader.read();

            while(data != -1){

                char current = (char) data;

                result += current;

                //goes to the next char
                data = inputStreamReader.read();


            }


            return result;


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //If a exeception is thrown
        return "Failed";
    }
}
