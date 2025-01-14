import java.util.*;

public class BlackJack {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

    public class Player {
        private ArrayList<Card> hand;
        private int score;

        public Player() {
            hand = new ArrayList<>();
            score = 0;
        }

        public void addCard(Card card) {
            hand.add(card);
            score = calculateScore();
        }

        public void clearHand() {
            hand.clear();
            score = 0;
        }

        public ArrayList<Card> getHand() {
            return hand;
        }

        public int getScore() {
            return score;
        }

        public boolean isBusted() {
            return score > 21;
        }

        private int calculateScore() {
            int totalScore = 0;
            int aces = 0;
            for (Card card : hand) {
                totalScore += card.getValue();
                if (card.getRank().equals("A")) {
                    aces++;
                }
            }
            while (totalScore > 21 && aces > 0) {
                totalScore -= 10;
                aces--;
            }
            return totalScore;
        }
    }

    public class Dealer extends Player {
        public void playTurn(Deck deck) {
            while (getScore() < 17) {
                addCard(deck.deal());
                System.out.println("Dealer draws: " + getHand().get(getHand().size() - 1));
            }
        }
    }

    public class Deck {
        private ArrayList<Card> deck = new ArrayList<>();
        private Random random;

        public Deck() {
            deck = new ArrayList<>();
            random = new Random();
            for (String suit : SUITS) {
                for (String ranks : RANKS) {
                    deck.add(new Card(ranks, suit));
                }
            }
            shuffle();
        }

        public void shuffle() {
            Collections.shuffle(deck);
        }

        public Card deal() {
            return deck.remove(0);
        }
    }

    public class Card {
        private String rank;
        private String suit;

        public Card(String rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        public String getSuit() {
            return suit;
        }

        public int getValue() {
            switch (rank) {
                case "A":
                    return 11;
                case "J":
                case "Q":
                case "K":
                    return 10;
                default:
                    return Integer.parseInt(rank);
            }
        }

        public String toString() {
            return rank + "of" + suit;
        }
    }

    public static void main(String[] args) {
        new BlackJack().playGame();
    }

    public void playGame() {
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        boolean playing = true;

        while (playing) {
            player.clearHand();
            dealer.clearHand();
            deck.shuffle();

            player.addCard(deck.deal());
            dealer.addCard(deck.deal());
            player.addCard(deck.deal());
            dealer.addCard(deck.deal());

            System.out.println("Your hand: " + player.getHand() + " | Score: " + player.getScore());
            System.out.println("Dealer's hand: " + dealer.getHand().get(0) + " and [Face Down]");

            while (!player.isBusted()) {
                System.out.print("Hit [H] or Stand [S]: ");
                String choice = scanner.nextLine().toUpperCase();
                if (choice.equals("H")) {
                    player.addCard(deck.deal());
                    System.out.println("You drew: " + player.getHand().get(player.getHand().size() - 1));
                    System.out.println("Your hand: " + player.getHand() + " | Score: " + player.getScore());
                } else if (choice.equals("S")) {
                    break;
                }
            }

            if (player.isBusted()) {
                System.out.println("You busted! Dealer wins!");
            } else {
                dealer.playTurn(deck);
                System.out.println("Dealer's hand: " + dealer.getHand() + " | Score: " + dealer.getScore());

                if (dealer.isBusted()) {
                    System.out.println("Dealer busted! You win!");
                } else if (player.getScore() > dealer.getScore()) {
                    System.out.println("You win!");
                } else if (player.getScore() < dealer.getScore()) {
                    System.out.println("Dealer wins!");
                } else {
                    System.out.println("It's a draw!");
                }
            }

            System.out.print("Do you want to play another hand? Yes [Y] / No [N]: ");
            String playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                playing = false;
                System.out.println("Thanks for playing!");
            }
        }
    }
}