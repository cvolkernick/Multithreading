package com.example.admin.multithreading.threads;

import com.example.admin.multithreading.MyTasks;
import com.example.admin.multithreading.myEvents.MyMessageEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Admin on 3/29/2018.
 */

public class MyEventThread extends Thread {

    @Override
    public void run() {
        super.run();

        MyTasks.startJob(this.getClass().getSimpleName());

        String result = "Job completed";

        //send the result back
        EventBus.getDefault().post(new MyMessageEvent(result));
    }
}
