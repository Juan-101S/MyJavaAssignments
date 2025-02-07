/* Juan
 * 2/7/25
 * This program You are part of a team that is writing a payroll information system for a corporation.  Your system will have two types of workers:
An Employee is someone who receives an annual salary (for example $50,000 per year) and has the following traits
name (as a string of characters)
salary (as a double value)
A Manager is an employee who receives an annual salary, but also gets an annual bonus in addition to this annual salary
bonus (as a double value)

Using the provided Employee class implementation, create a Manager class that extends the Employee class:
Provide an explicit Manager constructor
The constructor should accept three input parameters (name as a String, salary as a double, and bonus as a double) and uses these input values to initialize the instance of the class
The constructor should invoke the parent class's constructor (use the super keyword) to initialize the name and salary values
Override the getAnnualIncome() method to calculate a manager's income using the salary and bonus values.
 */

public class PartB {
    public static void main(String[] args) {
        Employee employee = new Employee("Juan", 50000.00);
        System.out.println("Employee Name: " + employee.getName());
        System.out.printf("Employee Annual Salary: $%.2f%n", employee.getSalary());
        System.out.printf("Employee Annual Income: $%.2f%n", employee.getAnnualIncome());

        System.out.println();
        Manager manager = new Manager("Joey", 50000.00, 10000.00);
        System.out.println("Manager Name: " + manager.getName());
        System.out.printf("Manager Annual Salary: $%.2f%n", manager.getSalary());
        System.out.printf("Manager Annual Income: $%.2f%n", manager.getAnnualIncome());
    }
}
