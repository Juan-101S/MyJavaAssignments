/*
 * Juan
 * 1/16/25
 * This program asks the user to specify the name of a text file for reading:
 * Ask the user to specify a filename or the # character to quit.
 * If the user types in the # character, say goodbye and quit the program run
 * If a file is found with that name, open the file for reading.
 * Display each word on its own line on the computer screen.
 * Close the file when you are finished reading from it.
 * End the program run
 * If the file is not found, display an error message to the user
 * Let the user know that the file was not found.
 * Repeat the process to get the file name (specify a filename or the #
 * character to quit).
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name of the text file (or # to quit): ");
            String filename = userInput.nextLine();

            if (filename.equals("#")) {
                System.out.println("Goodbye!");
                break;
            }
            File file = new File(filename);
            if (file.exists() && file.isFile()) {
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNext()) {
                        System.out.println(fileScanner.next());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error: Unable to open the file.");
                }
            } else {
                System.out.println("Error: The file \"" + filename + "\" was not found.");
            }
        }
        userInput.close();
    }
}