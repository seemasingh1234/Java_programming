package com.example.employeeapi.model;
 import org.w3c.dom.ls.LSOutput;

 import java.util.Scanner;
public class GameMad {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String  verb1;
        String adjecvtive3;
        String noun3;
        System.out.println("Enter the name of the game: " );
        adjective1 = scanner.nextLine();
        System.out.println(adjective1);

        System.out.println("Enter the name of the game: " );
        noun1 = scanner.nextLine();
        System.out.println(noun1);

        scanner.close();



    }

}
