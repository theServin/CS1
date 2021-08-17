import java.util.Scanner;
public class MethodExampleLeibnz{
    public static void main(String[] args) {
        System.out.println("N\t\t\t PI");  
        for (int i = 1000; i <= 10000; i+=1000) {
            System.out.println(i+"\t\t\t"+getLeibniz(i));            
        }
        System.out.println("Java PI: "+Math.PI);

    }
    public static double getLeibniz(int n){
        double pi = 0.0;
        for (int k = 0; k <= n; k++) {
            pi += (4 * getNumerator(k))/getDenominator(k);
        }
        return pi;
    }

    public static double getNumerator(int k){
        double num = 0.0;
        num = Math.pow(-1, k);
        return num;
    }
    public static int getDenominator(int k){
        int num = 0;
        num = ((2 * k) + 1);
        return num;
    }

}