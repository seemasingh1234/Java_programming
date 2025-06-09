package com.example.employeeapi.model;

public class StringLength {
    public static void main(String[] args) {
        String name = "Seema Singh";

        int length = name.length();

        char letter = name.charAt(6);

        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("h");

//         name = name.toUpperCase();
//         name = name.toLowerCase();
//         name = name.trim();
//         name = name.replace("a", "s");

//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);
//        System.out.println(name);

        if (name.contains(" ")) {
            System.out.println("name contains space");
        }
        else{
            System.out.println("name does not contain space");
        }


        }
    }

