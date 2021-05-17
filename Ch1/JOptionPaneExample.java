/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: JOptionPaneExample                                  *
 * Description:                                                   *
 * This class demonstrates the usage of the JOptionPane Object.   *
 * In order to interact with user, the first line in your code    *
 * must be javax.swing.JOptionPane; to include the Java's library *
 * that provides the Scanner object                               *
 *****************************************************************/
import javax.swing.JOptionPane; // to use JOptionPane
public class JOptionPaneExample{
  public static void main(String [] args){
    /*  Formulat to convert Fahrenheit to celsius:
     *  C = 5/9*(F - 32)
     */ 
    // ask the user for the temperature in F
    double celsius;   // variable for celisius calculation
    double fahrenheit;// variable for the input in fahrenheit
    // let ask the user for for the temp in fahrenheit
    String input = JOptionPane.showInputDialog("Please enter temperature in fahrenheit");
    // at this point the input we have is type String, we cannot
    // perform arithmetic operations with String. We need to
    // "transform" that value into numeric value
    fahrenheit = Double.parseDouble(input);
    // C = 5/9*(F - 32) 
    celsius = (5.0/9.0)*(fahrenheit - 32);
    String message = "The Temperture you provided: "+fahrenheit+" degrees fahrenheit \ncorresponds to "+
    celsius+" degrees in celsius";    
    JOptionPane.showMessageDialog(null,message);

    
  }
}