public class PartA {
    public static void main(String[] args) {
        printInverted(5);
    }

    private static void printInverted(int i) {
        for (int row = i; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}