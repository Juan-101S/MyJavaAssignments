public class PartC {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int countVowels(String phrase) {
        int vowelCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);
            if (isVowel(currentChar)) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String testPhrase1 = "Hello, World!";
        String testPhrase2 = "Programming in Java";
        String testPhrase3 = "aeiou";
        System.out.println("Vowel count in '" + testPhrase1 + "': " + countVowels(testPhrase1));
        System.out.println("Vowel count in '" + testPhrase2 + "': " + countVowels(testPhrase2));
        System.out.println("Vowel count in '" + testPhrase3 + "': " + countVowels(testPhrase3));
    }
}