/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: ValidInputExample04                                 *
 * Description:                                                   *
 * Program that demonstrates sentinels/flags                      *
 *****************************************************************/
import java.util.Scanner;
public class ValidInputExample04{
  public static void main(String []args){
    // flag is a boolean variable that will allow the loop to run
    // until flag = false;
    // first let us use a a while
    boolean flag = true;
    while(flag){
      Scanner input = new Scanner(System.in);    
      System.out.println("Please enter a value between [1-10]");
      int x = input.nextInt(); // get input from the user
      if(x>=1 && x <10){       // compare if is valid
        flag = false;
      }
    }
    // Now let us use a for-loop version
    boolean flag2 = true;
    for(;flag2;){
      Scanner input = new Scanner(System.in);    
      System.out.println("Please enter a value between [1-10]");
      int x = input.nextInt();
      if(x>=1 && x <10){
        flag2 = false;
      }
    } 
  }
}