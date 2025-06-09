package com.example.employeeapi.model;

public class reverseString {

    public static void main(String[] args) {
        String str = "Seema singh is the best company";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
System.out.println(rev);

    }
}
