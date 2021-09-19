import java.util.Scanner;
public class WeatherCheckerPart2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp = input.nextInt();
        if( temp >= 110)
        {
            System.out.println("do not go outside!");
        }
        else if( temp >= 80)
        {
            System.out.println("wear shorts and t-shirt");
        }
        else if( temp <= 30)
        {
            System.out.println("do not go outside!");
        }
        else
        {
            System.out.println("wear pants and jacket");
        }
    }
}