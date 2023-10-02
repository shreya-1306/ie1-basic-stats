import java.util.*;


public class MinMaxCalculation{

    // Store all collected numbers
    private static ArrayList<Double> data = new ArrayList<Double>();

    /**
     * Compute the min of an array of numbers.
     */
    public static double min_val(double ... numbers) {
        // initialise the min
        double min = numbers[0];
        // Iterate over numbers and update min val
        for (double num : numbers) {
            if( num < min){
                min = num;
            }
        }
        return min;
    }

    /**
     * Compute the max of an array of numbers.
     */
    public static double max_val(double ... numbers) {
        // initialise the max
        double max = numbers[0];
        // Iterate over numbers and update max val
        for (double num : numbers) {
            if( num > max){
                max = num;
            }
        }
        return max;
    }

}
