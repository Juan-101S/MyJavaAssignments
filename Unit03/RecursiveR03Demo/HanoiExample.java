import java.util.*;

public class HanoiExample {
    static int n = 3;
    static int[] discPositions;

    public static void main(String[] args) {
        discPositions = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            discPositions[i] = 1;
        }
        System.out
                .println("In order to solve a hanoi tower with " + n + " discs, here's how you would move the discs: ");
        System.out.println();
        printPegs();
        hanoi(n, 1, 3);
    }

    public static int getInterim(int start, int end) {
        return 6 - start - end;
    }

    public static void printMove(int start, int end) {
        int movingDisc = -1;
        for (int i = 1; i <= n; i++) {
            if (discPositions[i] == start) {
                movingDisc = i;
                break;
            }
        }
        discPositions[movingDisc] = end;
        System.out.println("Move disc #" + movingDisc + " from " + start + " --> " + end);
        printPegs();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void hanoi(int n, int start, int end) {
        if (n == 1) {
            printMove(start, end);
        } else {
            int interim = getInterim(start, end);
            hanoi(n - 1, start, interim);
            printMove(start, end);
            hanoi(n - 1, interim, end);
        }
    }

    public static void printPegs() {
        for (int level = n; level >= 1; level--) {
            for (int peg = 1; peg <= 3; peg++) {
                int discAtLevel = getDiscAtLevel(peg, level);
                printDisc(discAtLevel);
            }
            System.out.println();
        }
        System.out.println("    [1]         [2]         [3]     ");
        System.out.printf("------------------------------------%n");
    }

    public static int getDiscAtLevel(int peg, int levelFromBottom) {
        int count = 0;
        for (int i = n; i >= 1; i--) {
            if (discPositions[i] == peg) {
                count++;
                if (count == levelFromBottom) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static void printDisc(int size) {
        int maxWidth = n * 2 + 1;
        if (size == 0) {
            System.out.print(" ".repeat(maxWidth / 2) + "|" + " ".repeat(maxWidth / 2));
        } else {
            int discWidth = size * 2 - 1;
            int padding = (maxWidth - discWidth) / 2;
            System.out.print(" ".repeat(padding) + "=".repeat(discWidth) + " ".repeat(padding));
        }
        System.out.print("      ");
    }
}