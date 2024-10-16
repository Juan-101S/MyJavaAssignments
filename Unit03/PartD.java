/* Juan
 * 1/15/24
 * This program converts a positive integer into the Roman number system
 */

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 3999: ");
        int number = in.nextInt();

        String numeral = "The Roman numeral is ";

        while (number >= 1000) {
            char thousand = 'M';
            numeral = numeral + thousand;
            number = number - 1000;
        }
        while (number >= 900) {
            String nineHundred = "CM";
            numeral = numeral + nineHundred;
            number = number - 900;
        }
        while (number >= 500) {
            char d = 'D';
            numeral = numeral + d;
            number = number - 500;
        }
        while (number >= 400) {
            String fourHundred = "CD";
            numeral = numeral + fourHundred;
            number = number - 400;
        }
        while (number >= 100) {
            char c = 'C';
            numeral = numeral + c;
            number = number - 100;
        }
        while (number >= 90) {
            String ninety = "XC";
            numeral = numeral + ninety;
            number = number - 90;
        }
        while (number >= 50) {
            char L = 'L';
            numeral = numeral + L;
            number = number - 50;

        }
        while (number >= 40) {
            String fourty = "XL";
            numeral = numeral + fourty;
            number = number - 40;
        }
        while (number >= 10) {
            char x = 'X';
            numeral = numeral + x;
            number = number - 10;
        }
        while (number >= 9) {
            String nine = "IX";
            numeral = numeral + nine;
            number = number - 9;
        }
        while (number >= 5) {
            char v = 'V';
            numeral = numeral + v;
            number = number - 5;
        }
        while (number >= 4) {
            String four = "IV";
            numeral = numeral + four;
            number = number - 4;
        }
        while (number >= 1) {
            char I = 'I';
            numeral = numeral + I;
            number = number - 1;
        }
        System.out.println(numeral);
    }
}