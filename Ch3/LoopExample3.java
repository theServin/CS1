  /**   
   *  Program Name: LoopExample3.java
   *   Description: Program shows the structure of a do-while loop.
   * Related class: String 
   *         Input: N/A
   *          args: N/A
   *        Output: "hello" only once.
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2021, Christian Servin, Ph.D.
   *                Version 1.0
   */
public class LoopExample3{
    public static void main(String [] args){
        /**
         * (1) initialization of control variable
         * do{
         *   (3)   body of the loop
         *   (4)   update of control variable
         * }while(condition);   (4)
         */
        int counter = 0;                // (1)
        do{
            System.out.println("hello");// (3)
            counter = counter + 1;      // (4)
        }while(counter < 0);            // (2)
    }
}