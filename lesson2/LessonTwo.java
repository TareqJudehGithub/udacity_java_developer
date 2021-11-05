public class LessonTwo {
  public static void main(String[] args) {
    System.out.println("Hello, world!\n");
    
    // Declare variables:
    int someValue;

    // Assign variables a value:
    someValue = 10;

    //Initialization: creating a variable and assigning it a value at the same 
    // time.
    // initialization example:
    int number = 17;

    int age = 46;

    // Cast age variable data type to float:
    float floatAge = age;

    System.out.println(floatAge + "\n");

    String user = "john smith";

    // Concatenation:
    System.out.println("Hello, " + user + "!\n");

    // Cast(convert) double to int (large data type to a smaller one):
    double decimalNumber = 5.7;
    int intNumber = (int)decimalNumber;

    System.out.println(intNumber + "\n");


    // Declare an array:
    int[] new_Array;

    // Initialize my_array with the size of 4 index:
    int[] my_Array = new int[4];

    // Assign values to the array
    my_Array[0] = 1;
    my_Array[1] = 2;
    my_Array[2] = 3;
    my_Array[3] = 4;

  }
  
}