
/* Juan
 * 10/25/24
 * The different ways someone can interact wih a light is by:
 * looking at it
 * turning it on
 * turning it off
 * making it brighter
 * making it dimmer
 */
import java.util.Scanner;

class Light {
    private boolean state = false;
    int brightness = 1;

    public boolean getState() {
        return state;
    }

    public void on() {
        state = true;
    }

    public void off() {
        state = false;
    }

    public void up() {
        brightness = brightness + 1;
        if (brightness > 10) {
            brightness = 10;
        }
    }

    public void down() {
        brightness = brightness - 1;
        if (brightness < 1) {
            brightness = 1;
        }
    }

    public void setBrightness(int newVal) {
        if (newVal > 10) {
            brightness = 10;
        } else if (newVal < 1) {
            brightness = 1;
        }
    }

    public int getBrightness() {
        return getBrightness();
    }
}

public class PartB {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Light light = new Light();

            while (true) {
                System.out.print("Enter any of these commands (\"on\", \"off\", \"view\", \"up\", \"down\", \"q\"): ");
                String userInput = in.nextLine().toLowerCase();
                if (userInput.equals("on")) {
                    light.on();
                } else if (userInput.equals("off")) {
                    light.off();
                } else if (userInput.equals("up")) {
                    light.up();
                } else if (userInput.equals("down")) {
                    light.down();
                } else if (userInput.equals("view")) {
                    if (light.getState()) {
                        System.out.println("The light is on.");
                    } else {
                        System.out.println("The light is off.");
                    }
                    System.out.println("The current brightness level is: " + light.getBrightness());
                } else if (userInput.equals("q")) {
                    break;
                } else {
                    System.out.println("Error: I did not understand the command.");
                }
            }
        }

    }
}
