package com.hz;

public class Human extends MindSet {

    public String getName() {
        return name;
    }

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getOpinion(String topic) {

        String opinion = this.getRandomOpinion();

        String talk = String.format(opinion, topic);

        return talk;
    }
}
