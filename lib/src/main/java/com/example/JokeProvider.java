package com.example;

import java.util.Random;

public class JokeProvider {

    private final String[] jokes = {
            "This is totally a funny joke."
    };
    public String getJoke(){
        int random = new Random().nextInt(jokes.length);
        return jokes[random];
    }
}
