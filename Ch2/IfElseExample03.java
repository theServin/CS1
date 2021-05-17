/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: IfElseExample03                                     *
 * Description:                                                   *
 * Write a program that asks the user to enter 3 grades. Then cal-*
 * -culate the avg of these grades and find out final grade       *
 * A: if grade 90 - 100                                           *
 * B: if grade 80 - 89                                            *
 * C: if grade 70 - 79                                            *
 * D: if grade 60 - 69                                            *
 * F: otherwise                                                   *
 *****************************************************************/
import java.util.Scanner;
public class IfElseExample03{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);// ask user 3 grades
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
    if(average>=90)
      System.out.println("You got an A");
    /* B: if grade 80 - 89*/
    else if(average>=80)
      System.out.println("You got an B");
    /* C: if grade 70 - 79*/
    else if(average>=70)
      System.out.println("You got an C");
    /* D: if grade 60 - 69*/
    else if(average>=60)
      System.out.println("You got an D");
    /* F: otherwise*/
    else
      System.out.println("You got an F");
  }
}