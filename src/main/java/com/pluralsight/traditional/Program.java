package com.pluralsight.traditional;

import java.util.ArrayList;
import java.util.List;
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

        List<Person> filtered = new ArrayList<>();

        for (Person individual : people) {
            if (name.equalsIgnoreCase(individual.getFirstName()) || name.equalsIgnoreCase(individual.getLastName())) {
                filtered.add(individual);
                System.out.println(filtered);
            }
        }

        int averageAge = 0;
        int oldestAge = -1;
        int youngestAge = 1000;

        for (Person individual : people) {
            averageAge += individual.getAge();

            if (individual.getAge() > oldestAge) {
                oldestAge = individual.getAge();
            }

            if (individual.getAge() < youngestAge) {
                youngestAge = individual.getAge();
            }
        }

        System.out.println("The average age of everyone is: " + (averageAge / people.size()));
        System.out.println("The oldest age of everyone is: " + oldestAge);
        System.out.println("The youngest age of everyone is: " + youngestAge);

    }
}
