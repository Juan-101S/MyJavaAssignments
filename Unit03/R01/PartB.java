public class PartB {
    public static void main(String[] args) {
        printTriangle(5);
    }

    private static void printTriangle(int i) {
        for (int row = 1; row <= i; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}