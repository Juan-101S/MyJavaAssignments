import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[100];
        double index = 0;

        while (true) {
            System.out.print("Enter a test score or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            }
        }
        double val = in.nextDouble();

        if (index < scores.length) {
            scores[(int) index] = val;
            index++;
        } else {
            System.out.println("The array is now full. Exiting loop.");
            break;
        }
        System.out.print(scores);
    }
}