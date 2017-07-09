package com.birdmint.complimentsapp;

import android.content.Context;

import java.util.Random;

/**
 * Created by jessi on 09/07/2017.
 */

public class InsultGenerator {

    WordList insults1;
    WordList insults2;
    WordList insults3;
    private Random random;

    public InsultGenerator(Context ctx) {
        insults1 = new WordList(ctx, R.array.insults1);
        insults2 = new WordList(ctx, R.array.insults2);
        insults3 = new WordList(ctx, R.array.insults3);

        random = new Random();
    }


    public String getInsult() {

        String message = null;

        // "Thou art a" = 0 and "You" = 1
        int startWordNum = random.nextInt(3);

        if(startWordNum == 0) {
            message = "Thou art a " + insults1.getWord() + ", " + insults2.getWord() + ", " + insults3.getWord() + "!";
        } else if(startWordNum == 1) {
            message = "You " + insults1.getWord() + ", " + insults2.getWord() + ", " + insults3.getWord() + "!";
        } else {
            message = "You dwarf, you minimus of hindering knotgrass made, you bead, you acorn!";
        }

        return message;
    }
}
