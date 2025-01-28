/*
 * Juan
 * 1/28/25
 * This program Declare a reference (variable) to a Scanner object and name the
 * variable in.
 * Initialize the input variable so that it references a Scanner object that was
 * instantiated using System.in (standard input/keyboard) as its input stream.
 * Use the nextLine() method to get the name of the user and print it to the
 * console.
 * Use the nextInt() method to get the age of the user and print it to the
 * console.
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Hi " + name + "!");
        System.out.print("Please enter your age: ");
        int age = in.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}