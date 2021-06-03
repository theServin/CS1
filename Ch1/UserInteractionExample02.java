/**
 *  Program Name: UserInteractionExample02.java
 *   Description: Program demonstrates how to print out information
 *                using arguments.
 * Related class: N/A 
 *         Input: The year.
 *          args: N/A
 *        Output: Several arguments concatenated together in a String. 
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2021, Christian Servin, Ph.D.
 *                Version 1.0
 **/

public class UserInteractionExample02{
    public static void main(String[] args) {
        int year = 2021 - Integer.parseInt(args[2]);
        String msg = "Your name is: "+args[0]+" and you like "+
                    args[1]+". You are "+args[2]+" years old. "+
                    "I bet you were born in "+year+", eh?! and "+
                    "currently you are studying "+args[3];
        System.out.println(msg);
    }
}