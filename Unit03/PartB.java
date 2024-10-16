
/* Juan
 * 10/15/24
 * This program uses public enum for days of the week and has the same functions as PartA
 */
import java.util.Scanner;

public class PartB {
    public enum DayOfWeek {
        SUN, MON, TUE, WED, THU, FRI, SAT
    };

    public static void main(String[] args) throws Exception {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter 1 for Monday, 2 for Tuesday, etc.: ");
            int reply = in.nextInt();
            DayOfWeek today;

            System.out.print("What is your age? ");
            int age = in.nextInt();

            System.out.print("What is the cost of your meal? ");
            double cost = in.nextDouble();

            double discount = 0.0;

            if (reply == 6) {
                today = DayOfWeek.SAT;
            } else if (reply == 1) {
                today = DayOfWeek.MON;
            } else if (reply == 2) {
                today = DayOfWeek.TUE;
            } else if (reply == 3) {
                today = DayOfWeek.WED;
            } else if (reply == 4) {
                today = DayOfWeek.THU;
            } else if (reply == 5) {
                today = DayOfWeek.FRI;
            } else {
                today = DayOfWeek.SUN;
            }

            if (today == DayOfWeek.MON) {
                if (age < 13) {
                    discount = 0.075;
                } else if (age >= 50) {
                    discount = .15;
                } else {
                    discount = .05;
                }
            } else if (reply > 1) {
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
}