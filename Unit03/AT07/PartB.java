public class PartB {
    private double x;
    private double y;

    // Default Constructor
    public PartB() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor that takes coodinates
    public PartB(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPr() {
        return Math.sqrt(x * x + y * y);
    }

    public double getTheta() {
        return Math.atan2(y, x);
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanceTo(PartB other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}