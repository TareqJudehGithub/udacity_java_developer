public class Methods {

  // Method 
  public static double findTheArea(double length, double width) {
    double area = length * width;
    return area;
  }

  // Method
  public static int multiplyNumbers(int num1, int num2) {
    int product = num1 * num2;
    return product;
  }

  // Main function
  public static void main(String[] args) {
    System.out.println("\n");
  
  // Calling/invoking findTheArea as a class object
  System.out.println("Area = " +  
  Methods.findTheArea(5.5, 4.5));

  // Calling multiplyNumbers method from the main class
  System.out.println("Product = " + 
  Methods.multiplyNumbers(7, 7));

  }
}
  /* 

  Methods in Java
    - Name:  findTheArea
    - Parameters: (double length, double width)
    - Method Body:  double area = length * width;
                    return area;
    - Return Type: double
  
  Function vs Method
   - Function:  
    - Reusable/Callable block of code. Like our findTheArea above.
    - Functions can be executed from anywhere.

   - Method: 
      - Associated with a class or object.
      - Reusable/Callable block of code.
   
   * All functions are methods, but not all methods are functions.

  */
