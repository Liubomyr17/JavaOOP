package com.lizdepskyi.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        cat1.catchMouse(1);
        cat1.catchMouse(7);


    }
}