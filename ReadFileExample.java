import java.util.Scanner;
import java.io.*;
public class ReadFileExample{
    public static void main(String [] args)throws IOException{
        Scanner input = new Scanner(new File("sample.txt"));// initialization

        while( input.hasNext() ){
            String line = input.nextLine(); // Body of the loop/ update
            System.out.println(line);
        }
    }
}