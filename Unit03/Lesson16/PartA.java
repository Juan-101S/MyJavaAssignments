
/* Juan
 * 12/11/24
 * This program uses a partially filled array of doubles to record quiz scores:
Scan in quiz scores from the user until the user enters 'q' to quit
Print the quiz scores in a neat manner for the user to review
Ask the user if they would like to drop the lowest score (type 'y' to do so)
If the user wants to drop the lowest score, do the following
Use a method to drop the lowest score from the array of doubles
The array should be passed to the method as an argument
If there is more than one quiz with the same lowest score, only drop the first instance of the score
Preserve the order of the remaining test scores as you drop the lowest score
After dropping the lowest score, reprint the scores array
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] scores = new double[100];
        int count = 0;

        while (true) {
            System.out.print("Enter quiz scores and type 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else {
                scores[count] = in.nextInt();
                count++;
            }
        }

        double lowest = scores[0];
        System.out.print("Values entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(scores[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        System.out.println();
        System.out.printf("lowest value is %.2f%n", lowest);
        System.out.print("Would you like to drop your lowest score? If so, type 'y'. ");
        if (in.hasNext("y") || in.hasNext("Y")) {
            in.next();
            count = dropLowestScore(scores, count, lowest);
            System.out.print("Quiz scores after dropping the lowest score: ");
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i]);
                if (i < count - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    private static int dropLowestScore(double[] scores, int count, double lowest) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (Math.abs(lowest - scores[i]) < 0.00000001) {
                index = 1;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index + 1; i < count; i++) {
                scores[i - 1] = scores[i];
            }
        }
        count = count - 1;
        return count;
    }
}