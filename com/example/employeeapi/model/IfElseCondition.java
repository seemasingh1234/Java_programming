package com.example.employeeapi.model;

public class IfElseCondition {

    public static void main(String[] args) {

        int age = 0;

        if (age > 20) {
            System.out.println("Good");

        }
        else if(age<0){
            System.out.println("you have not yet born");
        }

        else if (age==0){
            System.out.println("you have not yet born yet");
        }
        else {
            System.out.println("younger");
        }
    }
}
