/* Juan
 * 10/25/24
 * This program uses a while loop to calculate how many years it will take before 99% of the original cesium will be gone.
 */

public class PartA {
    public static void main(String[] args) {
        double quantity = 100;
        int numyears = 0;
        while (quantity >= 1) {
            quantity = quantity / 2;
            numyears += 1;
            System.out.println("After " + numyears * 30 + " years, there is " + quantity
                    + "% of the original amount of Cesium 90");
        }
    }
}