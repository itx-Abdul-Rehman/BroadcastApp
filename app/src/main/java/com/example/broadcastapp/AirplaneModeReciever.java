package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction()!=null&&intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED))
        {
            boolean isAirplane=intent.getBooleanExtra("state",false);

            String msg=isAirplane?"Airplane mode on":"Airplane mode off";

            Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
        }
    }
}
