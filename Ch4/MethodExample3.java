/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: MethodExample3                                      *
 * Description:                                                   *
 * Program that asks the user to enter n number of grades.        *
 * Then calculate the avg of the grades and provide the letter    *
 * grade that corresponds to the average.                         *
 ******************************************************************/
import java.util.Scanner;
public class MethodExample3{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the total grades to process");
    int total = input.nextInt();
    
    int counter = 0;
    double acc = 0.0; // need an accumulator to keep track of the scores
    while(counter < total){
      System.out.println("Please enter score #"+(counter+1));
      acc = acc + input.nextDouble();
      counter++;
    }
    double avg = calculateAverage(acc,total);
    String letter = getLetterGrade(avg);
    System.out.println("You got: "+letter);
  }


  /**
   * calculateAverage
   * This method will take the sum of the values
   * that corresponds to the grades
   * AND will take the n number of elements 
   * @param sum : correponds to the sum of the grades
   * @param n: the total number of grades
   * @return a double corresponding to the average of the grades
   **/
  public static double calculateAverage(double sum, int n){
    double answer = 0.0;
    answer = sum/n;
    return answer;
  }


  /**
   * getLetterGrade()
   * This method will take a double value corresponding
   * to the grade and will return a grade corresponding to
   * the average is provided
   * @param : average of the grades
   * @return will give back a String corresponding to 
   * the letter grade
   **/
  public static String getLetterGrade(double avg){
    String letter = "";
    if(avg >= 90.0 && avg <= 100.0){
      letter = "A";
    }
    else if(avg >= 80 && avg < 90){
      letter = "B";
    }
    else if(avg >= 70 && avg < 79){
      letter = "C";
    }
    else if(avg >= 60 && avg < 69){
      letter = "D";
    }
    else{
      letter = "F";
    }
    return letter;
  }
}