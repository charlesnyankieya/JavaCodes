package com.foundations;

import java.util.Scanner;

public class Variables { //containers that hold information
    public static void main(String[] args) {//data types java
        /*
        byte size is one byte, integers -128 to + 127
        short size is of two bytes
        int size is of 4 bytes
        long size is of 8 bytes
        float size is of 4 bytes
        double size is of 8 bytes
        char 2 bytes
        string text
         */
        int firstNumber;
        int secondNumber;

        firstNumber = 34;
        secondNumber = 45;
        int sum = firstNumber + secondNumber;
        int multiplication = firstNumber * secondNumber;
        System.out.println(multiplication);
        System.out.println(sum);

        String firstName;
        String secondName;

        firstName = "Trevin ";
        secondName = "Obama";
        String fullName = firstName+secondName;

        System.out.println(fullName);
        /**
        * Scanner scanner = new Scanner(System.in);
       * System.out.println("Enter first name");
       * String firstname = scanner.nextLine();
         */

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter First Name");
        String firstname = scanner.nextLine();

        System.out.println("Enter Second Name");
        String secondname = scanner.nextLine();

        System.out.println("Enter your age");
        String age = scanner.nextLine();

        String fullnames = firstname+ " " + secondname;

        System.out.println("Your name is" +" " + fullnames+ " " + "and your age is " + " " + age);




    }
}
