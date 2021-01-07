package com.hz;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher andries = new Teacher();

        HashMap<String, Student> students = getStudents();

        Student marie = students.get("marie");
        Student kees = students.get("kees");

        andries.subscribe(marie);
        andries.subscribe(kees);

        // ugly way to show
        // the power of Observer

        // use:
        // add <studentname>
        // remove <studentname>

        while(true) {

            andries.teach();

            String input = Console.readLine();

            String command = Console.getWords(input)[0];

            if (command.equals("add")) {

                String name = Console.getWords(input)[1];
                Student student = students.get(name);
                andries.subscribe(student);
                System.out.println("Added a new student\n");

            }

            if (command.equals("remove")) {

                String name = Console.getWords(input)[1];
                Student student = students.get(name);
                andries.unsubscribe(student);
                System.out.println("Removed a student\n");
            }
        }
    }

    private static HashMap<String, Student> getStudents(){

        HashMap<String, Student> students = new HashMap<>();

        students.put("marie", new Marie());
        students.put("kees", new Kees());
        students.put("jordy", new Jordy());

        return students;
    }

}
