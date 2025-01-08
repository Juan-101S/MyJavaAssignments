/* Juan
 * 12/8/24
 * This program opens this file called "quizzes.txt" for reading:
Open the file for reading
Open another file called "quizzesMod.txt" for writing
Read in the double values
Write each formatted value to the output file on a separate line as shown below
Calculate the average value of the quiz scores
Record the average value at the end of the file
Close both files when done
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Double> scores = new ArrayList<>();
        double total = 0;

        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("quizzesOut.txt");

        while (in.hasNextDouble()) {
            double score = in.nextDouble();
            scores.add(score);
            total += score;
        }
        for (int i = 0; i < scores.size(); i++) {
            String formattedScore = String.format("Quiz %03d: %.2f", i, scores.get(i));
            out.println(formattedScore);
        }
        double average = total / scores.size();
        out.println("----------------");
        out.printf("Average:   %6.2f", average);

        in.close();
        out.close();
        System.out.println("Processing completed successfully.");
    }
}
