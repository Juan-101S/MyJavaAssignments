/* Juan
 * 10/25/24
 * This program generates a random number
 */

import java.util.Random;

public class PartA {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }
}