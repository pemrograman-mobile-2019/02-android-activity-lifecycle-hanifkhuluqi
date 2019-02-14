package com.example.hanif.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }


    @java.lang.Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @java.lang.Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "onPostResume", Toast.LENGTH_SHORT).show();
    }

    @java.lang.Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"OnPause",Toast.LENGTH_SHORT).show();
    }

    @java.lang.Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"OnStop",Toast.LENGTH_SHORT).show();
    }

    @java.lang.Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"OnDestroy",Toast.LENGTH_SHORT).show();
    }
}


