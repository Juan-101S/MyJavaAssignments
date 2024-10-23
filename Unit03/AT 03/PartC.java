/* Juan
 * 10/23/24
 * This program checks to see if the inputted number is a prime number or not
 */

import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter any integer you want: ");
        int number = in.nextInt();
        int i = 2;

        if (number <= 1) {
            System.out.println("Your number is not a prime number");
        }
        if (number >= 2) {
            if (number % i == 0) {
                System.out.println("Your number is not a prime number");
            }
            if (number % i == 1) {
                System.out.println("Your number is a prime number");
            }
        }
    }
}