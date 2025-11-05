package com.pluralsight.streams;

import java.util.*;

public class ProgramStream {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<PersonStream> people = new ArrayList<>();

        people.add(new PersonStream("Lester", "McMillan", 28));
        people.add(new PersonStream("Patricia", "Malone", 42));
        people.add(new PersonStream("Patricia", "Malone", 42));
        people.add(new PersonStream("Danny", "Boyer", 15));
        people.add(new PersonStream("Irma", "Bacon", 7));
        people.add(new PersonStream("Tina", "Browning", 30));
        people.add(new PersonStream("Gale", "Crawford", 54));
        people.add(new PersonStream("Jaime", "Baker", 23));
        people.add(new PersonStream("Amber", "Garza", 19));
        people.add(new PersonStream("Iris", "Hanyes", 2));


        System.out.print("Search for a person via first or last name: ");
        String name = keyboard.nextLine().trim();

        List<PersonStream> filtered = people.stream()
                .filter(individual ->  individual.getFirstName().contains(name) || individual.getLastName().contains(name))
                //.peek(System.out::println)
                .toList();

        System.out.println("You searched for: " + filtered + "\n");

//        for (Person individual : people) {
//            if (name.equalsIgnoreCase(individual.getFirstName()) || name.equalsIgnoreCase(individual.getLastName())) {
//                filtered.add(individual);
//                System.out.println(filtered);
//            }
//        }

//        int averageAge = 0;
//        int oldestAge = -1;
//        int youngestAge = 1000;

        Integer averageAge = people.stream()
                .map(PersonStream::getAge)
                .reduce(0, (temp, num) -> temp += num);
        System.out.println("The average age of everyone is: " + averageAge / people.size());
        //System.out.println("The oldest age of everyone is: " + people.stream().min());

        Integer oldestAge = people.stream()
                .map(PersonStream::getAge)
                .max(Integer::compareTo).get();
        System.out.println("The oldest age out of everyone is: " + oldestAge);

        Integer youngestAge = people.stream()
                .map(PersonStream::getAge)
                .min(Integer::compareTo).get();
        System.out.println("The youngest age out of everyone is: " + youngestAge);

//        for (Person individual : people) {
//            averageAge += individual.getAge();
//
//            if (individual.getAge() > oldestAge) {
//                oldestAge = individual.getAge();
//            }
//
//            if (individual.getAge() < youngestAge) {
//                youngestAge = individual.getAge();
//            }
//        }

//        System.out.println("The average age of everyone is: " + (averageAge / people.size()));
//        System.out.println("The oldest age of everyone is: " + oldestAge);
//        System.out.println("The youngest age of everyone is: " + youngestAge);

    }
}
