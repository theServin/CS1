/**
 *  Program Name: MyFirstProgram.java
 *   Description: Program demonstrates how to declare and initialize
 *                variables of 3 different types. Also, we provide values to
 *                an object String. We demonstrate how to "concatenate"
 *                values through Strings.
 * Related class: String 
 *         Input: Users hight, name, and favorite animal.
 *          args: N/A
 *        Output: Users name, hight, and favorite animal. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/
 
public class MyFirstProgram
{
  public static void main(String[] args)
  {
    // variables: 
    int x = 5;      // declaring an int variable x with a value 5
    double y = 3.3; // declaring a double variable y with a value 3.3
    x = 7;          // assigning value 7 to variable x
    char whatever = 'c';    
    
    // this is the information for a student info
    double height = 1.78;
    String name = "Meraz";
    String favAnimal = "dogs";
    
    System.out.println(name);
    System.out.println(height);
    System.out.println(favAnimal);
    // by using concatenation, we can "stick" the words and variables
    // together
    // 1. cut the String where you want to "stick" word by ""
    // 2. "stick" the variable by puttin ++
    // 3. put the variable between the ++ sing
    System.out.println("Mr. "+name+" is "+height+
		" meters tall, and he likes "+favAnimal+"!");
  }
}