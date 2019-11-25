package com.activitylifecyclesamplepoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityC extends AppCompatActivity {
    String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Log.d(TAG, "onCreate ActivityC");
    }

    public void onClick(View view) {
        //  finish();
        startActivity(new Intent(this, ActivityD.class));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart ActivityC");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume ActivityC");
        // finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause ActivityC");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop ActivityC");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart ActivityC");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy ActivityC");
    }
}
