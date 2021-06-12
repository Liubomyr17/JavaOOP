package com.lizdepskyi.javaoop;

import android.util.Log;

public abstract class Animal {
    int numberOfLegs;
    boolean isAlive;

    abstract public void draw();

    public String breath() {
        return "I can breath";
    }
}
