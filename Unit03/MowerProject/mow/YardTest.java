package mow;

public class YardTest {
    public static void main(String[] args) {
        Yard yard = new Yard(5, 5);

        System.out.println("Initial Yard:");
        yard.printYard();

        Mower mower = new Mower(2, 2, 0);

        System.out.println("\nYard with mower at (2, 2) facing ^:");
        yard.printYard(mower);
        mower.turnRight();

        System.out.println("\nYard with mower turned right:");
        yard.printYard(mower);

        System.out.println("\nDoes the yard have unmowed grass? " + yard.hasUnmowedGrass());

        yard.setCellValue(2, 2, '-');
        System.out.println("\nYard after setting a cell as mowed:");
        yard.printYard();

        System.out.println("\nDoes the yard have unmowed grass after mowing? " + yard.hasUnmowedGrass());
        System.out.println("\nYard height: " + yard.returnHeight());
        System.out.println("Yard width: " + yard.returnLength());
    }
}
