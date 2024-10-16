/* Juan
 * 10/15/24
 * This program calculates a discounted cost using a set of rules
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is it Monday? (true/false) ");
        boolean Monday = input.nextBoolean();

        System.out.print("Is it Tuesday? (true/false) ");
        boolean Tuesday = input.nextBoolean();

        System.out.print("What is your age? ");
        int age = input.nextInt();

        System.out.print("What is the cost of your meal? ");
        double cost = input.nextDouble();

        double discount = 0.0;

        if (Monday) {
            if (age < 13) {
                discount = 0.075;
            } else if (age >= 50) {
                discount = .15;
            } else {
                discount = .05;
            }
        } else if (Tuesday) {
            discount = 0.0;
        } else {
            if (age < 13) {
                discount = .05;
            } else if (age >= 50) {
                discount = .075;
            }
        }

        double addediscount = cost - (cost * discount);
        System.out.println("The cost of your meal is $" + addediscount);

    }
}