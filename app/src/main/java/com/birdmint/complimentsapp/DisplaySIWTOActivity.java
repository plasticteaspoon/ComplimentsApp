package com.birdmint.complimentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplaySIWTOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("JESSICA", "DisplaySIWTOActivity onCreate");

        setContentView(R.layout.activity_display_siwto);

        Intent intent = getIntent();

        // get an opinion
        WordList opinions = new WordList(getApplicationContext(), R.array.opinions);
        String message = opinions.getWordThenRemove();

        // display the compliment
        TextView textView = (TextView) findViewById(R.id.opinion);
        textView.setText(message);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("JESSICA", "DisplaySIWTOActivity onDestroy");
    }
}
