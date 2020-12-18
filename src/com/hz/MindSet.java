package com.hz;

import java.util.Random;

import java.util.ArrayList;

public class MindSet {

    private ArrayList<String> opinions;

    private Random rand;

    public MindSet() {
        this.opinions = new ArrayList<>();
        this.rand = new Random();

        this.addOpinions();
    }

    private void addOpinions() {
        this.opinions.add("Well, to be honest, I don't like %s.");
        this.opinions.add("That's weird! %s suddenly seems to be a hot topic at the moment.");
        this.opinions.add("I'm a big fan of %s.");
        this.opinions.add("Put two %s in a box and you've made yourself a present.");
        this.opinions.add("All that talking about %s! So old-school.");
    }

    protected String getRandomOpinion() {

        int index = rand.nextInt(this.opinions.size());

        return this.opinions.get( index );
    }
}
