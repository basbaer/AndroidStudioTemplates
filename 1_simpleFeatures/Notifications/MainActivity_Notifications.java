package com.basbaer.notificationstemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //neede for the PendingIntent
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        //Pending Intent is needed, when the user clicks on the notification
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 1, intent, 0);

        //build the notification
        Notification notification = new Notification.Builder(getApplicationContext())
                //do some setting
                .setContentTitle("This is the TITLE")
                .setContentText("This is the TEXT")
                .setSmallIcon(R.drawable.rick)
                //what to do if the user tabs on it
                .setContentIntent(pendingIntent)
                .build();

        //display the notification
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(1, notification);


    }
}
