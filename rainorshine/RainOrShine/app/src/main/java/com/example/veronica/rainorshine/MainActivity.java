package com.example.veronica.rainorshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CAN YOU SEE THIS", "THIS IS AN EDIT");
        Log.d("ANOTHER", "TEST");
    }
}