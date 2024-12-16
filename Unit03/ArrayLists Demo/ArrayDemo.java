import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Theodore");
        names.add("Thomas");
        names.add("Sam");
        names.add("Jerry");

        System.out.println("The names are as follows: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("i = " + i + " name = " + names.get(i));
        }

        names.remove(0);
        System.out.println("The names are as follows: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("i = " + i + " name = " + names.get(i));
        }
    }
}