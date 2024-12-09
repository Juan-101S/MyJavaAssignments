/* Juan
 * 12/9/24
 * This program uses a partially filled array to scan in integer values from the user.
The array should store a maximum of 10 values.
The user should type in 'q' to quit entering data. 
After data has been entered, print the elements on a single line that starts and ends with an asterisk ('*') and with each element separated by an asterisk.
Sort the data, and then print the elements in reverse numerical order, separating values with a comma (',').
 */

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        final int size = 10;
        int[] values = new int[size];

        int numOfValues = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer or press 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else if (numOfValues < values.length) {
                values[numOfValues] = in.nextInt();
                numOfValues = numOfValues + 1;
            } else {
                System.out.println("There is no more space. Cannot input more integers.");
                break;
            }
        }

        System.out.print("*");
        for (int i = 0; i < numOfValues; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

        Arrays.sort(values, 0, numOfValues);
        for (int i = 0; i < numOfValues / 2; i++) {
            int reverse = values[i];
            values[i] = values[numOfValues - 1 - i];
            values[numOfValues - 1 - i] = reverse;
        }
        for (int i = 0; i < numOfValues; i++) {
            if (i == numOfValues - 1) {
                System.out.println(values[i]);
            } else {
                System.out.println(values[i] + ",");
            }
        }
    }
}