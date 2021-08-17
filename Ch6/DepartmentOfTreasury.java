public class DepartmentOfTreasury{
  public static void main(String [] args){
    // create an instance of the Dollar object, called d1
    Dollar d1 = new Dollar();
    System.out.println("Denomination before is: "+d1.getDenomination());
    d1.setDenomination(1);
    System.out.println("Denomination is: "+d1.getDenomination());
 
    System.out.println("President before is: "+d1.president);
    d1.president = "Obama";
    System.out.println("President is: "+d1.president);
    
    System.out.println("Serial before is: "+d1.serial);
    d1.serial = "whatever";
    System.out.println("Serial is: "+d1.serial);
    
    System.out.println("year before is: "+d1.year);
    d1.year = 2013;
    System.out.println("year is: "+d1.year); 
    // create an instance of the Dollar object, called d2
    Dollar d2 = new Dollar(20,"F25S568T","Jackson",1993);
    System.out.println("Denomination: "+d2.getDenomination());
    System.out.println("   President: "+d2.president);
    System.out.println("      Serial: "+d2.serial);
    System.out.println("        year: "+d2.year);
    // create an instance of the Dollar object, called d3
    Dollar d3 = new Dollar(50,"F456G987","Grant",1999);
    d3.printInfo(); 
  } 
}