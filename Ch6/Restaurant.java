public class Restaurant{
  public static void main(String [] args){
    System.out.println("Welcome to Servini's Kitchen...");
    System.out.println("Currently I have sold: "+Food.counter+" foods");
    Food f1 = new Food("Mexican",2,10,true,"04/29/2014");
    Food f2 = new Food();    
    Food f3 = new Food();    
    Food f4 = new Food();    
    Food f5 = new Food();    
    Food f6 = new Food();    
//f1.printInfo();
    System.out.println("Currently I have sold: "+Food.counter+" foods");
    
  }
}