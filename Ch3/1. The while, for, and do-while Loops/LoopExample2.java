  /**   
   *  Program Name: LoopExample2.java
   *   Description: Program shows the structure of a for loop.
   * Related class: String 
   *         Input: N/A
   *          args: N/A
   *        Output: N/A
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2021, Christian Servin, Ph.D.
   *                Version 1.0
   */
public class LoopExample2{
    public static void main(String [] args){
        /**
         * (1) initialization of control variable
         * (2) while(condition){
         * (3)   body of the loop
         * (4)   update of control variable
         * }
         * for( 1 ; 2; 4){
         *        3
         * }
         */

        //         (1)            (2)          (4)
        for(int counter = 0; counter < 0; counter++){
            System.out.println("hello");// (3)
        }
    }
}