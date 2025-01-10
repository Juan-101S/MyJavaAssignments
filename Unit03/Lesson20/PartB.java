/* Juan
 * 1/10/24
 * This program reads in characters.txt file and prints its contents character by character.  After reading in all of the data, the program displays how many characters were scanned in.  The program also displays how many letters were scanned in and how many digits were scanned in
 */

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("characters.txt");
        Scanner in = new Scanner(inputFile);

        int totalCharacters = 0;
        int totalLetters = 0;
        int totalDigits = 0;

        while (in.hasNext()) {
            String line = in.nextLine();
            for (char c : line.toCharArray()) {
                totalCharacters++;
                if (Character.isLetter(c)) {
                    totalLetters++;
                } else if (Character.isDigit(c)) {
                    totalDigits++;
                }
                System.out.print(c);
            }
            System.out.println();
        }
        in.close();

        System.out.println("Count = " + totalCharacters);
        System.out.println("Letters = " + totalLetters);
        System.out.println("Digits = " + totalDigits);
    }
}
