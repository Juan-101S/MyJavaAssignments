import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SerializationWrite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.print("Type 'e' to add an employee or 'q' to quit: ");
            String token = in.nextLine();
            if (token.toLowerCase().equals("q")) {
                System.out.println("Done inputting data");
                break;
            } else {
                System.out.print("  Last name: ");
                String last = in.nextLine();
                System.out.print("  First name: ");
                String first = in.nextLine();
                System.out.print("  Salary: ");
                double salary = 0;
                token = in.nextLine();
                try {
                    salary = Double.parseDouble(token);
                } catch (NumberFormatException e) {
                    System.err.println("error parsing salary, salary set to 0!");

                }
                Employee.lastIDUsed++;
                Employee e = new Employee(last, first, Employee.lastIDUsed, salary);
                employees.add(e);
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFirstName());
        }
        // record to file.
        String filepath = "data.bin";
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            // save the last ID used info.
            dataOutputStream.writeInt(Employee.lastIDUsed);
            for (Employee e : employees) {
                e.writeToStream(dataOutputStream);
            }

            // we're done. the streams should automatically be closed as we exit the try
            // with resources clause.
            System.out.println("Data saved to \"" + filepath + "\"");
        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        }
    }
}
