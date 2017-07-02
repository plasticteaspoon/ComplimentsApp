package com.birdmint.complimentsapp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void playMusic(View view) {
        String name = view.getTag().toString();
        String fullName = String.format("com.birdmint.complimentsapp:raw/%s", name);
        int id = getResources().getIdentifier(fullName, null, null);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.happy_birthday);
        mediaPlayer.start();
    }
}
