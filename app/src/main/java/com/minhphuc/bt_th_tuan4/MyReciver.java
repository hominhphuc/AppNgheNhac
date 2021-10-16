package com.minhphuc.bt_th_tuan4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int actionMusic = intent.getIntExtra("action_music",0);

        Intent intentService = new Intent(context, MyService.class);
        intentService.putExtra("action_music_service",actionMusic);
        context.startService(intentService);
    }
}
