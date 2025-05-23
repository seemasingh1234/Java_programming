package com.example.employeeapi.model;

public class LoopExamples
{
    public static void main(String[] args){

        System.out.println("Hello World");
        forLoopExample();
        whileLoopExamples();
        doWhileLoopExample();

    }

    public static void forLoopExample(){
        for(int i = 1; i>=5;i++){
            System.out.println("for loop example" +i);
        }
    }

    public static void whileLoopExamples(){
        int i = 1;
        while(i<=5) {
            System.out.println("while loop example" + i);
            i++;
        }
    }

    public static void doWhileLoopExample(){
        int i = 1;
        do{
            System.out.println("do while loop example"  +i);
            i++;
        }
        while(i<=5);


    }



}
