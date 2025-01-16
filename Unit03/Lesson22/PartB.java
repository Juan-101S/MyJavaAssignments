/* Juan
 * 1/16/25
 * This program reads in this file:
The first field of each line is the name of the person
The second field is their birth year or "n/a" if the birth year is not available
Use Integer.parseInt() method to convert the birth year field from the file to an integer value
Use try-catch statement to handle the NumberFormatException
Print the name and their birth year if you were able to extract the birth year from the file
Print a message that you don't know the birth year for that person if you were unable to extract the birth year from the file
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        try {
            File file = new File("birthyears.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int spaceIndex = line.indexOf(',');
                String name = line.substring(0, spaceIndex);
                String birthYearString = line.substring(spaceIndex + 1);

                try {
                    if (birthYearString != "n/a") {
                        int birthYear = Integer.parseInt(birthYearString);
                        System.out.println(name + " was born in " + birthYear + ".");
                    } else {
                        System.out.println("I do not know what year " + name + " was born.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing birth year for " + name + ".");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
