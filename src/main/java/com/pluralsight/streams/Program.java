package com.pluralsight.streams;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Person person1 = new Person("Lester", "McMillan", 28);
        Person person2 = new Person("Patricia", "Malone", 42);
        Person person3 = new Person("Kerry", "George", 67);
        Person person4 = new Person("Danny", "Boyer", 15);
        Person person5 = new Person("Irma", "Bacon", 7);
        Person person6 = new Person("Tina", "Browning", 30);
        Person person7 = new Person("Gale", "Crawford", 54);
        Person person8 = new Person("Jaime", "Baker", 23);
        Person person9 = new Person("Amber", "Garza", 19);
        Person person10 = new Person("Iris", "Hanyes", 2);

        System.out.print("Search for a person via first or last name: ");
        String name = keyboard.nextLine();



    }
}
