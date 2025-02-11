/* Juan
 * 2/11/25
 * This program Using the provided classes (see links above), create a new class called Executive that inherits the traits and behaviors of the Manager class:
In addition to the name, salary, and bonus that a Manager has, Executives can also be granted shares of the company stock.
Modify the Executive class so that it has public methods to get and set the number of shares that an executive currently owns (as a double)
Also override the displayInfo() method for the Executive class to include the number of shares that the Executive currently owns

Once you have created the Executive class, modify the demo application to demonstrate how objects of Executive class behave when their displayInfo() method is called
 */

import util.Executive;
import util.Employee;
import util.Manager;
import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.print("Enter a letter ((E)mployee, (M)anager, E(x)ecutive, or (Q)uit): ");
            String choice = in.nextLine().toLowerCase();
            String name;
            double salary;
            double bonus;
            double shares;
            if (choice.equals("q")) {
                // exit the loop.
                break;
            } else if (choice.equals("e")) {
                // create a new employee;
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                Employee employee = new Employee(name, salary);

                // add to array list.
                employees.add(employee);
            } else if (choice.equals("m")) {
                // create a new manager;
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                Manager manager = new Manager(name, salary, bonus);

                employees.add(manager);
            } else if (choice.equals("x")) {
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                System.out.print("Enter shares (as a double): ");
                shares = Double.parseDouble(in.nextLine());
                Executive executive = new Executive(name, salary, bonus, shares);

                employees.add(executive);
            } else {
                System.out.println("I don't understand your choice.");
            }

            // put a newline to make it easier to read.
            System.out.println();
        }

        // insert newline to make it easier to read.
        System.out.println();

        // after entering in data, loop through the array list and display info.
        System.out.printf("Your company has %d employees.%n", employees.size());
        System.out.println();

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}