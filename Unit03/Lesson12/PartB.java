import java.util.Scanner;

public class PartB {
    public static double smallest(double x, double y, double z) {
        if (x <= y && x <= z) {
            return x;
        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, num3;
        while (true) {
            System.out.println("Enter three numbers: ");
            System.out.print("Enter the first number: ");
            num1 = in.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = in.nextDouble();
            System.out.print("Enter the third number: ");
            num3 = in.nextDouble();
            break;
        }
        double result = smallest(num1, num2, num3);
        System.out.println("The smallest value is: " + result);

    }
}
