import java.util.Scanner;

public class BlackjackGame {
    private Deck deck;
    private Player player;
    private Player dealer;

    public BlackjackGame() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        player.clearHand();
        dealer.clearHand();
        deck = new Deck();
        // Initial deal
        player.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());
        player.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());

        System.out.println("Dealer's hand:");
        dealer.showHand(false);

        System.out.println("\nYour hand:");
        player.showHand(true);

        // Player's turn
        while (true) {
            System.out.println("Your total: " + player.getHandValue());
            if (player.isBusted()) {
                System.out.println("You busted! Dealer wins.");
                return;
            }

            System.out.print("Hit or Stand? ");
            String move = sc.nextLine().toLowerCase();
            if (move.equals("hit")) {
                player.receiveCard(deck.dealCard());
                System.out.println("You drew:");
                player.showHand(true);
            } else {
                break;
            }
        }

        // Dealer's turn
        System.out.println("\nDealer's turn:");
        dealer.showHand(true);
        while (dealer.getHandValue() < 17) {
            dealer.receiveCard(deck.dealCard());
            System.out.println("Dealer hits:");
            dealer.showHand(true);
        }

        if (dealer.isBusted()) {
            System.out.println("Dealer busted! You win.");
            return;
        }

        // Determine winner
        int playerTotal = player.getHandValue();
        int dealerTotal = dealer.getHandValue();
        System.out.println("\nFinal Totals - You: " + playerTotal + ", Dealer: " + dealerTotal);

        if (playerTotal > dealerTotal) System.out.println("You win!");
        else if (playerTotal < dealerTotal) System.out.println("Dealer wins.");
        else System.out.println("It's a tie!");
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        Scanner sc = new Scanner(System.in);

        do {
            game.play();
            System.out.print("\nPlay again? (yes/no): ");
        } while (sc.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
    }
}
