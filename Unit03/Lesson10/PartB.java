/* Juan
 * 11/3/24
 * This is a fixed program of a compile time error
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        double discount = 0.0;
        if (num > 12) {
            discount = 0.10;
        } else if (num > 6) {
            discount = 0.05;
        }
        System.out.println("Discount = " + discount);
    }
}
