package com.example.employeeapi.model;

import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args){

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter item name : ");
        item = sc.nextLine();
        System.out.println(item);

        System.out.println("Please enter item price : ");
        price = sc.nextDouble();

        System.out.println("Please enter quantity : ");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.println("\n your item is ready which includes total : " +quantity + " /s of " +item);
        System.out.println("Total : " + total);


    }
}
