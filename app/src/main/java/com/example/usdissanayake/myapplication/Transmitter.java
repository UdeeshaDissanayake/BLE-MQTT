package com.example.usdissanayake.myapplication;

/**
 * Created by usdissanayake on 11/2/2015.
 */
import ble.BluetoothHandler;

import android.content.Context;

public class Transmitter {
    private Context context;
    private BluetoothHandler mBluetoothHandler;

    public final static byte WRITE_DATA = 1;
    public final static byte READ_DATA = 2;

    public Transmitter(Context context, BluetoothHandler bluetoothHandler){
        this.context = context;
        this.mBluetoothHandler = bluetoothHandler;
    }

    public BluetoothHandler getBluetoothHandler(){
        return mBluetoothHandler;
    }

    public void sendData(byte[] bytes){
        mBluetoothHandler.sendData(bytes);
    }
}
