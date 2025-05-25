package com.example.employeeapi.model;

public class StudentTest {

    private int age;

    public StudentTest(int age2) {
        age= age2;

    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest(1);

        System.out.println(studentTest.age);
    }
}
