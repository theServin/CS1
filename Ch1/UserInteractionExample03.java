/**
 *  Program Name: UserInteractionExample03.java
 *   Description: Program demonstrates how to interact with the user
 *                using the JOptionPane object.
 * Related class: JOptionPane
 *         Input: Users name, favorite food, age, and major.
 *          args: N/A
 *        Output: User's name, favorite food, calculated year of birth, and their major. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/

import javax.swing.JOptionPane;
public class UserInteractionExample03{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hi!, what is your name?");
        JOptionPane.showMessageDialog(null, "Nice to meet you "+name+"!!!");
        String food = JOptionPane.showInputDialog("What is your favorite food?");
        JOptionPane.showMessageDialog(null, "OMG! I LOVE "+food+"!!!!!");
        String ageInput = JOptionPane.showInputDialog("How old are you? ");
        int age = Integer.parseInt(ageInput);
        int year = 2021 - age;
        JOptionPane.showMessageDialog(null,"I bet you were born in "+year+", eh?!");
        String major = JOptionPane.showInputDialog("What is your major?");        
        JOptionPane.showMessageDialog(null,"oh wow "+major+" sounds very interesting! Tell me more about it :-)");




    }
}