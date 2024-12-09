/* Juan
 * 12/9/24
 * This program asks the user to enter up to 20 integer values or 'q' to quit.  Store the values in a partially filled array.  Print the values of the partially filled array on a single line, separated by commas, for the user.  Prompt the user for a single integer value.  Count how many times the target integer value occurs in the original set of input data.
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxValues = 20;

        int[] values = new int[maxValues];
        int size = 0;

        while (size < maxValues) {
            System.out.print("Enter an integer or 'q' to quit (You can only enter up to 20 integers): ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else {
                values[size] = in.nextInt();
                size++;
            }
        }
        System.out.print("Values entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i]);
            if (i < size - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.print("Enter a target integer value: ");
        int targetValue = in.nextInt();
        int numTargetVal = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] == targetValue) {
                numTargetVal++;
            }
        }

        System.out.printf("The target value %d occurs %d times in your original data set.%n", targetValue,
                numTargetVal);
    }
}