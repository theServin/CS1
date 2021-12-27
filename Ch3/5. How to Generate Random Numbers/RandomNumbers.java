import java.util.Random;
public class RandomNumbers{
        public static void main(String [] args){
            Random rand = new Random();
            int r = rand.nextInt(11);
            System.out.println(r);
 
        }
    }