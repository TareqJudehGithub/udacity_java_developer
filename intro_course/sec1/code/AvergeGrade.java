package code;

/**
 * Calculate the average of scores
 * @author Tareq Judeh
 */
public class AvergeGrade {
  public static void main(String[] args){
    
    // Scores
    double math = 97.5;
    double english = 98;
    double science = 83.5;
    double drama = 75;
    double music = 96;

    // Average 
    double sum = math + english + science + drama + music;
    double average = sum / 5;
    System.out.println("Average score = " + average);
  }
   
  
}
