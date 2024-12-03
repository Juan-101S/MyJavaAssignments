import java.util.Scanner;

public class Answers {
    public static void main(String[] args) {
        final int CAPACITY = 100;
        double[] scores = new double[CAPACITY];
        int currentSize = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter test score or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                System.out.println("Done with input");
                break;
            }
            if (currentSize < scores.length) {
                double value = in.nextDouble();
                scores[currentSize] = value;
                currentSize++;
            } else {
                System.out.println("Array is full.");
                System.out.println("Exiting loop.");
                break;
            }
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < currentSize; i++) {
            System.out.printf("Test Score #%03d: %0.2f%n", i, scores[i]);
        }
        System.out.println("-------------------------------------");

    }
}
