/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: IfElseExample02                                     *
 * Description:                                                   *
 * This program provides an example of how to use else-if         *
 * The idea is to provide flexibility on the values of temp.      *
 * Notice that the commented lines (27 - 29) if is uncommented a  *
 * different behavior will be exptected                           *
 *****************************************************************/
import java.util.Scanner;
public class IfElseExample02{
  public static void main(String [] args){
   double temp;
    // let us ask the user for the input
    System.out.println("What is the current temperature?");
    Scanner input = new Scanner(System.in);
    temp = input.nextDouble();
    // let us make a decision, based on temp
    if(temp >= 95)
    {
      System.out.println("Wear Shorts, tank top, and chanclas");
    }
    else if(temp >= 85)
    {
      System.out.println("Wear jeans, t-shirt, sneakers");
    }
//    if(temp >= 85)
//    {
//      System.out.println("Wear jeans, t-shirt, sneakers");
//    }
    else
    {
      System.out.println("Wear pants, long sleeve, and botas");
    }
  }
}