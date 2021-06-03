/**
 *  Program Name: Interaction1.java
 *   Description: Program demonstrates how to interact with the user
 *                using the Scanner object.
 * Related class: Scanner 
 *         Input: Users name and year of birth.
 *          args: N/A
 *        Output: Users name and the calculated age. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/

import java.util.Scanner;
public class Interaction1{
  public static void main(String [] args){
    // ask the user for his/her name
    System.out.println("Hi! what's you name?");
    // in order to extract information we need to create a Scanner
    Scanner input = new Scanner(System.in);
    //the input.nextLine() part, will open a "box" that 
    //will capture the input from the user
    // since we are expecting a String from the box, 
    // we must hold that value in a variable that holds a String
    // in this case we will call it name
    String name = input.nextLine();
    System.out.println("Nice to meet you "+name+"!");
    // now lets ask for the year the user was born
    System.out.println("What year were you born?");
    // this time, instead of storing the value into a String
    // we will store it into an int. We need an int since 
    // we will perform an arithmetic operation with the year
    int year = input.nextInt();
    // calculate the age.
    int age = 2014 - year;
    // print a friendly statement with the combination
    // of the two answers
    System.out.println("Nice to meet you "+name+
                       "!, btw, I know you are "+age+
                       " years old");
  }
}