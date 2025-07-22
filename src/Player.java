import java.util.*;

public class Player {
    protected List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int aceCount = 0;

        for (Card c : hand) {
            value += c.getValue();
            if (c.getValue() == 11) aceCount++;
        }

        // Adjust for Aces
        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }

        return value;
    }

    public void showHand(boolean showAll) {
        for (int i = 0; i < hand.size(); i++) {
            if (!showAll && i == 0) System.out.println("Hidden");
            else System.out.println(hand.get(i));
        }
    }

    public boolean isBusted() {
        return getHandValue() > 21;
    }

    public void clearHand() {
        hand.clear();
    }
}
