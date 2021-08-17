import java.util.Scanner;
public class MethodExampleStrings1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        String s1 = input.nextLine();
        System.out.println("Enter a value");
        String s2 = input.nextLine();
        System.out.println("Enter the character");
        char c = input.nextLine().charAt(0);
        System.out.println("How many times? "+howManyTimes(s1,s2,c));
    }
    public static int howManyTimes(String s1, String s2, char c){
        int counter = 0;
        String s3 = s1+s2;
        for (int i = 0; i < s3.length(); i++) {
            if(s3.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }

}