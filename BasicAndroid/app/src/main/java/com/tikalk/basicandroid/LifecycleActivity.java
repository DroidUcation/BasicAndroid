package com.tikalk.basicandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class LifecycleActivity extends Activity {

    private static final String logTag = "LifecycleActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(logTag, "onCreate called");
        setContentView(R.layout.layout_lifecycle);
    }

    public void onStart() {
        super.onStart();
        Log.i(logTag, "onStart called");
    }

    public void onRestart() {
        super.onRestart();
        Log.i(logTag, "onRestart called");
    }

    public void onResume() {
        super.onResume();
        Log.i(logTag, "onResume called");
    }

    public void onPause() {
        super.onPause();
        Log.i(logTag, "onPause called");
    }

    public void onStop() {
        super.onStop();
        Log.i(logTag, "onStop called");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(logTag, "onDestroy called");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_lifecycle, menu);
        return true;
    }
}
