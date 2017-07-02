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

    public void playMusic(String music) {
        final MediaPlayer mp = MediaPlayer.create(this, Uri.parse("R.raw." + music));
        mp.start();
    }
}
