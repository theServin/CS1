/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: WriteFileExample                                    *
 * Description:                                                   *
 * This program demonstrates how to write a file, in particular   *
 * we write an HTML file with a header and a body.                *
 *****************************************************************/
import java.io.*;
import java.util.*;
public class WriteFileExample{
  public static void main(String [] args)throws IOException{
    // to write a file we need:
    PrintWriter pw = new PrintWriter("epcc.html");
    // to write on each line
    pw.println("<!DOCTYPE html>");
    pw.println("<html>");
    pw.println("<body>");
    pw.println("<h1> EPCC Website</h1>");
    pw.println("<p>Hi <i>Guys</i> from <b>Java</b>!</p>");
    pw.println("</body>");
    pw.println("</html>");
    // when you are done writing, close the file
    pw.close();
  }
}