package com.example.employeeapi.model;

public class Calculator {

    private String model;
    public Calculator(String model){
        this.model = model;
    }

    public int add(int a, int b) {
        return a + b;

    }



    public static void main(String[] args) {

        Calculator cal = new Calculator("Casio FX-991EX");
        System.out.println("Two numbers are " + cal.add(9, 10));
        System.out.println("Two numbers are " + cal);
    }
}
