package com.example.tp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class SmsReceived extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Recibiste un mensaje lagart@",Toast.LENGTH_SHORT).show();
    }
}
