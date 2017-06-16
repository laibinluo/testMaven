package com.robin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.robin.mylibrary.TestLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestLib.Test1();
    }

}
