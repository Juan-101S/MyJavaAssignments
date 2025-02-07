public class GearedBicycle extends Bicycle {
    private static final int MAX_GEAR = 6;
    private int gear = 1;
    private final int MAX_SPEED_GEARED = 50;

    public int getGear() {
        return gear;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    public void shiftUp() {
        gear = gear + 1;
        if (gear > MAX_GEAR) {
            gear = MAX_GEAR;
        }
    }

    public void shiftDown() {
        gear = gear - 1;
        if (gear < 1) {
            gear = 1;
        }
    }

    public void petal() {
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > MAX_SPEED_GEARED) {
            newSpeed = MAX_SPEED_GEARED;
        }
        setSpeed(newSpeed);
    }

    public void brake() {
        int newSpeed = getSpeed();
        newSpeed = newSpeed - 2;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        setSpeed(newSpeed);
    }
}
