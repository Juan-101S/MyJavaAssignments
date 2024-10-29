/* Juan
 * 10/28/24
 * This program calculates test averages
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter all your test scores. When you are done enter a negative number to get the average");
        double newScore;
        double scoreTotal = 0;
        int numTest = 0;
        double average;

        do {
            System.out.println("Begin entering your scores: ");
            newScore = in.nextDouble();
            if (newScore <= 1) {
                break;
            }
            numTest = numTest + 1;
            scoreTotal = scoreTotal + newScore;
        } while (newScore >= 0);
        average = scoreTotal / numTest;
        System.out.println("Your average is " + average);
    }
}