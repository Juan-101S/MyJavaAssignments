/* Juan
 * 12/8/24
 * This program opens this file called "temps.txt" for reading:
Create an ArrayList object to hold Integer values
Open the file for reading
Read in all of the values as integers from the file and import these values into the array list
Keep track the lowest temperature
After all of the values have been imported, loop through the list and print each temperature on a separate line
Mark each instance of the lowest temperature with "<= lowest"
Close the file when you're done
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Integer> temperatures = new ArrayList<>();

        while (in.hasNext()) {
            int temperature = in.nextInt();
            temperatures.add(temperature);
        }
        int lowesttemperature = Integer.MAX_VALUE;

        for (int temperature : temperatures) {
            if (temperature < lowesttemperature) {
                lowesttemperature = temperature;
            }
        }
        PrintWriter out = new PrintWriter("tempsOut.txt");

        for (int temperature : temperatures) {
            out.printf("%6d", temperature);
            if (temperature == lowesttemperature) {
                out.print(" <= lowest");
            }
            out.println();
        }
        in.close();
        out.close();
    }
}