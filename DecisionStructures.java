package com.foundations;

import javax.swing.*;

public class DecisionStructures {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 5;

        boolean expression = a > b || c > b;





        System.out.println(expression);


        int firstNumber;
        int secondNumber;

        String number;

        number = JOptionPane.showInputDialog("Enter first number");
        firstNumber = Integer.parseInt(number);

        number = JOptionPane.showInputDialog("Enter second number");
        secondNumber = Integer.parseInt(number);
        boolean checkNumber = firstNumber > secondNumber;

        JOptionPane.showMessageDialog(null, checkNumber);

    }
}
