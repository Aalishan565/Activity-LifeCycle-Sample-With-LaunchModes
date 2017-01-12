package com.activitylifecyclesamplepoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate MainActivity");
    }

    public void onClick(View view) {
        startActivity(new Intent(this, ActivityB.class));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume MainActivity");
        // finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy MainActivity");
    }
}
