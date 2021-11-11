package code;

/**
 * Bus
 * @author Tareq Judeh
 */
public class Bus {
  public static void main(String[] args){
    System.out.println("Let's practice Java!\n");

    // Bus game
    // Declare a passengers variable
    int passengers;

    // Initialize a variable:
    passengers = 0;

    // Update passengers value
    passengers = passengers + 5;
    passengers = passengers - 3;
    passengers = passengers - 1 + 5;

    // Print current passengers in the buss
    System.out.println("Number of passengers: " + passengers);

    // Declare a bus driver name string
    String driver;

    // Initialize driver variable with a string literal.
    driver = "Hamish";

    // Count how many characters in variable driver;
    int letters =  driver.length();
    System.out.println(letters);

    // Update driver name in uppercase
    driver = driver.toUpperCase();
    System.out.println(driver);

  }  
}
