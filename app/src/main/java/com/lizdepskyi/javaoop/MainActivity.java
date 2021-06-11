package com.lizdepskyi.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();
        vaska.talk(3);
        vaska.talk("Meow, meow!");
        Log.i("field age", String.valueOf(vaska.age));
    }
}