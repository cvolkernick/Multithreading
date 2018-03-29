package com.example.admin.multithreading;

import android.util.Log;

/**
 * Created by Admin on 3/29/2018.
 */

public class MyTasks {


    public static void startJob(String Tag) {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Log.d(Tag + "_TAG", "run: " + Thread.currentThread() + i);
        }
    }
}
