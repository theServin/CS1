public class Food{
  // static field members
  static int counter;
  // fields 
  private String type;        // mexican, italian, japanese
  private int quantity;       // [0-5]
  private int spicyLevel;     // [1-10] 1 non spicy 10 spicy
  private boolean temperature;// true (hot)/false(cold)
  private String expDate;     // MM/dd/yyyy
  
  public Food(){
    type = "";
    quantity = 0;
    spicyLevel = 0;
    temperature = false;
    expDate = "";
    counter++; // ADD my instance counter
  }
  
  public Food(String t, int quantity, int spicyLevel, 
              boolean temperature, String exp){
    type = t;
    this.quantity = quantity;
    this.spicyLevel = spicyLevel;
    this.temperature = temperature;
    this.expDate = exp;
    counter++; // ADD my instance counter
  }
  public void printInfo(){
    System.out.println("You are eating "+quantity+" plate of "+
                     type+" food. By the way this is so "+
                     getSpicyLevelInfo()+". Your plate is currently "+
                     getTemperatureInfo()+"... You have until "+expDate+" to eat it");
  }
  /**
   * if 0 - 3: not spicy 
   * if 4 - 6: mild
   * if 7 - 9: hot
   * if 10: devils recipe
   **/
  public String getSpicyLevelInfo(){
    String answer = "";
    if(spicyLevel>= 0 && spicyLevel<=3){
      answer = "not spicy";
    }
    else if(spicyLevel>= 4 && spicyLevel<=6){
      answer = "mild";
    }
    else if(spicyLevel>= 7 && spicyLevel<=9){
      answer = "hot";
    }
    else{
      answer = "devils recipe";
    }
    return answer;
  }
  
  public String getTemperatureInfo(){
//    if(temperature == true)
//      return "hot";
//    else
//      return "cold";
    return temperature == true ? "hot" : "cold";
  }
  /**
   * define getters
   **/
  
  /**
   * define setters
   **/
  
  /**
   * getMonthOfExpiration()
   * This method will return the month (in words)
   * when this Food expires. E.g., if month is 6,
   * this will return "June"
   * @return a String representing the month of expiration
   * based on the number of the month
   **/
  
  /**
   * getAgeofFood
   * This method will return the total age of this 
   * food object
   * @return an int corresponding to the age of this product
   **/
  
}