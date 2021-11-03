/**
 *  Program Name: Beverage6.java
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
public class Beverage6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Request beverage from user
        System.out.println("What do you want to drink?");
        String beverage = input.nextLine();
        // Input data validation
        beverage = beverage.toLowerCase();
        switch( beverage ){
            // Hot beverage block
            case "Coffee":  
            case "Tea":
                System.out.println("Hot Beverage"); 
                break;
            // Cold beverage block
            case "Horchata":
            case "Soda":
            case "Water":
                System.out.println("Cold Beverage");
                break;
            // Exception block
            default:
                System.out.println("This item is not in the menu...");
        }
    }
}
