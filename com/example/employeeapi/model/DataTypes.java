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

    public void checkAdult(){
        if(age>= 18) {
            System.out.println(name + " if else candidate is an adult");
        } else{
                System.out.println(name + "not adult");
            }
        }
// for loop with index
        public void printMarkswithIndex(){
        for (int i = 0; i < marks.length;i++){
            System.out.println("for loop Marks " + (i+1) +" : " + marks[i]);

        }
        }

        //while loop
    public void marksWhile(){
        int i =0;
        while(i< marks.length) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
            i++;
        }
    }

    // for each loop
     public void forEachLoop(){

        for(int mark:marks){
            System.out.println("for each loop marks is" + ":" + mark);
        }
     }



    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printInfo();
        dataTypes.setAge(20);
        dataTypes.checkAdult();
        System.out.println("Age after setting: " + dataTypes.getAge());

        //print marks with loops
        dataTypes.printMarkswithIndex();

        // print marks with if-else
        dataTypes.checkAdult();

        // while loop
        dataTypes.marksWhile();

        dataTypes.forEachLoop();
    }
}


