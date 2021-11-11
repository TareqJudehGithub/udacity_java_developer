package code;

public class PSet1 {
  public static void main(String[] args) {
    
    // Q3
    int bankBalance = 500;
    bankBalance += 250;
    bankBalance -= 100;
    System.out.println("\nQ3\n"+ "Bank Balance: " + bankBalance);

    // Q5
    // Declare variables;
    int day;
    String month;

    // Assign variables 'day' and 'month' values;
    day = 27;
    month = "June";

    // Q6
    // Defining variables and initializing them with values
    String firstName = "Tareq";
    String lastName = "Judeh";
    
    // Concatenate 'firstName' and lastName using new variable fullName:
    String fullName = firstName + " " + lastName;

    // Greeting sentence
    System.out.println("\nHello, man name is " + fullName+".\n"+
    "There are " + fullName.length() +" letters in my name.\n");

    //Q7

    // Declaring variable
    double fahrenheit = 68;
    double celsius = ((fahrenheit - 32) * 5) / 9;
    System.out.println("The temperature in C is: " + celsius);
  }
}
