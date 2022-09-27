import java.util.*;
import java.io.*;
public class WriteFileExample{
    public static void main(String [] args)throws IOException{
        File output = new File("output.html");
        PrintWriter pr = new PrintWriter(output);
        pr.println("<html><p>hello guys!</p> <h1>Java Class</h1></html>");
        pr.close();
    }

}