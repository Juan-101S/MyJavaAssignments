/* Juan
 * 12/16/24
 * This program prompts the users for test scores:
Use an ArrayList to store the values as Double objects
If the user enters 'q' then quit inputting values
Loop through the elements in the ArrayList and print each element on a separate line with 2 decimal places of accuracy
Calculate and display the average of the scores

 */

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import java.util.ArrayList;

public class PartB {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        int numberScores = 0;
        double totalScore = 0;

        while (true) {
            System.out.print("Enter test scores here (round to the nearest hundredths place) or enter 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else {
                double score = in.nextDouble();
                scores.add(score);
                totalScore += score;
                numberScores++;
            }
        }
        System.out.println("Here are the test scores you entered: ");
        for (Double score : scores) {
            System.out.printf("%.2f%%%n", score);
        }
        if (numberScores > 0) {
            double averageScore = totalScore / numberScores;
            System.out.printf("Your average score is: %.2f%%%n", averageScore);
        } else {
            System.out.println("No scores entered.");
        }
    }
}