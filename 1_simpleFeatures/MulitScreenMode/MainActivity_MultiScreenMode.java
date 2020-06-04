package com.basbaer.mulitscreenmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        //Mulit-window mode has changed

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isInMultiWindowMode()){

            //what should happen in a multiWindow Mode

        }

        if (isInPictureInPictureMode()){

            //what should happen in picture in picture mode

        }

    }
}
