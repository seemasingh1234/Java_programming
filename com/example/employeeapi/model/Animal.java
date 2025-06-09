package com.example.employeeapi.model;

class Animal {

        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {

        void bark() {
            System.out.println("Dog barks");
        }
    }

    class Main {
        public static void main(String[] args) {
            Dog dg = new Dog();
            dg.sound();  // Inherited from Animal
            dg.bark();   // Defined in Dog

            System.out.print("by me a pizza\n");
            System.out.print("by me a pizza");
            System.out.print("by me a pizza\n");
            System.out.print("by me a pizza");
            System.out.print("by me a pizza");
            System.out.print("by me a pizza");
        }
    }


