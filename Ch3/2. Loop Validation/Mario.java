/**   
   *  Program Name: Mario.java
   *   Description: Program shows the staircase that appears at the end of Mario levels.
   * Related class: String 
   *         Input: Height of staricase from 1 to 8 inclusive.
   *          args: N/A
   *        Output: Ascending staircase.
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2022, Christian Servin, Ph.D.
   *                Version 1.0
   */
import java.util.Scanner;
public class Mario{
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       // Ask for the staircase's height
       System.out.println("Enter height: ");
       int height;
       boolean flag = false;
       do{
            height = scnr.nextInt();
            // Use of loop validation to test height's boundaries
            if(height > 0 && height <= 9){
                flag = true;
            }
       }while(!flag);
       scnr.close();
       
       // Printing the ascending staircase
       for(int i = 0; i < height; ++i){
            // Use of a sentinel to stop the flow of the program when the height is 9
            if(height > 8){
                System.out.println("Looks like someone didn't follow the instructions.");
                return;
            }
            // Printing spaces depeding on the height and hashes to print
            for(int k = height - i - 1; k > 0; --k){
                System.out.print(" ");
            }
            // Printing hashes depending on the height
            for(int j = 0; j < i + 1; ++j){
                System.out.print("#");
            }
            System.out.println();
       }

       // Previous implementation to print the descending staircase
       /*for(int i = 0; i < height; ++i){
            for(int j = 0; j < i + 1; ++j){ 
                System.out.print("#");
            }
            System.out.println();
        }*/
   }
}