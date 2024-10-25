/* Juan
 * 10/25/24
 * This program uses a for loop to calculate how much money a customer earns over five years
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double interest = 0;

        System.out.print("Enter your APR as a percentage: %");
        double APR = in.nextDouble();
        APR = APR / 100;

        System.out.print("Enter your intial balance: $");
        double initalBalance = in.nextDouble();

        System.out.println(" Year |         INT Earned ($)         |          Balance ($)          ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("      |                                |                               ");

        for (int year = 1; year <= 5; year++) {
            interest = initalBalance * APR;
            initalBalance += interest;
            System.out.printf("   %d              %8.2f                     %8.2f          %n", year, interest,
                    initalBalance);
        }
    }
}
