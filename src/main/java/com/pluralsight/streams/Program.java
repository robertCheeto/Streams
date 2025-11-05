package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Lester", "McMillan", 28));
        people.add(new Person("Patricia", "Malone", 42));
        people.add(new Person("Patricia", "Malone", 42));
        people.add(new Person("Danny", "Boyer", 15));
        people.add(new Person("Irma", "Bacon", 7));
        people.add(new Person("Tina", "Browning", 30));
        people.add(new Person("Gale", "Crawford", 54));
        people.add(new Person("Jaime", "Baker", 23));
        people.add(new Person("Amber", "Garza", 19));
        people.add(new Person("Iris", "Hanyes", 2));


        System.out.print("Search for a person via first or last name: ");
        String name = keyboard.nextLine().trim();

        for (Person individual : people) {
            if (name.equalsIgnoreCase(individual.getFirstName()) || name.equalsIgnoreCase(individual.getLastName())) {
                System.out.println(individual);
            }

        }



    }
}
