public class PartA {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String sent1 = "Madam, I'm Adam";
        String sent2 = "Kayak";
        String sent3 = "Hello World";
        String sent4 = "ForTnitE";
        String sent5 = "AbBa";

        System.out.println("\"" + sent1 + "\" is palindrome: " + isPalindrome(sent1));
        System.out.println("\"" + sent2 + "\" is palindrome: " + isPalindrome(sent2));
        System.out.println("\"" + sent3 + "\" is palindrome: " + isPalindrome(sent3));
        System.out.println("\"" + sent4 + "\" is palindrome: " + isPalindrome(sent4));
        System.out.println("\"" + sent5 + "\" is palindrome: " + isPalindrome(sent5));
    }
}