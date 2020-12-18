package com.hz;

import java.util.ArrayList;

public class Schoolyard {

    public void addStudents(Human student) {
        this.students.add(student);
    }

    private ArrayList<Human> students;

    public Schoolyard() {
        this.students = new ArrayList<>();
    }

    public void dropATopic(String topic) {

        for (Human student: this.students) {

            String opinion = student.getOpinion(topic);
            String chat = String.format("%s says: %s", student.getName(), opinion);

            Console.writeLine(chat);
        }
    }
}
