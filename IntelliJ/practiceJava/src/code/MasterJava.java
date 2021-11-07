package code;

/**
 * This is a general coding practice
 * @author Tareq Judeh
 */
public class MasterJava {
    public static void main(String[] args){
        System.out.println("Practice Area\n");

        System.out.println(MasterJava.greetUser("John Smith!\n"));
        System.out.println("10 + 15 = " + MasterJava.addition(10, 15) +"\n");
        System.out.println("The factorial = " + MasterJava.factorial(5));

        // Initialize new scores array:
        float[] score = new float[5];
        score[0] = 85;
        score[1] = 92;
        score[2] = 90;
        score[3] = 88;
        score[4] = 93;

        // Call avgScore to compute the average of marks in score Array
        System.out.println("The average score is: " + MasterJava.avgScore(score));

    }

    /**
     * A method to greet users.
     * @param username The username you wish to greet.
     * @return Returns a greet with user name included.
     */
    public static String greetUser(String username){
        return "Hello, " + username;
    }

    /**
     * A method to find the sum of two int numbers.
     * @param num1 The first int number.
     * @param num2 The second int number.
     * @return Returns the sum of the two int numbers.
     */
    private static int addition(int num1, int num2){
        return num1 + num2;
    }

    /**
     * A method to calculate the factorial of a given int.
     * @param num int number to calculate factorial for.
     * @return Returns the factorial value for int num.
     */
    public static int factorial(int num){
        int fact = 1;
        if (num == 1) {
            return 1;
        }
        // iterate over num descending until we reach 1, multiplying each elem with the
        // product of fact variable.
        for (int i = num; i >= 1; i--){
            fact *= i;
        }
        return fact;
    }

    /**
     * This method calculates the average score.
     * @param scores Array of float numbers
     * @return divides the sum over total numbers count in the array.
     */
    public static float avgScore( float[] scores) {
        float total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        float average = total / scores.length;
        return average;
    }
}
