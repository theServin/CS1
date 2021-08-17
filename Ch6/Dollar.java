public class Dollar{
  // fields: are the characteristics that makes an object unique
  private int denomination;
  String serial;
  String president;
  int year;
  
  // costructors: responsible to intialize the fields
  // The constructor that does NOT hava any parameters
  // is called the default constructor
  public Dollar(){
    denomination = 0;
          serial = "";// null
       president = "";
            year = 0;
  }
  // customized constructor: intialize the fields by
  // providing the new value in the parameters
  public Dollar(int d, String s, String p, int y){
    denomination = d;
          serial = s;// null
       president = p;
            year = y;
  } 
  
  // method that will print the information of this dollar
  public void printInfo(){
    System.out.println("Denomination: "+denomination);
    System.out.println("   President: "+president);
    System.out.println("      Serial: "+serial);
    System.out.println("        year: "+year);
  }
  
  /***** getters/accessors *****/
  /*<encapsulation><return type> get<FieldYouWantToAccesss>()*/
  public String getSerial(){
    return serial;
  }
  public int getYear(){
    return year;
  }
  public String getPresident(){
    return president;
  }
  public int getDenomination(){
    return denomination;
  }
  /***** setters/mutators *****/
  /*<encapsulation>void set<FieldYouWantToAccesss>(<type><id>)*/
  
  public void setDenomination(int d){
    
    denomination = d;
  }
}