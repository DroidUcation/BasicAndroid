package com.tikalk.basicandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.i("TwoActivities", "FirstActivity Created");
    }

    public void startActivityTwo(View v) {
    	Intent intent = new Intent(FirstActivity.this, ActivityTwo.class);
    	startActivity(intent);
    }
    
    protected void onResume() {
    	super.onResume();
    	Log.i("TwoActivities", "FirstActivity Resumed");
    }
    
    protected void onPause() {
    	super.onPause();
    	Log.i("TwoActivities", "FirstActivity Paused");
    }
    
    protected void onStop() {
    	super.onStop();
    	Log.i("TwoActivities", "FirstActivity Stopped");
    }
    
}
