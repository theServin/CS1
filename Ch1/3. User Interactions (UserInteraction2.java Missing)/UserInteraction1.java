/**
 *  Program Name: UserInteraction1.java
 *   Description: Program demonstrates how to interact with the user
 *                using the Scanner object.
 * Related class: Scanner 
 *         Input: Users name, favorite food, and age.
 *          args: N/A
 *        Output: Users name and the calculated year of birth. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/
import java.util.Scanner;
public class UserInteraction1{
    public static void main(String[] args) {
        // In order to extract information we need to create a Scanner
        Scanner input = new Scanner(System.in);
        // Ask the user for his/her name
        System.out.println("What is your name?");
        // The input.nextLine() part, will open a "box" that 
        // will capture the input from the user
        // since we are expecting a String from the box, 
        // we must hold that value in a variable that holds a String
        // in this case we will call it name.
        String name = input.nextLine();
        // Ask the user for his/her favorite food
        System.out.println("What is your favorite food?");
        String food = input.nextLine();
        // Ask the user for his/her age
        System.out.println("What is your age?");
        // This time, instead of storing the value into a String
        // we will store it into an int. We need an int since 
        // we will perform an arithmetic operation with the year.
        int age = input.nextInt();
        // Calculate the year the user was born.
        int year = 2022 - age;
        // Print a friendly statement with the combination
        // of the two answers.
        String response = "Hi, please to meet you "+name+". I also love "+food+"!!!"+
            " I bet you were born in "+year+"?, eh?";
        System.out.println(response);      
    }
}