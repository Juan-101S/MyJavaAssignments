/* Juan
 * 12/14/25
 * This program scans in and displays the sales information:
Display the formatted data (see below) to the console output
If the revenue data is not valid, list the value as zero in the output
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File SalesInput = new File("sales_by_cat.txt");
        Scanner fileScanner = new Scanner(SalesInput);

        System.out.printf("%-16s | %-10s | %12s%n", "Department", "Manager", "Revenue", args);
        System.out.println("---------------------------------------------------");

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] data = line.split(",");

            String department = data[0].trim();
            String manager = data[1].trim();
            String revenueString = data[2].trim();

            double revenue = 0.0;

            try {
                revenue = Double.parseDouble(revenueString);
            } catch (NumberFormatException e) {
                revenue = 0.0;
            }

            System.out.printf("%-16s | %-10s | $%10.2f%n", department, manager, revenue);
        }
        System.out.println("---------------------------------------------------");

        fileScanner.close();
    }
}