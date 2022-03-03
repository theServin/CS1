/**   
 *  Program Name: ArrayExample04.java
 *   Description: Program shows the differences between a String
 *                and an array of characters.
 * Related class: String 
 *         Input: N/A.
 *          args: N/A
 *        Output: Contents of an array of characters, the characters of a String,
 *                if an array of characters and a String equal, and their memory locations.
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2022, Christian Servin, Ph.D.
 *                Version 1.0
 */
public class ArrayExample04{
    public static void main(String[] args) {
        // Declaration of an array of characters
        char[] a = {'h','e','l','l','o'};
        String s = "hello";
        System.out.println(a);        
        System.out.println(s);
        
        // Iterative printing of characters on an array
        System.out.println("Printing characters from array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        // Iterative printing of characters on a String
        System.out.println("Printing characters from String");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        
        // Proving a String does not equals an array of characters even though
        // Java internally uses an array of characters to represent a String
        System.out.println("are they equal? "+s.equals(a));
        
        // Printing the hexadecimal hashcode representations (memory locations)
        System.out.println("String hashcode: "+s.hashCode());
        System.out.println("Array hashcode:  "+a.hashCode());
    }
}
