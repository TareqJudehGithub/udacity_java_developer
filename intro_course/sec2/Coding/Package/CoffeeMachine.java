package Package;

/**
 * Coffee Machine program, that displays type of drink based on code
 * a user enters.
 * @author Tareq Judeh
 */
public class CoffeeMachine {
  public static void main(String[] args){
    
    // Drink code users enter
    int passcode = 0;
    String coffeType;
    // Switch statement to determine user's drink
    switch(passcode){
      case 555:
        coffeType = "Espresso";
        break;
      
      case 312:
        coffeType = "Vanilla Latte";
        break;

      case 629:
        coffeType ="Drip Coffee";
        break;

      default:
        coffeType = "American";
        break;
    }
    System.out.println("\nYour drink is: " + coffeType + ".\nThank you!\n");  
  }
  
}
