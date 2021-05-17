/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: IfElseExample04                                     *
 * Description:                                                   *
 * Rewrite the IfElseExample03 example but this time using logical*
 * operators to ensure the ranges of the values for the acerage   *
 *****************************************************************/
import java.util.Scanner;
public class IfElseExample04{
  public static void main(String [] args){
    /* Write a program that asks */
    Scanner keyboard = new Scanner(System.in);
    /*the user to enter 3 grades.*/
    System.out.println("Enter score 1");
    double score1 = keyboard.nextDouble();
    
    System.out.println("Enter score 2");
    double score2 = keyboard.nextDouble();
    
    System.out.println("Enter score 3");
    double score3 = keyboard.nextDouble();
    /* Then calculate the average of these grades*/
    double average = (score1+score2+score3)/3;
    /*and find out what letter grade the student
     * will have:
     * A: if grade 90 - 100*/
    if(average>=90 && average<100)
      System.out.println("You got an A");
    /* D: if grade 60 - 69*/
    else if(average>=60&& average<70)
      System.out.println("You got an D");
    /* C: if grade 70 - 79*/
    else if(average>=70&& average<80)
      System.out.println("You got an C");
    /* B: if grade 80 - 89*/
    else if(average>=80 && average<90)
      System.out.println("You got an B");
    /* F: otherwise*/
    else
      System.out.println("You got an F");
  }
}