package com.example.admin.multithreading.threads;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import com.example.admin.multithreading.MyTasks;

import org.w3c.dom.Text;

import static android.content.ContentValues.TAG;

/**
 * Created by Admin on 3/29/2018.
 */

public class MyAsyncTask extends AsyncTask<String, Integer, String> {

    TextView tvMain;

    public MyAsyncTask(TextView tvMain) {
        this.tvMain = tvMain;
    }

    @Override
    protected  void onPreExecute() {
        super.onPreExecute();

        tvMain.setText("setting up task");
        Log.d(TAG, "onPreExecute: " + Thread.currentThread().getName());
    }

    @Override
    protected String doInBackground(String... strings) {
        MyTasks.startJob(this.getClass().getSimpleName());

        Log.d(TAG, "doInBackground: " + Thread.currentThread().getName());

        return "Job done";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        tvMain.setText(s);
        Log.d(TAG, "onPostExecute: " + Thread.currentThread().getName());
    }
}
