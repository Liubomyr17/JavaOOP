package com.lizdepskyi.javaoop;

import android.util.Log;

public class Cat {

    int age;
    String name;

    public Cat() {

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void talk() {
        Log.i("Talk()", "Meow! My name is " + name +
                ", and I'm " + age + " years old.");
    }

}
