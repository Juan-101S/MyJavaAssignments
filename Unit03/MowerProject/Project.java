/* Juan
 * 2/7/25
 * This program simulates a lawnmower
 */

import java.util.Scanner;
import mow.Yard;
import mow.Mower;

public class Project {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptionException received.");
        }
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height of the yard: ");
        int height = in.nextInt();
        System.out.print("Enter the yard width: ");
        int width = in.nextInt();

        Yard yard = new Yard(height, width);
        yard.printYard();
        System.out.println();

        System.out.print("Enter your starting row in your yard between 0 and " + (height - 1) + ": ");
        int mrow = in.nextInt();
        System.out.print("Enter your starting column in your yard between 0 and " + (width - 1) + ": ");
        int mcolumn = in.nextInt();

        System.out.print("Enter a starting direction for your mower. 0 is up, 1 is right, 2 is down, 3 is left: ");
        int mdirection = in.nextInt();

        Mower mower = new Mower(mrow, mcolumn, mdirection);
        clearScreen();
        yard.printYard(mower);

        System.out.print("Do you want a spiral cut (1) or line by line (2): ");
        int cut = in.nextInt();
        if (cut == 1) {
            while (true) {
                mower.cutGrass(yard);
                if (mower.checkGrass(yard) == false) {
                    mower.turnRight();
                    if (mower.checkGrass(yard) == true) {
                        mower.moveForward();
                    } else {
                        mower.turnLeft();
                        mower.turnLeft();
                        if (mower.checkGrass(yard) == true) {
                            mower.moveForward();
                        } else {
                            break;
                        }
                    }
                } else {
                    mower.moveForward();
                }
                clearScreen();

                yard.printYard(mower);
                System.out.println();
                delay(500);
            }
        } else if (cut == 2) {
            while (true) {
                if (mower.checkGrass(yard) == false) {
                    mower.turnRight();
                }
                while (mower.checkGrass(yard) == true) {
                    mower.cutGrass(yard);
                    mower.updateMower(yard);
                    clearScreen();
                    yard.printYard(mower);
                    System.out.println();
                    delay(500);
                }
                mower.turnRight();
                if (mower.checkGrass(yard) == false) {
                    mower.turnLeft();
                    mower.turnLeft();
                    mower.cutGrass(yard);
                    mower.updateMower(yard);
                    clearScreen();
                    yard.printYard(mower);
                    System.out.println();
                    delay(500);
                    mower.turnLeft();
                } else if (mower.checkGrass(yard) == true) {
                    mower.cutGrass(yard);
                    mower.updateMower(yard);
                    clearScreen();
                    yard.printYard(mower);
                    System.out.println();
                    delay(500);
                    mower.turnRight();
                }
                while (mower.checkGrass(yard) == true) {
                    mower.cutGrass(yard);
                    mower.updateMower(yard);
                    clearScreen();
                    yard.printYard(mower);
                    System.out.println();
                    delay(500);
                }
            }
        }
        in.close();
    }
}