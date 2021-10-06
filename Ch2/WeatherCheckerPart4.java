  /**   
   *  Program Name: WeatherCheckerPart4.java
   *   Description: Program asks the user for the temperature
   *                value and uses if-else statements and boolean
   *                operators to print out recommendations.
   * Related class: String 
   *         Input: Temperature.
   *          args: N/A
   *        Output: Recommendation from program.
   *        Author: Christian Servin, Ph.D.
   *       Contact: dr.christian.servin@gmail.com
   *                Copyright 2021, Christian Servin, Ph.D.
   *                Version 1.0
   */
   import java.util.Scanner;
   public class WeatherCheckerPart4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get temperature form user
        System.out.println("Enter temperature");
        int temp = input.nextInt();
        input.close();

        // Print the correct statement
        // Hot temperatures
        if(temp >= 80 && temp <= 110)
            System.out.print("wear shorts and t-shirt");
        // Cold temperatures
        else if (temp >= 30 && temp <= 80)
            System.out.print("wear pants and jacket");
        // Extreme temperatures
        else
            System.out.print("do not go outside!");
    }
}
