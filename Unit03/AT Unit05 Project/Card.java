
import java.util.Random;

public class Card {
    public enum Suit {
        SPADE('\u2660'),
        HEART('\u2661'),
        CLUB('\u2663'),
        DIAMOND('\u2662');

        private final char symbol;

        Suit(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    public enum Rank {
        TWO('2'),
        THREE('3'),
        FOUR('4'),
        FIVE('5'),
        SIX('6'),
        SEVEN('7'),
        EIGHT('8'),
        NINE('9'),
        TEN('T'),
        JACK('J'),
        QUEEN('Q'),
        KING('K'),
        ACE('A');

        private final char symbol;

        Rank(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    private Suit suit;
    private Rank rank;

    public Card() {
        Random rand = new Random();
        this.suit = Suit.values()[rand.nextInt(Suit.values().length)];
        this.rank = Rank.values()[rand.nextInt(Rank.values().length)];
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String getFace() {
        return suit.getSymbol() + "" + rank.getSymbol();
    }

    public static void main(String[] args) {
        Card specificCard = new Card(Suit.HEART, Rank.QUEEN);
        System.out.println("The following card should be the queen of hearts:");
        System.out.println("  " + specificCard.getFace());

        System.out.println("\n10 random cards...");
        for (int i = 0; i < 10; i++) {
            Card randomCard = new Card();
            System.out.println("  " + randomCard.getFace());
        }
    }
}