/**   
 *  Program Name: ArrayExample05.java
 *   Description: Program shows the triggering of the IndexOutOfBounds exception.
 * Related class: String 
 *         Input: N/A.
 *          args: N/A
 *        Output: Contents of an array of integers.
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2022, Christian Servin, Ph.D.
 *                Version 1.0
 */
public class ArrayExample05{
    public static void main(String[] args) {
        // Declaration of an array of integers
        int[] a = new int[5];

        // Initialization of indexes
        a[0] = 5;
        a[1] = 3;
        a[2] = 2;
        a[3] = 24;
        a[4] = 7;
        
        // Iterative printing of all elements in the array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        /* Demonstration of the IndexOutOfBounds exception
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
        */
    }
}
