package com.example.admin.multithreading.threads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;

import com.example.admin.multithreading.MyTasks;

/**
 * Created by Admin on 3/29/2018.
 */

public class MyThread extends Thread {

    private TextView tvMain;

    public MyThread(TextView tvMain) {
        this.tvMain = tvMain;
    }

    Handler handler = new Handler(Looper.getMainLooper());

    @Override
    public void run() {
        super.run();

        handler.post(new Runnable() {
            @Override
            public void run() {
                tvMain.setText("Starting job");
            }
        });

        MyTasks.startJob(this.getName());

        handler.post(new Runnable() {
            @Override
            public void run() {
                tvMain.setText("Task completed");
            }
        });
    }
}
