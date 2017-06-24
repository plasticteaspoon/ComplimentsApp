package com.birdmint.complimentsapp;

import android.content.Context;
import android.content.res.Resources;
import android.content.ContextWrapper;

import java.util.Random;

/**
 * Created by jessi on 24/06/2017.
 */

public class WordList extends ContextWrapper {

    private String[] words;
    private Random random;

    public WordList(Context ctx, int arrayId) {
        super(ctx);
        Resources res = getResources();
        words = res.getStringArray(arrayId);
        random = new Random();
    }

    public String getWord() {
        int wordIndex = random.nextInt(words.length);
        String word = words[wordIndex];

        return word;
    }
}
