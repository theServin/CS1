import java.util.Scanner;
public class WeatherCheckerPart4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp = input.nextInt();
        // hot temperatures
        if(temp >= 80 && temp <= 110)
            System.out.print("wear shorts and t-shirt");
        else if (temp >= 30 && temp <= 80)
            System.out.print("wear pants and jacket");
        else
            System.out.print("do not go outside!");
    }
}