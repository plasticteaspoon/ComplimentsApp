package com.birdmint.complimentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.R.id.message;

public class DisplayComplimentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compliments);

        Intent intent = getIntent();

        // create a compliment
        ComplimentGenerator generator = new ComplimentGenerator(getApplicationContext());
        String message = generator.getCompliment();

        // display the compliment
        TextView textView = (TextView) findViewById(R.id.compliment);
        textView.setText(message);
    }
}
