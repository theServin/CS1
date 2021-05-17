/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: IfElseExample01                                     *
 * Description:                                                   *
 * This program demonstrates a simple if-else statment based on   *
 * the value of the variable temp (i.e., the temperature)         *
 * provided by the user using the Scanner object.                 *
 *****************************************************************/
import java.util.Scanner;
public class IfElseExample01{
  public static void main(String [] args){
    // declare a variable that will represent the current
    // temperature
    double temp;
    // let us ask the user for the input
    System.out.println("What is the current temperature?");
    Scanner input = new Scanner(System.in);
    temp = input.nextDouble();
    // let us make a decision, based on temp
    if(temp >= 95)
    {
      System.out.println("Wear Shorts, t-shirt, and chanclas");
    }
    else
    {
      System.out.println("Wear pants, long sleeve, and botas");
    }
    
  }
}