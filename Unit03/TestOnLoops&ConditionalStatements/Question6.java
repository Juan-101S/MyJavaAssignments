/* Juan
 * 11/8/24
 * This program asks for three integers
 * then prints them in reverse sorted order.
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three integer. Enter your first integer here: ");
        int x = in.nextInt();
        System.out.print("Enter your second integer: ");
        int y = in.nextInt();
        System.out.print("Enter your third integer: ");
        int z = in.nextInt();
        int max;
        int middle;
        int min;
        System.out.println("Your integers in the order you typed them in are: " + x + " " + y + " " + z);
        if (x >= y && x >= z) {
            max = x;
            if (y >= z) {
                middle = y;
                min = z;
            } else {
                middle = z;
                min = y;
            }
        } else if (y >= x && y >= z) {
            max = y;
            if (x >= z) {
                middle = x;
                min = z;
            } else {
                middle = z;
                min = x;
            }
        } else {
            max = z;
            if (x >= y) {
                middle = x;
                min = y;
            } else {
                middle = y;
                min = x;
            }
        }
        System.out.println("Your numbers in reverse sorted order is: " + max + " " + middle + " " + min);
    }
}
