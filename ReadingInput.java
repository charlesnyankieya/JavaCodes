package com.foundations;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int firstNumber;
        int lastNumber;
        String artist;
        String song;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the last Number");
        lastNumber = scanner.nextInt();

        double average = (firstNumber + lastNumber) /2.0;
        System.out.println("the average is " + average);

        scanner.nextLine();

        System.out.println("Enter name of artist");
        artist = scanner.nextLine();
        System.out.println("Enter name of song");
        song = scanner.nextLine();

        System.out.println(song + " by " + artist );




    }
}
