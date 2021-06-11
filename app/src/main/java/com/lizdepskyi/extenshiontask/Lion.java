package com.lizdepskyi.extenshiontask;

import android.util.Log;

public class Lion extends Animal {

    int age;
    String name;

    public Lion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void talk() {
        Log.i("Talk()", "Talk! My name is " + name +
                ", and I'm " + age + " years old.");
    }
}

