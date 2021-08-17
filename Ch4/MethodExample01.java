public class MethodExample01{

    public static double f(int x){
        double result = 0.0;
        result = Math.pow(x,2) + 3;
        return result;
    }

    public static void main(String[] args) {
        int z = 2;
        double y = f(z);
        System.out.println(z+"\t\t\t"+y);
    }

}