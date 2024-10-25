
/* Juan
 * 10/25/24
 * The different ways someone can interact wih a light is by:
 * looking at it
 * turning it on
 * turning it off
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
}

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Light light = new Light();

        while (true) {
            System.out.print("Enter any of these commands (\"on\", \"off\", \"view\", \"up\", \"down\", \"q\"): ");
            String userInput = in.nextLine().toLowerCase();
            if (userInput == "on") {
                light.on();
            }
            if (userInput == "off") {
                light.off();
            }
            if (userInput == "up") {
                light.up();
            }
            if (userInput == "down") {
                light.down();
            }
            if (userInput == "view") {
                System.out.println("The current brightness level is: " + light.getState());
            }
            if (userInput == "q") {
                break;
            }
        }

    }
}
