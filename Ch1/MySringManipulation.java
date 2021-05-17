/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: MySringManipulation                                 *
 * Description:                                                   *
 * This program demonstrates how to manipulate a String using its *
 * different methods. In this program we use: length(), charAt(), *
 * toUpperCase(), toLowerCase(), and substring()                  *
 *****************************************************************/
public class MySringManipulation
{
  // Reminder:
  // The syntax to create and initialize a variable
  // <type> <id> = <value>;
  /**
   * In this class we will demonstrate how to
   * manipulate a String. We use several examples
   * of the methods that we apply to a single String
   *@param args
   *@author C. Servin
   */ 
  public static void main(String [] args)
  {
    // create a String
    String s1 = "hElLo";
    //printing the string s1 containig the value "hello"
    System.out.println("String: "+s1);
    //printing the total length of s1, which is 5
    System.out.println("Length: "+s1.length());
    //printing the transformation of "hElLo" to upper case, "HELLO"
    System.out.println("Uppercase: "+s1.toUpperCase());
    //printing the transformation of "hElLo" to lower case, "hello"
    System.out.println("Lowercase: "+s1.toLowerCase());
    //printing the 0th position of the string s1, i.e., H
    System.out.println("char for H: "+s1.charAt(0));
    //printing the 1st position of the string s1, i.e., E
    System.out.println("char for E: "+s1.charAt(1));
    //printing the 4th position of the string s1, i.e., O
    System.out.println("char for O: "+s1.charAt(4));
    /*
     * error because we want to extract position 5
     * out of the length 5
     * System.out.println("char at pos 5: "+s1.charAt(5));
     */
    // use substring
    System.out.println("substring 1-2: "+s1.substring(1,3));
    System.out.println("substring 2-4: "+s1.substring(2,4));
    System.out.println("substring 2-6: "+s1.substring(2,6));
    
  }
}