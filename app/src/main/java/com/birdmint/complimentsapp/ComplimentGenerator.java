package com.birdmint.complimentsapp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.birdmint.complimentsapp.R;

/**
 * Created by jessi on 16/06/2017.
 */

public class ComplimentGenerator extends ContextWrapper {

    public ComplimentGenerator (Context ctx) {
        super(ctx);
    }

    private Random random = new Random();
    //private static List<String> compliments = null;

    Resources res = getResources();

    String[] bodyParts = res.getStringArray(R.array.bodyParts);
    String[] verbs = res.getStringArray(R.array.verbs);
    String[] adjectives = res.getStringArray(R.array.adjectives);

    public String getCompliment () {

        String message = null;

        /*if(compliments == null) {
            compliments = new ArrayList<String>();

            compliments.add("You are looking wonderful today!");
            compliments.add("Your hair looks stunning!");
            compliments.add("Your skin is looking beautiful today!");
        }

        if(compliments.size() != 0) {
            int index = random.nextInt(compliments.size());
            message = compliments.remove(index);
        } else {
            message = "Sorry, but we're out of compliments for just now. Come back for more later.";
        }*/

        int bodyPartIndex = random.nextInt(bodyParts.length);
        int verbIndex = random.nextInt(verbs.length);
        int adjectiveIndex = random.nextInt(adjectives.length);

        String bodyPart = bodyParts[bodyPartIndex];
        String verb = verbs[verbIndex];
        String adjective = adjectives[adjectiveIndex];

        message = "Your " + bodyPart + " " + verb + " " + adjective + " today.";

        return message;
    }
}
