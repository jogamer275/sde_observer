package com.hz;

public abstract class Student {

    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void listen(String topic) {

        String opinion = String.format(this.getOpinion(), topic);

        String thinkAloud = String.format("[%s] > %s", this.name, opinion);

        Console.writeLine(thinkAloud);
    }

    public abstract String getOpinion();
}
