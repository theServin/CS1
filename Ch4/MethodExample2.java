/************ El Paso Community College - COSC 1436 ***************
 * Author: Christian Servin                                       *
 * File Name: MethodExample2                                      *
 * Description:                                                   *
 * Program constructs a story based on the input of the user,     *
 * Uses the method getPronoun() to determine the pronoun for the  *
 * user in case is male/female                                    *
 ******************************************************************/
import java.io.*; // IO File reading
import java.util.Scanner;
public class MethodExample2{
  public static void main(String [] args) throws IOException{
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = input.nextLine();
    
    System.out.println("What did you do in Spring break?");
    String activity = input.nextLine();
    
    System.out.println("What is your gender?");
    String gender = input.nextLine();
    
    System.out.println("How old are you?");
    int age = input.nextInt();
    input.nextLine(); // "flushes" the buffer that is holding info
    
    System.out.println("Please enter the name of the report file");
    String outputfile = input.nextLine();
    // to write into a file, you must create a PrintWriter object
    PrintWriter output = new PrintWriter(new File(outputfile));
    
    String story = name+" was on "+getPronoun(gender)+" way to "+
      "school this morning, and "+getPronoun(gender)+" was stoped by "+
      "a cop... The cop approached to "+name+" and ask for "+
      getPronoun(gender)+" age. "+name+" answered "+age+". "+
      "The cop asked what "+getPronoun(gender)+" doing, then "+
      name+" said: "+activity+". Then the cop thought it was cool"+
      "so let "+getPronoun(gender)+" go.";

    // this statement will write into the file the story
    output.println(story);

    // make sure before you leave to close the file
    output.close(); 
  }

  /**
   * getPronoun
   * method checks the gender provided in the parameter gender, 
   * and based on the gender will return a pronoun
   *@param gender a String representing the  geneder
   *@return a String based on the gender provided
   */
  public static String getPronoun(String gender){
    String answer = "";
    if(gender.equalsIgnoreCase("male"))
      answer = "his";
    else
      answer = "her";
    return answer;
  }
}