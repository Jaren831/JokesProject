package com.example;

import java.util.Random;

public class JokeProvider {

    private static final String[] jokes = {
            "This is totally a funny joke.",
            "Blah, blah, blah",
            "Ha, ha, ha, ha",
    };
    public static String getJoke(){
        int random = new Random().nextInt(jokes.length);
        return jokes[random];
    }
}
