package com.lizdepskyi.extenshiontask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lion lion = new Lion(5, "Lion");
        LionCub lionCub = new LionCub(2, "Cub");

        lion.quantityOfLegs = 4;
        lionCub.isAlive = true;

        lion.talk();
        lionCub.talk();

        lion.roar();
        lionCub.roar();

    }
}