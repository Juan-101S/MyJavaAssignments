/* Juan
 * 12/16/24
 * This program prompts the user for a series of integer values:
Store the values in an ArrayList using the Integer wrapper class
User enters 'q' to quit inputting data
After you've acquired all the data, go through the list of numbers and remove every odd number from the ArrayList
Print out the modified list, one number per line
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;;

public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter integer values or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else {
                System.out.println("Invalid input, please try again.");
            }
            int number = in.nextInt();
            numbers.add(number);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("\nModified list (Even numbers only): ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
