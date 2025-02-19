/* Juan
 * 2/19/25
 * You are given a class called BaseballCard:
Override the toString() method to print more useful information about an object of this type
Override the equals() method to determine if two cards are equal (for example, if a collector has two cards, return true if the cards are equivalent, false otherwise)
Write a sample application that demonstrates how these two methods work
 */

public class PartA {
    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Juan", 2008);
        BaseballCard card2 = new BaseballCard("Joey", 2007);
        BaseballCard card3 = new BaseballCard("Juan", 2008);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);

        System.out.println("Card 1 equals Card 2: " + card1.equals(card2));
        System.out.println("Card 1 equals Card 3: " + card1.equals(card3));
    }
}
