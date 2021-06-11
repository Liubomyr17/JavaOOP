package com.lizdepskyi.javaoop;

import android.util.Log;

public class Cat extends Animal {

    int age;
    String name;
    final static int numberOfLegs = 4;
    static int count = 0;
    String helloText;
    CatMood catMood;

    static class CountResetter {
        boolean moreThan100;

        CountResetter() {
            if (Cat.count > 5) {
                moreThan100 = true;
            }
            if (moreThan100) {
                resetCount(0);
            }
        }
        void resetCount(int value) {
            Cat.count = value;
        }
    }

    class CatMood {
        int levelOfMood;

        CatMood() {
            if (Cat.this.age < 2) {
                levelOfMood = 100;
            } else if (Cat.this.age < 7) {
                levelOfMood = 50;
            } else {
                levelOfMood = 20;
            }
        }
    }


    public Cat() {
        count++;
        this.name = "John Doe";
        this.age = -1;

        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! I'm happy Cat =) My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat =/ My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! I'm old cat =( My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
        }
    }

    public Cat(int age, String name) {
        count++;
        this.age = age;
        this.name = name;

        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! I'm happy Cat =) My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat =/ My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! I'm old cat =( My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
        }
    }

    public void talk() {
        Log.i("talk()", helloText);
    }

    public void catchMouse(int mouseWeight) {
        class Mouse {
            String color;
            int weight;

            public Mouse(String color, int weight) {
                this.color = color;
                this.weight = weight;
            }

            String mouseVoice() {
                return "Pi - pi - pi";
            }
        }

        Mouse mouse = new Mouse("White", mouseWeight);

        if (mouseWeight < 5) {
            Log.i("Cat say", "I will eat you " + mouse.mouseVoice());
        } else {
            Log.i("Cat say", "I afraid you " + mouse.mouseVoice());

        }
    }
}
