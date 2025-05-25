package com.example.employeeapi.model;

public class DataTypes {

    public int age = 20;
    public double height = 5.7;
    public char grade = 'A';
    public boolean isEnabled = true;

    public String name = "Seema";
    public int[] marks = {98, 99, 75}; // fixed typo

    // Getter for age
    public int getAge(){
        return age;
    }

    // Setter for age
    public void setAge(int ageS){
        this.age = ageS;
    }

    public void printInfo(){
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("IsEnabled: " + isEnabled);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for(int mark : marks){
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printInfo();
        dataTypes.setAge(20);
        System.out.println("Age after setting: " + dataTypes.getAge());
    }
}
