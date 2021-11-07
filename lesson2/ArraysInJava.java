public class ArraysInJava {
  public static void main(String[] args) {
    System.out.println("Arrays In Java\n");

  
    // Declare a new array
    int [] myNumbers = {1, 2, 3, 4, 5, 6};

    // prings the 2nd item in the array:
    System.out.println(myNumbers[1]);

    // Prints the object reference in memory
    System.out.println(myNumbers);

    // Assign the 3rd element to a new variable
    int numberThree = myNumbers[2];
    System.out.println(numberThree);

    
    // Another way to create array using new keyword:
    String [] familyMembers = new String[4];
    familyMembers[0] = "Mom";
    familyMembers[1] = "Dad";
    familyMembers[2] = "Dina";
    familyMembers[3] = "Leen";

    // iterate over familyMembers array and print out all elements:
    for (int i = 0; i < familyMembers.length; i++)
    {
      System.out.println(familyMembers[i]);
    }

    System.out.println("\n");
    // Udacity exercise 14: Arrays
    int[] numbers = {1, 2, 3, 4};
    String[] words = {"Ignition sequence start!", "Liftoff!"};
    System.out.println(words[0]);
    System.out.println(numbers[3]);
    System.out.println(numbers[2]);
    System.out.println(numbers[1]);
    System.out.println(numbers[0]);
    System.out.println(words[1]);

  }


}


/* 
 - An array is a fixed-sized data structure that is used to store multiple 
   values

*/
