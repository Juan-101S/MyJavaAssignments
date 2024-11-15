import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String input = in.next();
        System.out.println("Hello, " + input);
        System.out.print("How old are you? ");
        int input2 = in.nextInt(); // The value (input) that was there before was the same variable as the other
                                   // inout above. There cannot be two different varaibles with the same name
        input2++;
        System.out.println("Next year, you will be " + input2);
    }
}
