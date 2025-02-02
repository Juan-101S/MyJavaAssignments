/* Juan
 * 2/2/25
 * This program List an example of each of the following and write a simple program that demonstrates how these items are used:
A Java-provided constant static value that is often used in mathematical and/or scientific calculations.
A Java-provided static method that is often used in mathematical and/or scientific calculations.
 */

public class PartA {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println("Pi: " + pi);

        double sqrt = Math.sqrt(25);
        System.out.println("Square root of 25: " + sqrt);

        System.out.println("The square root of 25 + pi is: " + (pi + sqrt));
    }
}