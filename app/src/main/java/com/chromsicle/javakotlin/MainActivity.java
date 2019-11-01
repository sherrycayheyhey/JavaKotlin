package com.chromsicle.javakotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is making the Pokemon from the Kotlin file, that's insane!
        //being able to do this means that you could start with a Java app and
        //when you need a new class or something, you can do it in Kotlin to
        //slowly begin converting the project because they can coexist
        Pokemon myPokemon = new Pokemon("Lickitung", 108);
        //another option is to convert something like MainActivity by
        //selecting it -->Code-->Convert Java file to Kotlin file


        /*after converting the project you can copy/paste java code snippets and
        Android Studion will ask if you want to convert it to Kotlin so this:

        ArrayList<String> places = new ArrayList<String>();
        places.add("Buenos Aires");
        places.add("Córdoba");
        places.add("La Plata");

        will be turned into this:

        val list = ArrayList<String>()
        list.add("A")
        list.add("B")
        list.add("C")*/


    }
}
