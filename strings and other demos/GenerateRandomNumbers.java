public class GenerateRandomNumbers{
    public static void main(String[] args) {
        // try{
            for (int i = 100; i < 100000; i+=150) {
                System.out.println("N = "+i);
                gR(i, 250, 0); 
                System.out.println();
            }
        // }
        // catch(IllegalStateException e){
        //     System.out.println(e);
        // }
    }
    public static void gR(int n, int min, int max) throws IllegalStateException{
        if(max < min){
            throw new IllegalStateException("Invalid Parameters!");
        }
        // int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int r = (int)(Math.random() * (max - min + 1) + min );
            System.out.print(r+" ");
        }        
        // return a;
    }
    
}