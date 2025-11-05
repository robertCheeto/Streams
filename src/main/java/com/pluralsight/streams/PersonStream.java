package com.pluralsight.streams;

public class PersonStream {
    private String firstName, lastName;
    private int age;

    public PersonStream(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " | Age: " + age;
    }
}
