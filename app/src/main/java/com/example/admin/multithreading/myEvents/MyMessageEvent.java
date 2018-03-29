package com.example.admin.multithreading.myEvents;

/**
 * Created by Admin on 3/29/2018.
 */

public class MyMessageEvent {

    String data;

    public MyMessageEvent(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
