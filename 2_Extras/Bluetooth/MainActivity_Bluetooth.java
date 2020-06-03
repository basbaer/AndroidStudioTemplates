package com.basbaer.bluetoothtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    //Adapter variable that allows us to work with bluetooth
    BluetoothAdapter ba;

    //turning of bluetooth
    public void turnBluetoothOff(View view){
        //to allow this, you have to give BLUETOOTH ADMIN permission
        ba.disable();

        if(ba.isEnabled()){

            Toast.makeText(getApplicationContext(), "Bluetoot can not be disabled", Toast.LENGTH_LONG);

        }else {

            Toast.makeText(getApplicationContext(), "Bluetoot is turned off", Toast.LENGTH_LONG);

        }

    }


    public void showPairedDevices(View view){

        TextView pairedDevicesTextView = (TextView) findViewById(R.id.textViewPairedDevices);

        //set is something like a list
        Set<BluetoothDevice> pairdDevices = ba.getBondedDevices();

        //Iterate over the Set
        for(BluetoothDevice bluetoothDevice : pairdDevices){

            String currentText = (String) pairedDevicesTextView.getText();

            pairedDevicesTextView.setText(currentText + "/n" + String.valueOf(bluetoothDevice.getName()));
        }

    }

    //jumps to settings where the pairable devices are
    public void searchPairableDevices(View view){

        //new intent to the pairable devices activity
        Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);

        startActivity(i);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //check if Bluetooth is turned on and let it turn on if it isn't
        if(ba.isEnabled()){

            Toast.makeText(getApplicationContext(), "Bluetoot is on", Toast.LENGTH_LONG);

        }else{

            //starts intent to let the user turn on bluetooth
            Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);

            startActivity(i);

            if(ba.isEnabled()){

                Toast.makeText(getApplicationContext(), "Bluetoot is now turned on", Toast.LENGTH_LONG);

            }

        }

    }
}
