package com.birdmint.complimentsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Drawable background = getResources().getDrawable(R.mipmap.main_background);

        // setting the opacity (alpha)
        background.setAlpha(60);
    }

    public void viewCompliments(View view) {
        Intent intent = new Intent(this, DisplayComplimentActivity.class);
        startActivity(intent);
    }

    //SIWT means Should I wear this?  SIWTO means Should I wear this opinion
    public void viewSIWTO(View view) {
        Intent intent = new Intent(this, DisplaySIWTOActivity.class);
        startActivity(intent);
    }

    public void viewMusicGenres(View view) {
        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }

    public void viewInsults(View view) {
        Intent intent = new Intent(this, DisplayInsultsActivity.class);
        startActivity(intent);
    }
}
