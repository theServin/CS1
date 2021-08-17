public class Pizza{
  private boolean type;
  private int ingredients;
  private String size;
  private String crust;
  public Pizza(boolean t, int i, String s, String c){
    this.type = t;
    this.ingredients = i;
    this.size = s;
    this.crust = c;
  }
  public double getSizePrice(){
    if(size.equals("small"))
      return 10.0;
    else if(size.equals("medium"))
      return 15.0;
    else if(size.equals("large"))
      return 20.0;
    else
      return -99999999;
  }
  
  public double getCrustPrice(){
    if(crust.equals("thin"))
      return 1.0;
    else if(crust.equals("middle"))
      return 2.0;
    else if(crust.equals("deep"))
      return 3.0;
    else
      return -99999999;
  }
  public double getCalories(){
    if(type== false)
      return ingredients + 100* 2*getCrustPrice();
    else
      return ingredients * 0.5*3*getCrustPrice() + Math.cos(ingredients);
  }
  
  public String toString(){
    return "A "+size+" pizza with "+ingredients
      +" ingredients and "+crust+" crust, you are just about "
      +" to enjoy... with only: "+getCalories()+" calories :-)";
  }
  
  public static void main(String [] args){
    Pizza p1 = new Pizza(true,5,"large","deep");
    Pizza p2 = new Pizza(false,1,"small","thin");
    Pizza p3 = new Pizza(true,1,"small","middle");
    System.out.println("P1 price: "+p1.getSizePrice());
    System.out.println("P2 price: "+p2.getSizePrice());
    System.out.println("P3 price: "+p3.getSizePrice());
    System.out.println(p1);
    
    Pizza[] bag = new Pizza[3];
    bag[0] = p1;
    bag[1] = p2;
    bag[2] = p3;
    
    double total = 0.0;
    for(int i =0; i < bag.length; i++)
      total += bag[i].getSizePrice();
    System.out.println("Total Price: $"+total); 
  }
}