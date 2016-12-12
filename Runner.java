import BlackJack_management.*;
import java.util.*;

public class Runner{

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffle();
    Hand hand = new Hand();
    Card card = new Card(NumberType.ACE, SuitType.HEARTS);
    Player player = new Player("Tom");
    // Hand new_hand = player.getHand();
    // hand.addCardToHand(card);
    // Card removed_card = deck.removeCardFromDeck();
    // hand.addCardToHand(removed_card);

// System.out.println(deck.getDeck());
// for (Card cards : deck.getDeck())

//     System.out.println(card.toString());
  // System.out.println(hand.toString());
  // }

  // System.out.println(removed_card);
  // System.out.println(hand.getHand());
  // System.out.println(new_hand.getHand());
  // System.out.println(player.getCardsInHand());
  System.out.println(card.cardValue());

  }


}
