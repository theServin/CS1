/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: MethodExampleExercise                               *
 * Description:                                                   *
 * Program demonstrates three usful methods                       *
 *****************************************************************/
public class MethodExampleExercise{  
  public static void main(String [] args){
    
  }
  /**
   * counter
   * This method will take a String and 
   * a character as parameters. The method 
   * will return the total number of occurences
   * that the character appeared in the String.
   * @param s: is a String 
   * @param c: is a character
   * @return an int correposponding to the total
   * occurences of c in s.
   */
   public static counter(String s, char c){
       int counter = 0;
       for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == c)
              counter++;
       }
       return counter;
   }
  /**
   * getValueAtPosition
   * This method will take a String and an int.
   * and return the character that correponds to
   * the given position in the String
   * @param s: a String
   * @param p: an int
   * @return the character that is at position p 
   * from the String s, an '' in case invalid p
   **/
   public static char getValueAtPosition(String s, int p){
      if(p<0 || p >p.length())
         return '';
      else
         return s.charAt(p-1);
   }
  /**
   * getAge
   * Write a method named getAge
   * This method will take the year of a person and
   * return the age
   * @param year: int
   * @return an int correspodning to the age of the person
   */
   public static int getAge(int year){
       return 2014 - year;
   }
}