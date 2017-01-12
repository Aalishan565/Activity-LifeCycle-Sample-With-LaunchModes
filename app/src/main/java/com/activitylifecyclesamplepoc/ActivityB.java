package com.activitylifecyclesamplepoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {
    String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d(TAG, "onCreate ActivityB");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart ActivityB");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume ActivityB");
        // finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause ActivityB");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop ActivityB");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart ActivityB");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy ActivityB");
    }
}
