/* Juan
 * 12/16/24
 * This program uses an ArrayList of Integer values to keep track of temperatures:
Scan in temperatures from user until they enter a 'q' to quit
Determine what the lowest temperature is for the set of data
Print each temperature on a separate line and mark each instance of the lowest temperature with "<= lowest"
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> temperatures = new ArrayList<Integer>();
        int lowestTemp = 0;

        while (true) {
            System.out.print("Enter temperatures here or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else {
                int temp = in.nextInt();
                temperatures.add(temp);
                int size = temperatures.size();
                if (size == 1) {
                    lowestTemp = temperatures.get(0);
                } else if (temperatures.get(size - 1) < lowestTemp) {
                    lowestTemp = temperatures.get(size - 1);
                }
            }
        }
        System.out.println("Temperatures that you entered:");
        for (int temp : temperatures) {
            System.out.print(temp);
            if (temp == lowestTemp) {
                System.out.print(" <-- lowest temperature");
            }
            System.out.println();
        }
        System.out.println("Lowest Temperature: " + lowestTemp);

    }
}
