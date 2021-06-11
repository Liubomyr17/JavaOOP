package com.lizdepskyi.javaoop;

import android.util.Log;

public class Cat extends Animal {

    int age;
    String name;
    final static int numberOfLegs = 4;
    static int count = 0;

    public Cat() {
        count++;
        this.name = "John Doe";
        this.age = -1;
    }

    public Cat(int age, String name) {
        count++;
        this.age = age;
        this.name = name;
    }

    public void talk() {
        Log.i("talk()", "Meow! I'm Cat. My name is " + name +
                ", and I'm " + age + " years old.");
    }

    public void talk(int age) {
        Log.i("talk()", "Meow! I'm " + age + " years old.");
    }

    public void talk(String hello) {
        Log.i("talk()", "Meow! " + hello);
    }

    public static String whatCatsLike() {
        return " I like playing";
    }
}
