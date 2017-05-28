package com.tikalk.basicandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.i("TwoActivities", "ActivityTwo Created");
    }

    protected void onPause() {
        super.onPause();
        Log.i("TwoActivities", "ActivityTwo Paused");
    }

    protected void onStop() {
        super.onStop();
        Log.i("TwoActivities", "ActivityTwo Stopped");
    }

}
