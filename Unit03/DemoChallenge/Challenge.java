import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mostbiggest = Integer.MIN_VALUE;
        int[] numbers = new int[5];
        int index = 0;
        while (true) {
            System.out.print("Enter 5 variables or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            }
            int val = in.nextInt();

            if (index < numbers.length) {
                numbers[index] = val;
                index++;
            } else {
                System.out.println("The array is now full. Exiting loop.");
                break;
            }
            if (val > mostbiggest) {
                mostbiggest = val;
            }
        }
        System.out.println("Here are the values entered, ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i]);
            if (numbers[i] == mostbiggest) {
                System.out.println(" <-- Here is the largest value");
            } else {
                System.out.println();
            }
        }
    }
}