/* Juan
 * 11/3/24
 * This program Creates a nested for loop to produce the following output.
....1
...22
..333
.4444
55555
 */

public class PartD {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}