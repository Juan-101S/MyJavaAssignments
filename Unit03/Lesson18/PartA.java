/* Juan
 * 12/16/24
 * This program  declares and initializes an ArrayList of Strings called names:  
Loop and ask the user for a name or the # symbol to quit
Add each name to the names ArrayList
After the names have been added to the list, print each name on a separate line
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter names and press # to stop: ");
            String name = in.nextLine();

            if (name.equals("#")) {
                break;
            }
            names.add(name);
        }
        System.out.println("Your names: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}