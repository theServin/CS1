/**
 *  Program Name: UserInteractionExample01.java
 *   Description: Program demonstrates how to extensively interact with the user
 *                using the Scanner object.
 * Related class: Scanner 
 *         Input: Users name, favorite food, age, and major.
 *          args: N/A
 *        Output: Users name, favorite food, calculated year of birth, and their major. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/

import java.util.Scanner;
public class UserInteractionExample01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi!, what is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you "+name+"!!!");
        System.out.println("What is your favorite food?");
        String food = input.nextLine();
        System.out.println("OMG! I LOVE "+food+"!!!!!");
        System.out.println("How old are you? ");
        int age = input.nextInt();
        int year = 2021 - age;
        
        System.out.println("I bet you were born in "+year+", eh?!");
        System.out.println("What is your major?");
        input.nextLine(); // "flushing" the scanner (clear up)
        
        String major = input.nextLine();
        System.out.println("oh wow "+major+" sounds very interesting! Tell me more about it :-)");




    }
}