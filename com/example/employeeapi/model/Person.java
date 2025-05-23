package com.example.employeeapi.model;

public class Person {

    // Fields (also called instance variables)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);

    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        p.displayInfo();
        p.setAge(10);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.setName("Alice");



    }
}