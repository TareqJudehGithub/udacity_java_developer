class Loops {
  public static void main(String[] args) {
    System.out.println("while loop\n");

    int i = 0;
    while (i < 3) {
      System.out.println("Hello, world!");
      i++;
    }
    System.out.println("while loop is now completed.\n");

    System.out.println("for loop\n");  

    // problem iterate over an array (which we will create below) using
    // for loop

    // 1. Initialize a new array and assign values to it
    String[] cars = new String[3];
    cars[0] = "BMW";
    cars[1] = "GMC";
    cars[2] = "Mercedes";

    // 2. Iterate over all array elements using for loop
    for (int x = 0; x < cars.length; x++) {
      System.out.println(cars[x]);
    }
    System.out.println("for loop is now completed.\n");  

    System.out.println("do while loop.\n");
  }
  
}

/* 
 Loops
  
 while loop
  The while loop continuously executes as long as a given condition is True.
  
      while(condition){
        Execution block
      }
 
 for loop

        for(initialization; condition; increment or decrement){
            Execution block
        }
  
  do while loop
   - Runs the execution block first, and then evaluate the condition if it 
     should continue to iterate.
        do {
          Execution block
        } 
        while(condition);
   - The do while loop is very similar to the while loop. The key distinction 
      is that the do while loop runs the loop once first before it checks the 
      condition.

  All three types of loops have the same main components:
    - initialization
    - condition
    - execution body
    - increment/decrement

*/