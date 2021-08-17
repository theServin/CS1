/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: LoopExample05                                       *
 * Description:                                                   *
 * Program that asks what op would like to perform. For simplicity*
 * let us restrict the op to sum and sub. If the user enters      *
 * "exit" as the operator, then the program shall stop            *
 * inmediately. The program uses the "break" keyboard as an       *
 * emergency exit.                                                *
 * This program in addition demonstrates how to "flush" the       *
 * Scanner, everytime we exchange types in the input              *
 *****************************************************************/
import java.util.Scanner;
public class LoopExample05{
  public static void main(String [] args){
    // create a Scanner outside the loop
    Scanner input = new Scanner(System.in);
    do{
      System.out.println("What op you want?");
      // at this point input will return String
      String op = input.nextLine();
      // in case the user selected sum, we ask for 2 numbers
      if(op.equals("sum")){
        System.out.println("number 1? ");
        int x = input.nextInt();
        System.out.println("number 2? ");
        int y = input.nextInt();
        System.out.println(x+y);
        // the problem at this point is: Scanner is confused about
        // what to return now! Since in line 21 it give us a String
        // but in the last lines it gave us ints. It is important to
        // "flush" or clean the buffer just to make sure next time
        // we use the Scanner (in the next iteration) we ask with a
        // clear buffer
        input.nextLine(); // this empty statment flushes the Scanner
      }
      // in case the user provides sub
      else if(op.equals("sub")){
        System.out.println("number 1? ");
        int x = input.nextInt();
        System.out.println("number 2? ");
        int y = input.nextInt();
        System.out.println(x-y);
        input.nextLine(); // flush the buffer
      }
      // in case the user enters "exit" leave the loop inmediately!
      else if(op.equals("exit")){
        break; // this will terminate the loop right away
      }
      // to verify that we still running, we put some s.o.p.
      System.out.println("Testing loop...");
    }while(true);
  }
}