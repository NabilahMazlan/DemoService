package com.example.demoservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    boolean started;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Log.d("Service", "Service started");
        Toast.makeText(getBaseContext(), "Service started", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(started == false){
            started = true;
            Log.d("Service", "Service stared");
            Toast.makeText(getBaseContext(), "Service started", Toast.LENGTH_SHORT).show();

        }else{
            Log.d("Service", "Service is still running");
            Toast.makeText(getBaseContext(), "Service is still running", Toast.LENGTH_SHORT).show();

        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("Service", "Service exited");
        Toast.makeText(getBaseContext(), "Service exited", Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }
}
