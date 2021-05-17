/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: SwitchCaseExample                                   *
 * Description:                                                   *
 * if-else will allow you to make a decision based on some input. * 
 * We must use the relational operators (==,!=, >=, <=, >, <)     *
 * to compare Strings we use: equals(), equalsIgnoreCase(),       *
 * compareTo(). For the swtich-case, we can only check: an int, a *
 * char, or a byte. The structure of the switch-case is:          *
 * switch( value ){                                               *
 *   case number:                                                 *
 *        <statement>;                                            *
 *        break;                                                  *
 * }                                                              *
 *****************************************************************/
import java.util.Scanner;
public class SwitchCaseExample{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Which Group you want to see?");
    String group_input = input.nextLine(); // here we extract the String
    // we need to extract as a character
    char group = group_input.charAt(0); // extract only the 1st character
    switch(group){
      case 'A':
      case 'a':
        System.out.println("(A) Brazil, Mexico,  Cameroon,  Croatia");
        break;
      case 'B':
      case 'b':
        System.out.println("(B) Spain,  Netherlands,  Chile,  Australia");
        break;
      case 'C':
      case 'c':
        System.out.println("(C) Colombia,  Greece,  Ivory Coast, Japan");
        break;
      case 'D':
      case 'd':
        System.out.println("(D) Uruguay, Costa Rica, England, Italy");
        break;
      default:
        System.out.println("Group '"+group+"' doesn't exists... ");
    } 
  }
}