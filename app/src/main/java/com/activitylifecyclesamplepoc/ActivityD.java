package com.activitylifecyclesamplepoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityD extends AppCompatActivity {

    String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Log.d(TAG, "onCreate ActivityD");
    }

    public void onClick(View view) {
        //  finish();
        startActivity(new Intent(this, ActivityD.class));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart ActivityD");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume ActivityD");
        // finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause ActivityD");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop ActivityD");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart ActivityD");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy ActivityD");
    }
}

