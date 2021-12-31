/**
 *  Program Name: UserInteraction2.java
 *   Description: Program demonstrates how to interact with the user
 *                using the JOptionPane library.
 * Related class: JOptionPane 
 *         Input: Users name, favorite food, and age.
 *          args: N/A
 *        Output: Users name and the calculated year of birth. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/
import javax.swing.JOptionPane;
public class UserInteraction2{
    public static void main(String[] args) {
        // The JOptionPane.showInputDialog part, will prompt a window that 
        // will capture the input from the user
        // since we are expecting a String from the window's box, 
        // we must hold that value in a variable that holds a String
        // in this case we will call it name.
        String name = JOptionPane.showInputDialog("What is your name?");
        // Ask the user for his/her favorite food.
        String food = JOptionPane.showInputDialog("What is your favorite food?");
        // Ask the user for his/her age.
        String age = JOptionPane.showInputDialog("What is your age?");
        
        // Calculate the year the user was born by parsing the age from a String to an Integer.
        int year = 2022 - Integer.parseInt(age);
        // Print a friendly statement with the combination
        // of the two answers with the help of JOptionPane.showMessageDialog.
        String response = "Hi, please to meet you "+name+". I also love "+food+"!!!"+
            " I bet you were born in "+year+"?, eh?";
        JOptionPane.showMessageDialog(null, response);      
    }
}