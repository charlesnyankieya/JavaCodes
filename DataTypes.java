package com.foundations;

public class DataTypes {
    public static void main(String[] args) {
       final int firstNumber;
        int secondNumber;
        //const you add final
        //constant must be in uppercase

        firstNumber = 76;
        secondNumber = 87;

        double average =(double) (firstNumber + secondNumber) /2;//casting into a double
        //or
        //double average = (firstNumber + secondNumber) /2.0;
        System.out.println("average " + average);

        String firstName;
        String lastName;


        firstName = "Sunset";
        lastName = "Jesus";

        String fullName = firstName + " "+  lastName;
        System.out.println(fullName);

        char letter, number;
        letter = 'j';
        number = 242;

        System.out.println(letter);
        System.out.println(number);

    }

    //scanner class
}
