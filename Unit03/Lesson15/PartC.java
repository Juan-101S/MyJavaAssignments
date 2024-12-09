/* Juan
 * 12/9/24
 * This program fills an array of 10,000 integers with a random number between 1 and maximum size of the array
 */

import java.util.Arrays;
import java.util.Random;

public class PartC {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int maxValues = 10000;
        int[] array = new int[maxValues];
        Random rand = new Random();

        for (int i = 0; i < maxValues; i++) {
            array[i] = rand.nextInt(maxValues) + 1;
        }
        int[] sortedArray = Arrays.copyOf(array, maxValues);
        Arrays.sort(array);

        int target = rand.nextInt(maxValues) + 1;
        // Linear Search:
        long startTime = System.currentTimeMillis();
        int linearResult = linearSearch(array, target);
        long endTime = System.currentTimeMillis();
        long linearSearchTime = endTime - startTime;
        // Binary Search:
        startTime = System.currentTimeMillis();
        int binaryResult = Arrays.binarySearch(sortedArray, target);
        endTime = System.currentTimeMillis();
        long binarySearchTime = endTime - startTime;

        if (linearResult != -1) {
            System.out.println("Linear Search: Found " + target + " at index " + linearResult);
        } else {
            System.out.println("Linear Search: " + target + " not found.");
        }
        System.out.println("Linear Search took: " + linearSearchTime + " milliseconds.");

        if (binaryResult >= 0) {
            System.out.println("Binary Search: Found " + target + " at index " + binaryResult);
        } else {
            System.out.println("Binary Search: " + target + " not found.");
        }
        System.out.println("Binary Search took: " + binarySearchTime + " milliseconds.");
    }
}
// When changing the array size from 10,000 to 10, the array size decreases,
// vice versa if you increase from 10,000.
// When increasing the array size from 10,000 to 10,000,000, the linear search
// took longer than the binary search.