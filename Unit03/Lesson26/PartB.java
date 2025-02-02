/* Juan
 * 2/2/25
 * What is the output of the following program (and why)?
 */

class Item {
    private int value;

    public void setValue(int value) {
        value = value;
    }

    public int getValue() {
        return value;
    }
}

public class PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.print(myItem.getValue() + " | ");
        myItem.setValue(13);
        System.out.println(myItem.getValue());
    }
}
/*
 * The output would be 0 | 0 because in setValue you are setting the value equal
 * to the instance variable rather
 * than the variable for the class so when you getValue the value you are
 * getting has not changed.
 */
// If you wanted the output to be 0 | 13 you would change:
/*
 * public void setValue(int value) {
 * value = value
 * }
 * to
 * public void setValue(int value) {
 * this.value = value;
 * }
 */