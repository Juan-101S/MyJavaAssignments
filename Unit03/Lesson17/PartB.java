public class PartB {
    public static void main(String[] args) {
        int[][] array1 = {
                { 8, 6, 7 },
                { 5, 3, 0 }
        };
        int[][] array2 = {
                { 0, 7, 6, 5 },
                { 2, 2, 0, 1 },
                { 8, 4, 5, 7 },
        };
        print(array1);
        print(array2);
    }

    public static void print(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                System.out.print(values[i][j]);
                System.out.print(", ");
            }
            System.out.println(" ");
        }
    }
}
