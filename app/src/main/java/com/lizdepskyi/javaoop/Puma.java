package com.lizdepskyi.javaoop;

import android.util.Log;

public class Puma extends Cat {

    private String pumaHelloText;

    public Puma() {
        this.name = "Puma";
        this.age = 3;
        this.pumaHelloText = "I'm cool cat!";
    }

    public void talk() {
        Log.i("talk()", createPumaHelloText());
    }

    public String createPumaHelloText() {
        String pumaTalkText = "R-r-r! I'm puma. My name is " + name +
                ", and I'm " + age + " years old.";
        return pumaTalkText;
    }

}
