import java.util.Scanner;
public class OddsAndEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int[] a = new int[total];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        if(isArrayEven(a, a.length)){
            System.out.println("All even numbers");
        }
        else if(isArrayOdd(a,a.length)){
            System.out.println("All odd numbers");
        }
        else{
            System.out.println("not even or odd");
        }

    }
    public static boolean isArrayEven(int[] a, int size){
        boolean ans = true;
        for (int i = 0; i < size; i++) {
            if(a[i]%2 != 0){
                return false;
            }
        }
        return ans;
    }
    public static boolean isArrayOdd(int[] a, int size){
        boolean ans = true;
        for (int i = 0; i < size; i++) {
            if(a[i]%2 == 0){
                return false;
            }
        }
        return ans;
    }


}   