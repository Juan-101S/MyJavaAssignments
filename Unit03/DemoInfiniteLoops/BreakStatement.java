
import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number or 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                break;
            } else {
                if (input.hasNextDouble()) {
                    total = total + input.nextDouble();
                }
            }
        }
    }
}
