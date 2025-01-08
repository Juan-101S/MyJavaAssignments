/* Juan
 * 12/8/24
 * This program Create a package called org.derryfield.math
Within the package create a public class called Geometry
Within the Geometry class, declare two public static methods that calculate the volume of a sphere and that calculate the surface area of a sphere respectively:
public static double calcVolSphere(double r)
public static double calcSurfSphere(double r)
Create a demo application that imports the package and uses the static methods to calculate the volume and surface area of a sphere for a given radius
 */

import org.derryfield.math.Geometry;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your radius here; ");
        double r = in.nextDouble();
        double surfaceArea = Geometry.calcSurfSphere(r);
        double volume = Geometry.calcVolSphere(r);

        System.out.println("Your sphere with a radius of " + (int) r + ", has a surface area of " + (int) surfaceArea
                + ", and a volume of " + (int) volume);
    }
}
