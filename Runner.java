import BlackJack_management.*;
import java.util.*;

public class Runner{

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffle();
    Hand hand = new Hand();
    Card card = new Card(NumberType.ACE, SuitType.HEARTS);
    Card removed_card = deck.removeCardFromDeck();
    hand.addCardToHand(removed_card);

// System.out.println(deck.getDeck());
// for (Card cards : deck.getDeck())

    // System.out.println(cards.toString());
  System.out.println(hand.toString());
  }

  // System.out.println(hand);
  // }


}
