
import java.util.Random;
import java.util.Scanner;

public class PartA {
    private int value = 1;
    private Random random = new Random();

    // Constructor (default)
    public PartA() {
        this.value = 2;
        this.random = new Random();
    }

    // Constructor (custom value)
    public PartA(int initialValue) {
        this.value = initialValue;
        this.random = new Random();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newVal) {
        value = newVal;
    }

    public void roll() {
        int r = random.nextInt(1, 7);
        value = r;
    }

    public void display() {
        if (value == 1) {
            System.out.printf(" _______________%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|       x       |%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|_______________|%n");
        } else if (value == 2) {
            System.out.printf(" _______________%n" +
                    "|               |%n" +
                    "|   x           |%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|            x  |%n" +
                    "|_______________|%n");
        } else if (value == 3) {
            System.out.printf(" _______________%n" +
                    "|               |%n" +
                    "|  x            |%n" +
                    "|               |%n" +
                    "|       x       |%n" +
                    "|               |%n" +
                    "|            x  |%n" +
                    "|_______________|%n");
        } else if (value == 4) {
            System.out.printf(" _______________%n" +
                    "|               |%n" +
                    "|  x         x  |%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|               |%n" +
                    "|  x         x  |%n" +
                    "|_______________|%n");
        } else if (value == 5) {
            System.out.printf(" _______________%n" +
                    "|               |%n" +
                    "|  x         x  |%n" +
                    "|               |%n" +
                    "|       x       |%n" +
                    "|               |%n" +
                    "|  x         x  |%n" +
                    "|_______________|%n");
        } else if (value == 6) {
            System.out.printf(" _______________%n" +
                    "|               |%n" +
                    "|   x       x   |%n" +
                    "|               |%n" +
                    "|   x       x   |%n" +
                    "|               |%n" +
                    "|   x       x   |%n" +
                    "|_______________|%n");
        }
    }

    public static void main(String[] args) {
        PartA die = new PartA();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            String command = in.next();

            if (command.equals("r")) {
                die.roll();
            } else if (command.equals("d")) {
                die.display();
            } else if (command.equals("q")) {
                break;
            } else {
                System.out.printf("Error. I did not understand what you inputted:%n");
            }
        }
    }
}