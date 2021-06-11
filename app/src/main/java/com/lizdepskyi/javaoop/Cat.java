package com.lizdepskyi.javaoop;

import android.util.Log;

public class Cat extends Animal {

    int age;
    String name;
    final static int numberOfLegs = 4;
    static int count = 0;

    String helloMustache;
    CatMustache catMustache;

    class CatMustache {
        int mustacheLength;

        CatMustache() {
            if (Cat.this.age < 2) {
                mustacheLength = 10;
            } else if (Cat.this.age < 5) {
                mustacheLength = 10;
            } else {
                mustacheLength = 15;
            }
        }
    }

    public Cat() {
        count++;
        this.name = "John Doe";
        this.age = -1;

        catMustache = new CatMustache();

        switch (catMustache.mustacheLength) {
            case 100:
                helloMustache = "I'm happy";
                break;
            case 50:
                helloMustache = "I'm the happiest";
                break;
            case 20:
                helloMustache = "I'm happier";
                break;
        }
    }

    public Cat(int age, String name) {
        count++;
        this.age = age;
        this.name = name;

        catMustache = new CatMustache();

        switch (catMustache.mustacheLength) {
            case 100:
                helloMustache = "I'm happy";
                break;
            case 50:
                helloMustache = "I'm the happiest";
                break;
            case 20:
                helloMustache = "I'm happier";
                break;
        }
    }

    public void talk() {
        Log.i("talk()", String.valueOf(helloMustache));
    }
}
