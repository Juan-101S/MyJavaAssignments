public class InputArguments {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Arg %d: %s%n", i, args[i]);
        }
    }
}