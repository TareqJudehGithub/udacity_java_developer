package Package;

/**
 * Self-Driving car program - Lesson 2: Control Flow
 * @author Tareq Judeh
 * 
 */
class TrafficLight {
  public static void main(String[] args){

    // Declare a boolean variable and initialize it a value
    boolean isLightGreen = false;
    boolean isLightYellow = true;

    if (isLightGreen) {
      // Traffic light is green
      System.out.println("Drive!");
    }
    else if (isLightYellow){
      System.out.println("Slow down!");
    }
    else {
      // Traffic light is red
      System.out.println("Stop!");
    }
  }
}