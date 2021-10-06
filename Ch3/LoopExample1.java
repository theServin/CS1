  /**   
   *  Program Name: LoopExample1.java
   *   Description: Program shows the structure of a while loop.
   * Related class: String 
   *         Input: N/A
   *          args: N/A
   *        Output: N/A
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2021, Christian Servin, Ph.D.
   *                Version 1.0
   */
public class LoopExample1{
    public static void main(String [] args){
        /**
         * (1) initialization of control variable
         * (2) while(condition){
         * (3)   body of the loop
         * (4)   update of control variable
         * }
         */
        int counter = 0;                // (1)
        while(counter < 0){             // (2)
            System.out.println("hello");// (3)
            counter = counter + 1;      // (4)
        }

        
        

    }
}