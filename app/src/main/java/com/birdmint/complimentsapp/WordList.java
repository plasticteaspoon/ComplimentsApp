package com.birdmint.complimentsapp;

import android.content.Context;
import android.content.res.Resources;
import android.content.ContextWrapper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by jessi on 24/06/2017.
 */

public class WordList extends ContextWrapper {

    private String[] words;
    private Random random;
    private ArrayList<String> wordsList;

    public WordList(Context ctx, int arrayId) {
        super(ctx);
        Resources res = getResources();
        words = res.getStringArray(arrayId);
        wordsList = new ArrayList<String>(Arrays.asList(words));
        random = new Random();
    }

    public String getWord() {
        int wordIndex = random.nextInt(wordsList.size());
        String word = wordsList.get(wordIndex);

        return word;
    }

    public String getWordThenRemove() {
        int wordIndex = random.nextInt(wordsList.size());
        String word = words[wordIndex];
        wordsList.remove(wordIndex);

        return word;
    }
}