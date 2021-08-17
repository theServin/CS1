/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: MethodExample                                       *
 * Description:                                                   *
 * This program demonstrates how to define a method. The method   *
 * is defined as f (for function). Given a value (x) will return  *
 * f(x) = x * x + 3                                               *
 *****************************************************************/
public class MethodExample{
  public static void main(String [] args){
    int a = f(3);
    System.out.println(a);
  }
  /**
   * f
   * Method f takes an int as a parameter and returns the 
   * operation of x * x + 3
   *@param an int representing the value of x
   *@return an int having the result of x * x + 3
   */
  public static int f(int x){
    int ans = 0;
    ans = x * x + 3;
    return ans;
  } 
}