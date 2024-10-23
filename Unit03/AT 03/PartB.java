/* Juan
 * 10/23/24
 * This program takes a ten digit telephone number (such as "6036694524")
 * and formats in an easy to read format (such as "(603) 669-4524")
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out
                .print("Enter your phone number including your area code, without any spaces or special characters: ");
        String number = in.next();

        System.out.print("(");
        System.out.print(number.substring(0, 3));
        System.out.print(")-");
        System.out.print(number.substring(3, 6));
        System.out.print("-");
        System.out.print(number.substring(6, 10));
        System.out.printf("%n---------------%n");
    }
}
