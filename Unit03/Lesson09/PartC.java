/* Juan
 * 10/28/24
 * This program generates 10 random numbers
 */

public class PartC {
    public static void main(String[] args) {
        double total = 0;
        double times = 0;
        double average;
        int n;

        System.out.println("Your numbers are: ");
        for (int i = 1; i <= 10; i++) {
            double r = Math.random();
            r = r * 10 + 1;
            n = (int) r;
            System.out.println(n);
            total = total + n;
            times = times + 1;
        }
        average = total / times;
        System.out.println("The average of these numbers is: " + average);

        double total2 = 0;
        double times2 = 0;
        double average2;
        int n2;

        System.out.println("Your numbers are: ");
        for (int i2 = 1; i2 <= 1000; i2++) {
            double r2 = Math.random();
            r2 = r2 * 1000 + 1;
            n2 = (int) r2;
            System.out.println(n2);
            total2 = total2 + n2;
            times2 = times2 + 1;
        }
        average2 = total2 / times2;
        System.out.println("The average of these numbers is: " + average2);
    }
}
// I think the average for 1000 random integers should make sense.