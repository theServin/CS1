/**   
   *  Program Name: ArrayExample01.java
   *   Description: Program shows the implementation, initialization, 
   *                and printing of an array of size 5.
   * Related class: String 
   *         Input: N/A.
   *          args: N/A
   *        Output: Contents of an array of 5 integers.
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2022, Christian Servin, Ph.D.
   *                Version 1.0
   */
public class ArrayExample01{
    public static void main(String[] args) {
        // Declaration of an array of integers
        int[] a = new int[5];

        // Initialization of indexes
        a[0] = 5;
        a[1] = 3;
        a[2] = 2;
        a[3] = 24;
        a[4] = 7;

        // Printing of contents based on indexed access
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

    }
}