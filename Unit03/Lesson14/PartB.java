/* Juan
 * 12/5/24
 * This program creates an array of doubles called numbers using the following initial values:

	{ 2.2, 1.0, 3.7, 4.1, 88.0 }

    then the program prints the numbers, while also printing the average of the numbers
 */

public class PartB {
    public static void main(String[] args) {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };
        double sum = 0;

        for (double num : numbers) {
            System.out.println(num);
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("Avg = " + average);
    }
}