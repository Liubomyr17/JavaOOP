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

        Cat cat1 = new Cat(1, "Barsik");
        cat1.talk();
        Cat cat2 = new Cat(5, "Vaska");
        cat2.talk();
        Cat cat3 = new Cat(8, "Murzik");
        cat3.talk();

        Cat.CatMustache catMustache = new Cat().new CatMustache();

        Log.i("mustacheLength", String.valueOf(catMustache.mustacheLength));

    }
}