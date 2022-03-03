/**   
   *  Program Name: ArrayExample03.java
   *   Description: Program shows the implementation, initialization,
   *                and iterative printing of a fixed array.
   * Related class: String 
   *         Input: N/A.
   *          args: N/A
   *        Output: Contents of an array of integers.
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2022, Christian Servin, Ph.D.
   *                Version 1.0
   */
public class ArrayExample03{
    public static void main(String[] args) {
        // Declaration of a fixed array of integers
        int[] a = {5, 3, 2, 24, 7, 1, 45, 66, 79, -1, 76, 9, 0, 23, 5,67, 88, 1, -54, 777, 0, 91, 66,55,132, 54, 224,224, -123};

        // Iterative printing of all elements in the array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}