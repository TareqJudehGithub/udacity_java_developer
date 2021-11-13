package Package;

public class PSet2 {
  public static void main(String[] args){
   
    // Q3
    boolean canSeePlayer = true;
    boolean playerPoweredUp = false;

    if(canSeePlayer){
      if (!playerPoweredUp){
        System.out.println("\nAttack!");
      }
      else{
        System.out.println("\nRun away!");
      }
    }
    else{
      System.out.println("\nWander.");
    }

    // Q4
    //Assume these can have any value:
    boolean isSnowing = true;
    boolean isRaining = true;
    double temperature = 55.0;
    
    //TODO: print "Let’s stay home." if its raining, snowing or
    //below 50 degrees and print "Let’s go out!" otherwise.
    if (isSnowing && isRaining || (temperature < 50)) {
      System.out.println("Let's stay home.");
    }
    else {
      System.out.println("\nLet's go out!\n");
    }

    // Q6
    int dayOfTheWeek = 5;
    //TODO: declare a String variable called schedule.
    String schedule;

    switch (dayOfTheWeek){
      case 1: schedule = "Gym in the morning.";
        break;
      case 2: schedule = "Class after work.";
        break;
      case 3: schedule = "Meetings all day.";
        break;
      case 4: schedule = "Work from home.";
        break;
      case 5: schedule = "Game night after work.";
        break;   
      default:
        schedule = "Free!";
        break;
    }
    System.out.println(schedule);
  }
}
