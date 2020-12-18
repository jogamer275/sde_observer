package com.hz;

public class Main {

    public static void main(String[] args) {

        // the gossiping 

        Human olivia = new Human("Olivia");

        Schoolyard schoolyard = new Schoolyard();

        schoolyard.addStudents(olivia);


        while(true) {

            // Add a new student each time

            Console.writeLine("Start a topic...");

            String topic = Console.readLine();

            schoolyard.dropATopic(topic);
        }

    }
}
