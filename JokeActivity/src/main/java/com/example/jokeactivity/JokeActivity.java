package com.example.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by jaren on 12/29/2016.
 */

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity_layout);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);
        TextView jokeText = (TextView) findViewById(R.id.joke_text);
        if (joke != null && joke.length() != 0) {
            jokeText.setText(joke);
        }
    }
}
