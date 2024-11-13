public class PartB2 {
    public static void main(String[] args) {
        PartB point1 = new PartB();
        System.out.println("Point 1 (Default Constructor): " + point1);
        System.out.println("x = " + point1.getX() + ", y = " + point1.getY());
        System.out.println("r = " + point1.getPr() + ", theta = " + point1.getTheta() + " radians");

        PartB point2 = new PartB(3, 4);
        System.out.println("\nPoint 2 (Cartesian Coordinates): " + point2);
        System.out.println("x = " + point2.getX() + ", y = " + point2.getY());
        System.out.println("r = " + point2.getPr() + ", theta = " + point2.getTheta() + " radians");

        point1.translate(2, 3);
        System.out.println("\nAfter translating Point 1 by (2, 3): " + point1);
        System.out.println("x = " + point1.getX() + ", y = " + point1.getY());

        double distance = point1.distanceTo(point2);
        System.out.println("\nDistance between Point 1 and Point 2: " + distance);
    }
}
