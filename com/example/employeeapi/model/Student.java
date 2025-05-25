package com.example.employeeapi.model;

import java.util.Arrays;

public class Student {
    //properties

    //primitive data types
    private int age;
   private  char grade = 'A';
    private boolean isEnrolled = true;
    private double height = 5.9; //decimal number

    //non-primitive datatypes
    String name = "Alice";
    int[] marks = {85,95,78};

    public Student(String name, int age){
        this.name= name;
        this.age=age;


    }




    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Height: " + height);
        System.out.println("Enrolled: " + isEnrolled);

        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }



    //no parameters and no return values
    public void greet(){
        System.out.println("Hello, " + name + "!");
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void updateName(String newName){
        String name = newName;
        System.out.println("Name " + name);

    }

    public static void main(String[] args){
        // create a student object
//        Student student = new Student();

        Student student = null;
        //student = new Student();

        try {
            student.name = "seema";
            student.age = 20;
            student.displayInfo();
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }

        }

        // call the method

}


