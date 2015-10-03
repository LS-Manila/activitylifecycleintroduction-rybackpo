package com.example.rybackpo.activitylifecycleintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "onCreate() method was called");
    }

    @Override
    public void onSaveInstanceState(Bundle saveedInstanceState){
        Log.d(LOG_TAG, "onSaveInstanceState() method was called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop() method was called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart() method was called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart() method was called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume() method was called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy() method was called");
    }
}
