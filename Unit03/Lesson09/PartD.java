/* Juan
 * 10/28/24
 * This program simulates a dice roll
 */

class DiceRoll {
    public void updateState(int newState) {
        if (newState == '1') {
            String[] one = { " _______________",
                    "|               |",
                    "|               |",
                    "|               |",
                    "|       x       |",
                    "|               |",
                    "|               |",
                    "|_______________|" };
            System.out.print(one);
        } else if (newState == '2') {
            String[] two = { " _______________",
                    "|               |",
                    "|   x           |",
                    "|               |",
                    "|               |",
                    "|               |",
                    "|            x  |",
                    "|_______________|" };
            System.out.print(two);
        } else if (newState == '3') {
            String[] three = { " _______________",
                    "|               |",
                    "|  x            |",
                    "|               |",
                    "|       x       |",
                    "|               |",
                    "|            x  |",
                    "|_______________|" };
            System.out.print(three);
        } else if (newState == '4') {
            String[] four = { " _______________",
                    "|               |",
                    "|  x         x  |",
                    "|               |",
                    "|               |",
                    "|               |",
                    "|  x         x  |",
                    "|_______________|" };
            System.out.print(four);
        } else if (newState == '5') {
            String[] five = { " _______________",
                    "|               |",
                    "|  x         x  |",
                    "|               |",
                    "|       x       |",
                    "|               |",
                    "|  x         x  |",
                    "|_______________|" };
            System.out.print(five);
        } else if (newState == '6') {
            String[] six = { " _______________",
                    "|               |",
                    "|   x       x   |",
                    "|               |",
                    "|   x       x   |",
                    "|               |",
                    "|   x       x   |",
                    "|_______________|" };
            System.out.print(six);
        }
    }
}

public class PartD {
    public static void main(String[] args) {
        DiceRoll roll = new DiceRoll();

        double number = Math.random();
        number = number * 6 + 1;

        System.out.println((int) number);
        roll.updateState((int) number);
    }
}
