
/* Juan
 * 12/11/24
 * This program has a method that takes a variable number of double values as its argument.  The method then calculates and returns the average of these parameters as a double value.
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double average1 = average(10, 8, 10);
        System.out.println("Average 1: " + average1);

        double[] scores = { 100, 90, 80, 100, 80 };
        double average2 = average(scores);
        System.out.println("Average 2: " + average2);
    }

    public static double average(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
