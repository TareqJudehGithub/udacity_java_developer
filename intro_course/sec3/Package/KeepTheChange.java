
/**
 * A program that calculates money change
 */
public class KeepTheChange {
    public static void main(String[] args) {
        System.out.println("Money change = " +
                makeChange(7.5, 10.0));

    }
    public static double makeChange(double itemCost, double dollarsProvided){
        double moneyChange = dollarsProvided - itemCost;
        return  moneyChange;
    }
}
