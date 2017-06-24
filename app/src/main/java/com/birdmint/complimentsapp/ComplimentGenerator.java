package com.birdmint.complimentsapp;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.birdmint.complimentsapp.R;

/**
 * Created by jessi on 16/06/2017.
 */

public class ComplimentGenerator {

    WordList bodyParts;
    WordList verbs;
    WordList adjectives;
    private Random random;

    public ComplimentGenerator(Context ctx) {
        verbs = new WordList(ctx, R.array.verbs);
        bodyParts = new WordList(ctx, R.array.bodyParts);
        adjectives = new WordList(ctx, R.array.adjectives);

        random = new Random();
    }


    public String getCompliment() {

        String message = null;

        //you = 0 and your = 1
        int youNum = random.nextInt(2);

        if (youNum == 0) {
            message = "You are" + verbs.getWord() + adjectives.getWord() + ".";

        } else {
            message = "Your" + bodyParts.getWord() + verbs.getWord() + adjectives.getWord() + " today.";
        }

        return message;
    }
}
