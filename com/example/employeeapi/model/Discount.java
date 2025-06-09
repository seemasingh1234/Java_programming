package com.example.employeeapi.model;

public class Discount {
    public static void main(String[] args){

        boolean isSenior;
        boolean isStudent = true;
        double price = 9.99;

        if(isStudent){
            System.out.println("will pay 10% less");
            price *= 0.9;

        }
        else{
          price *= 1;
        }
        System.out.println(" The price of the ticket is $" + price);

    }
}
