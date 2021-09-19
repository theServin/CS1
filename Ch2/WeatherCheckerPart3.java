import java.util.Scanner;
public class WeatherCheckerPart3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp = input.nextInt();
        // hot temperatures
        if(temp >= 80){
            if(temp >= 110)
                System.out.print("do not go outside!");
            else
                System.out.print("wear shorts and t-shirt");
        }
        // cold temperatures 
        else{
            if(temp <= 30)
                System.out.print("do not go outside!");
            else
                System.out.print("wear pants and jacket");
        }
    }
}