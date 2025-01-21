import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        System.out.println("Enter quiz scores as double values. Type 'q' to quit.");

        while (true) {
            System.out.print("Enter quiz scores or 'q' to quit: ");
            String in = scanner.nextLine();

            if (in.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double score = Double.parseDouble(in);
                scores.add(score);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to quit: ");
            }
        }
        System.out.println("\nQuiz Scores:");
        for (double score : scores) {
            System.out.printf("%.2f\n", score);
        }
        if (!scores.isEmpty()) {
            double total = 0;
            double highest = scores.get(0);
            double lowest = scores.get(0);

            for (double score : scores) {
                total += score;
                if (score > highest)
                    highest = score;
                if (score < lowest)
                    lowest = score;
            }
            double average = total / scores.size();

            System.out.printf("Total: %.2f\n", total);
            System.out.printf("Average: %.2f\n", average);
            System.out.printf("Highest: %.2f\n", highest);
            System.out.printf("Loewst: %.2f\n", lowest);
        } else {
            System.out.println("\nNo scores entered.");
        }
        scanner.close();
    }
}
