/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: ReadExample02                                       *
 * Description:                                                   *
 * This program will read a file named: numbers.txt               *
 * Each line in numbers.txt contains a number. Calculates the     *
 * addition of all the lines from the file, and then prints the   *
 * total sum.                                                     *
 * Hint: nextLine() will read the next line in file               *
 *       nextInt() will read the next int in the line             *
 *****************************************************************/
import java.util.Scanner;
import java.io.*;
public class ReadExample02{
  public static void main(String [] args)throws IOException{
    // create the Scanner that will hold the file
    Scanner fr = new Scanner(new File("numbers.txt"));
    // we need to create an accumulator to keep track of sum
    double sum = 0;
    //let us start reading the file...
    while(fr.hasNext())
    {
      double x = fr.nextDouble(); // extract the int for each line
      sum = sum + x; // add the value x to the current sum
      System.out.println(" --"+sum);
    }
    System.out.println("The total is: "+sum);
  }
}    