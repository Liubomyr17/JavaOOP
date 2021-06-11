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

        Puma bagira = new Puma();
        Puma puma = new Puma();

        Lion simba = new Lion();
        Lion lion = new Lion();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(bagira);
        cats.add(puma);
        cats.add(simba);
        cats.add(lion);

        Log.i("instanceOf", "Cat's size: " + cats.size());

        for (Cat kitties : cats) {
            if (kitties instanceof Puma) {
                Log.i("instanceOf", "Puma");
            } else if (kitties instanceof Lion) {
                Log.i("instanceOf", "Lion");
            }
        }
    }
}