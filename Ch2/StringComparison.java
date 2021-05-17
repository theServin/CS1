/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: StringComparison                                    *
 * Description:                                                   *
 * This program demonstrates the different comparisions results   *
 * of String. A String only can be compare its content by using   *
 * the .equals() and the .compareTo(). The relational operator == *
 * is only used (at this point) to compare primitive types        *
 *****************************************************************/
import java.util.Scanner;
public class StringComparison{
  public static void main(String [] args){
    String s1 = "hello";
    String s2 = "hi";
    String s3 = "java";
    String s4 = "hello";
    System.out.println("s1 == s2: "+(s1 == s2)); // expect false
    System.out.println("s1 == s4: "+(s1 == s4)); // expect false
    System.out.println("s1.equals(s2): "+(s1.equals(s2)));// expect false
    System.out.println("s1.equals(s4): "+(s1.equals(s4)));// expect true
    System.out.println("si.compareTo(s4): "+(s1.compareTo(s4)));// expect 0
  }
}