/* Juan
 * 1/23/25
 * This is a sample program that asks the user to enter quiz scores ranging from 0 to 100
Scan in the quiz score as an integer value.  
Pass an input Scanner as an argument to your method
If the user does not provide a value in the allowed range, throw an ArithmeticException.
Write a sample program that demonstrates how your method works and that uses a try-catch statement to check whether or not a valid quiz score was obtained.
 */

import java.util.Scanner;

public class PartA {
    public static int getQuizScore(Scanner in) {
        int score = in.nextInt();

        if (score < 0 || score > 100) {
            throw new ArithmeticException("Invalid score. Must be between 0 and 100.");
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int score = getQuizScore(scanner);
            System.out.println("You entered a valid score: " + score);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}