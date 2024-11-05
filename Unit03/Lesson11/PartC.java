/* Juan
 * 11/5/24
 * This program asks the user for the radius of a sphere:
The radius should be provided as a double value
Write a method that uses this radius to calculate and return the volume of a sphere (as a double value).
Your program should use this method to calculate the volume of at least one sphere.
 */

import java.util.Scanner;

public class PartC {
    public static double volumer(double radius) {
        double volume;
        volume = Math.pow(radius, 3);
        volume = volume * 4.0 / 3.0 * Math.PI;
        return volume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the radius of the sphere? ");
        double rSphere = in.nextDouble();
        double volume = volumer(rSphere);
        System.out.println("The volume of your sphere is " + volume);
    }
}