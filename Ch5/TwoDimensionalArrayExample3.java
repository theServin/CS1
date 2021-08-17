/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: TwoDimensionalArrayExample3                         *
 * Description:                                                   *
 * This program demonstrates how to read a file that contains     *
 * matrix information (i.e., 2D array). The program will read     *
 * the rows and columns and after that will continue reading the  *
 * file information and store it into the matrix                  * 
 *****************************************************************/
import java.util.Scanner;
import java.io.*;
public class TwoDimensionalArrayExample3{
  public static void main(String [] args) throws IOException{
    // write a program that reads a file an stores information into
    // an array of Strings
    /*
     * 1. Read File
     */
    File myFile = new File("input2.txt");
    Scanner scan = new Scanner( myFile );
    /*
     *    1.1 read first line of the file
     *      1.1.a store the value for the 1st line into row
     */
    int row = Integer.parseInt(scan.nextLine());
    /*
     *    1.2 read second line of code
     *      1.2.a store the value for the 1st line into col
     */
    int col = Integer.parseInt(scan.nextLine());
    /*
     * 2. Crate a 2D array of Strings
     *    2.1 use row variable to define the rows
     *    2.2 use col variable to define the cols
     */
    String [][] array = new String[row][col];
    /*
     * 3. For each of the remanining lines:
     *    4.1 read the next line
     */
    String line = scan.nextLine();
    /*
     *    4.2 split the line by space and store the results into array
     */
      String [] tokens = line.split(" ");
    /*
     *    4.3 store the tokens into position
     */
    array[0][0] = tokens[0];
    array[0][1] = tokens[1];
    array[0][2] = tokens[2];
    System.out.println(array[1][0]);
  }
}