/* Juan
 * 10/28/24
 * This program counts the letter "e"
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any phrase of your choosing: ");
        String phrase = in.nextLine();

        int eCounter = 0;
        int i;

        for (i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e') {
                eCounter++;
            }
        }
        System.out.println("Your phrase has " + eCounter + " \'e\'s");
    }
}
