public class TwoDimensionalArrayExample01{
    public static void main(String[] args) {
        //<data_type>[][] <id> = new <data_type>[row][col];
        int[][] a = {{5, 7, 13, -1},{1, 224,18},{9, 14}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t"); 
            }
            System.out.println();
        } 
    
              
    }
}