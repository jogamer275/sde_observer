package com.hz;

public class Jordy extends Student{

    public Jordy() {
        super("Jordy");
    }

    @Override
    public String getOpinion() {

        String msg = "This %s you're talking about, is really cool.";

        return msg;
    }
}
