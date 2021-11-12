package Package;
/**
 * Art Museum problem
 */
public class ArtMuseum {
  public static void main(String[] args){
    
    int ticket = 10;
    int discount = 5;
    int age = 46;
    boolean isStudent = true;

    if (age <= 15){
      ticket -= discount;
      System.out.println("\nTicket price = " + ticket + "\n");
    }
    else if (age > 60){
       ticket -= discount;
      System.out.println("\nTicket price = " + ticket + "\n");
    }
    else if (isStudent){
       ticket -= discount;
       System.out.println("\nTicket price = " + ticket + "\n");
    }
    else {
      System.out.println("\nTicket price = " + ticket + "\n");
    }

  }
}
