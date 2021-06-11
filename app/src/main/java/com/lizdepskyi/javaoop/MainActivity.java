package com.lizdepskyi.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lizdepskyi.extenshiontask.R;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4, "Puma");
        myCat.talk();

        Cat murzik = new Cat(2, "Murza");
        murzik.breath();
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(glasha.numberOfLegs));
        glasha.talk();

        Puma puma = new Puma();
        puma.breath();
        puma.isAlive = true;
        puma.name = "Leo";
        puma.talk();

        Log.i("breath()", "My name is " + puma.name + " and " + puma.breath());

        Log.i("isAlive", String.valueOf(glasha.isAlive));

    }
}