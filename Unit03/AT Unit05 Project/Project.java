import java.util.Scanner;
import java.util.Random;

class Card {
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    // private member variables
    private Suit suit;
    private Rank rank;

    // default Constructor w/o arguments
    public Card() {
        Random random = new Random();
        this.suit = this.suit = Suit.values()[random.nextInt(Suit.values().length)];
        this.rank = Rank.values()[random.nextInt(Rank.values().length)];
    }

    public Card(Suit suit, Rank rank) {

    }
}