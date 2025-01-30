public class Car {
    private double speed;

    public Car() {
        this.speed = 0.0;
    }

    public Car(double initialSpeed) {
        if (initialSpeed >= 0.0 && initialSpeed <= 120.0) {
            this.speed = initialSpeed;
        } else {
            System.out.println("Speed must be between 0.0 and 120.0 mph. Setting speed to 0.0.");
            this.speed = 0.0;
        }
    }

    public double getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (this.speed < 120.0) {
            this.speed += 1.0;
        } else {
            System.out.println("Car is already at maximum speed.");
        }
    }

    public void brake() {
        if (this.speed > 0.0) {
            this.speed -= 0.1;
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Initial speed of the car: " + myCar.getSpeed() + "mph");

        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Speed after accelerating: " + myCar.getSpeed() + "mph");
        }
        for (int i = 0; i < 3; i++) {
            myCar.brake();
            System.out.printf("Speed after braking: %.1fmph%n", myCar.getSpeed());
        }
        myCar.brake();
    }
}