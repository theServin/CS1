/**
 *  Program Name: Beverage3.java
 *   Description: Program that requests the computer user 
 *                to decide between hot or cold beverages. 
 *                The program shall display "Hot Beverage"
 *                or "Cold Beverage" depending on the request.
 * Related class: String 
 *         Input: Beverage.
 *          args: N/A
 *        Output: Hot or cold beverage.
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/
import java.util.Scanner;
public class Beverage3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Request beverage from user
        System.out.println("What do you want to drink?");
        String beverage = input.nextLine();
        // Hot beverage block
        if(beverage.equalsIgnoreCase("coffee") || beverage.equalsIgnoreCase("tea")){
            System.out.println("Hot Beverage");
        }
        // Cold beverage block
        else if(beverage.equalsIgnoreCase("horchata") || 
                beverage.equalsIgnoreCase("soda") || 
                beverage.equalsIgnoreCase("water")){
            System.out.println("Cold Beverage");
        }
        // Exception block
        else{
            System.out.println("This item is not in the menu...");
        }
    }
}
