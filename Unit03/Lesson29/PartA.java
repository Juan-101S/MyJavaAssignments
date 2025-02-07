/* Juan
 * 2/7/25
 * This program In addition to having gears which help with acceleration, geared bicycles in our virtual world have better brakes that slow the bicycle down twice as fast as a conventional bicycle.

Modify the GearedBicycle class that you developed in the classroom to override the brake() function to more accurately model the braking of a geared bicycle.

Write a demo program that compares the braking of a regular bicycle and a geared bicycle in our virtual world
 */

public class PartA {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();

        System.out.printf("Speed: %d%n", b.getSpeed());
        b.pedal();
        b.pedal();
        System.out.printf("Speed after pedaling twice: %d%n", b.getSpeed());
        b.brake();
        System.out.printf("Speed after braking: %d%n", b.getSpeed());

        GearedBicycle gb = new GearedBicycle();

        gb.shiftUp();
        gb.shiftUp();
        gb.pedal();
        gb.pedal();
        System.out.printf("Geared Bike Speed after pedaling twice: %d%n", gb.getSpeed());
        gb.brake();
        System.out.printf("Geared Bike speed after braking: %d%n", gb.getSpeed());
    }
}
