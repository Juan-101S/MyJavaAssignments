/* Juan
 * 1/28/25
 * This program Use the counter class that we developed during the lecture and write a sample program that keeps track of how many people like cake versus how many people like pie for dessert:
Create one counter per dessert to track the responses
Prompt the user for input through the keyboard
The user enters a 'c' for cake
The user enters a 'p' for pie
The user enters a 'q' to quit
After the user quits entering data, display the total votes for cake and the total votes for pie
 */

import java.util.Scanner;

class Counter {
    private int count;

    public int getValue() {
        return count;
    }

    public void count() {
        count += 1;
        if (count > 9999) {
            reset();
        }
    }

    public void reset() {
        count = 0;
    }
}

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        System.out.print("Welcome! Please enter 'c' for cake, 'p' for pie, or 'q' to quit: ");

        char choice;
        do {
            choice = scanner.nextLine().charAt(0);
            switch (choice) {
                case 'c':
                    cakeCounter.count();
                    break;
                case 'p':
                    pieCounter.count();
                    break;
                case 'q':
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } while (choice != 'q');
        System.out.println("Total votes for cake: " + cakeCounter.getValue());
        System.out.println("Total votes for pie: " + pieCounter.getValue());
    }
}
