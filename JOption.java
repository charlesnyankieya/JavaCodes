package com.foundations;

import javax.swing.*;

public class JOption {
    public static void main(String[] args) {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Please enter your name");//pops up the popup window
        surname = JOptionPane.showInputDialog("Please enter your surname");

        JOptionPane.showMessageDialog(null, name +" " + surname);

        double twelve;
        double eleven;

        String decimal;

        decimal = JOptionPane.showInputDialog("Please enter first decimal");
        twelve = Double.parseDouble(decimal);

        decimal = JOptionPane.showInputDialog("Please enter second decimal");
        eleven =Double.parseDouble(decimal);

        double multi = twelve * eleven ;

        JOptionPane.showMessageDialog(null, multi);


        int firstNumber;
        int secondNumber;

        String input;

        input = JOptionPane.showInputDialog("Please enter your first number");
        firstNumber = Integer.parseInt(input);//double.parseDouble etc...

        input = JOptionPane.showInputDialog("please enter the second number");
        secondNumber = Integer.parseInt(input);

        double average = (firstNumber+secondNumber)/2.0;

        JOptionPane.showMessageDialog(null,  average);

    }
}
