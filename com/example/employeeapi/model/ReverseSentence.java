package com.example.employeeapi.model;

public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = " you are the best";

        String[] words = sentence.trim().split("\\s+");

        //reverse the word array
        for (int i = words.length- 1; i >= 0; i--) {
            System.out.print(words[i] + " ");

        }

    }
}

