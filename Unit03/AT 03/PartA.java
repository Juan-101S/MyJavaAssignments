/* Juan
 * 10/23/24
 * this program asks for user input in dollar cent format
 * then displays it in an easy to understand format
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double dollars;
        double cents;
        System.out.print("Enter your amount of money in dollar cent format (XX.xx): $");
        double money = in.nextDouble();

        dollars = (int) money;
        money = money * 100;
        cents = money - (dollars * 100);

        System.out.println("You have " + (int) dollars + " dollars and " + (int) cents + " cents");
    }
}
