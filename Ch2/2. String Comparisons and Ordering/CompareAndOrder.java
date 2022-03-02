/**   
 *  Program Name: CompareAndOrder.java
 *   Description: Program asks the user for three words
 *                to find the permutation that shows
 *                an ascending ordering of the data.
 * Related class: String 
 *         Input: Words to order.
 *          args: N/A
 *        Output: Permutation in ascending order.
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2022, Christian Servin, Ph.D.
 *                Version 1.0
 */
import java.util.Scanner;
public class CompareAndOrder{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        // Ask for the three words
        System.out.println("\nInput three words:");
        System.out.print("\nWord 1: ");
        String w1 = scnr.next();
        System.out.print("Word 2: ");
        String w2 = scnr.next();
        System.out.print("Word 3: ");
        String w3 = scnr.next();
        System.out.println();
        scnr.close();

        // Decision structure to find the ordered permutation
        if(w1.compareTo(w2) <= 0 && w2.compareTo(w3) <= 0){
            System.out.println(w1 + " " + w2 + " " + w3);
        }
        else if(w1.compareTo(w3) <= 0 && w3.compareTo(w2) <= 0){
            System.out.println(w1 + " " + w3 + " " + w2);
        }
        else if(w2.compareTo(w1) <= 0 && w1.compareTo(w3) <= 0){
            System.out.println(w2 + " " + w1 + " " + w3);
        }
        else if(w2.compareTo(w3) <= 0 && w3.compareTo(w1) <= 0){
            System.out.println(w2 + " " + w3 + " " + w1);
        }
        else if(w3.compareTo(w1) <= 0 && w1.compareTo(w2) <= 0){
            System.out.println(w3 + " " + w1 + " " + w2);
        }
        else{
            System.out.println(w3 + " " + w2 + " " + w1);
        }
        System.out.println();
    }
}