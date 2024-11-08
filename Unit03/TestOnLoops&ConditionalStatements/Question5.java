/* Juan
 * 11/8/24
 * This program uses a loop that computes and displays the average of all the integers from 1 to 100
 */

public class Question5 {
    public static void main(String[] args) {
        int total = 0;
        int times = 100;
        double average;

        System.out.println("Your numbers are: ");
        for (int i = 1; i <= times; i++) {
            total = total + i;
            System.out.println(i);
        }
        average = total / times;
        System.out.println("The averages of these numbers is: " + average);
    }
}