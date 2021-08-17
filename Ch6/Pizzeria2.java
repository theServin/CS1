public class Pizzeria2{
  public static void main(String [] args){
    Pizza p1 = new Pizza(false,2,"small","thin");
    Pizza p2 = new Pizza(true,6,"large","deep");
    System.out.println("Total Pizzas Create: "+Pizza.COUNTER);
    
    // store pizzas in an array
    // Reminder: <type>[] name = new <type>[capacity];
    Pizza[] pizzaBag = new Pizza[2];
    pizzaBag[0] = p1;
    pizzaBag[1] = p2;
    System.out.println(p1);
    System.out.println(p2);
    System.out.println("Total Order: $"+getPricePerBag(pizzaBag));
  }
  
  /**
   * Method that accepts an array of Pizza objects
   * and calculates the total price of the the bag of Pizzas
   * @param a an array of Pizzas
   * @return an int corresponding to the total price in the bag of pizzas
   **/
  public static double getPricePerBag(Pizza[] a){
    double price = 0;
    for(int i = 0; i < a.length; i++){
      price += (a[i].getSizePrice()+a[i].getCrustPrice());
    }
    return price;
  }
  
}