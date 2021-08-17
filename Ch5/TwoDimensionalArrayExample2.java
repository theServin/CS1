/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: TwoDimensionalArrayExample2                         *
 * Description:                                                   *
 * This program will demonstrate the shortcut to create a 2D      *
 * array. Also will explain the try/catch blocks in case there is *
 * a bad input from the user. In addition, this program shows an  *
 * example of method definition and method call that accepts a    *
 * 2D array as parameters.                                        *
 *****************************************************************/
import java.util.Scanner;
public class Array2DExample2{
  public static void main(String [] args){
    // create a 2D array with two rows and two cols
    int[][] a = {{1,3},{5,6}};
    System.out.println("The total is: "+getTotal(a));
    System.out.println("Please enter a number between [1-10]");
    Scanner input = new Scanner(System.in);
    // the try is used as a sandbox where potential Exception
    // might happen
    try{
      int n = input.nextInt(); // retrieve user's input
      validateNumber(n);       // invoke the method
    }// in case the exeption was throw, we ``catch'' it
    catch(IllegalArgumentException e){
      System.out.println(e);
    }// this is in case the user provides a different type
    catch(java.util.InputMismatchException e2){
      System.out.println("Sir/Ma'm this is serious...");
    }
  }
  /**
   * method that will validate the input from the user
   *@param n the number that we wan to validate
   **/
  public static void validateNumber(int n){
    if(n<1 || n>10)
      throw new IllegalArgumentException("Number must be between [1-10]");
  }
  /**
   * given a 2D array find the total
   * value of all indices 
   *@param array that represents the 2D matrix
   *@return the total value of all indices
   **/
  public static int getTotal(int[][] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[0].length; j++){
        sum+= array[i][j];
      }
    }
    return sum;
  }
}