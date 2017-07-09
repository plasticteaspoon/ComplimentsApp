package com.birdmint.complimentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInsultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_insults);

        Intent intent = getIntent();

        // create an insult
        InsultGenerator generator = new InsultGenerator(getApplicationContext());
        String message = generator.getInsult();

        // display the compliment
        TextView textView = (TextView) findViewById(R.id.insult);
        textView.setText(message);
    }
}
