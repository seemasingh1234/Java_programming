package com.example.employeeapi.model;

public class DataTypes {

    public int age = 20;
    public double height = 5.7;
    public char grade = 'A';
    public boolean isEnabled = true;

    public String name = "Seema";
    public int[] marks = {98, 99, 75}; // fixed typo

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int ageS) {
        this.age = ageS;
    }

    public void printInfo() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("IsEnabled: " + isEnabled);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public void checkAdult() {
        if (age >= 18) {
            System.out.println(name + " if else candidate is an adult");
        } else {
            System.out.println(name + "not adult");
        }
    }

    // for loop with index
    public void printMarkswithIndex() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("for loop Marks " + (i + 1) + " : " + marks[i]);

        }
    }

    //while loop
    public void marksWhile() {
        int i = 0;
        while (i < marks.length) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
            i++;
        }
    }

    // for each loop
    public void forEachLoop() {

        for (int mark : marks) {
            System.out.println("for each loop marks is" + ":" + mark);
        }
    }

    // if loop
    public void ifLoop() {
        if (age >= 18) {
            System.out.println("adult");
        }
    }

    // if else
    public void ifElseCondition() {
        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("minor");

        }
    }

    public void ifElseIf() {
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }

    public void nestedIf(){
        int marks = 90;
        boolean hasID = true;
        if(marks>=85){
            if(hasID) {
                System.out.println("Entry allowed");
            }else{
                System.out.println("has ID");


            }
        }
    }

    public void ternaryOperator(){
        int age = 17;
        String results = (age>=18) ? "adult" : "minor";
        System.out.println(results);
    }

    //encapsulation means bundling the data together fields and methods and restricting direct access to the fields



    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printInfo();
        dataTypes.setAge(20);
        dataTypes.checkAdult();
        System.out.println("Age after setting: " + dataTypes.getAge());
        dataTypes.nestedIf();

        //print marks with loops
        dataTypes.printMarkswithIndex();

        // print marks with if-else
        dataTypes.checkAdult();

        // while loop
        dataTypes.marksWhile();

        dataTypes.forEachLoop();
        dataTypes.ifElseIf();

        dataTypes.ternaryOperator();
    }
}




