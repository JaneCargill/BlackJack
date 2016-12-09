import BlackJack_management.*;
import java.util.*;

public class Runner{

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffle();
    Card card = new Card(NumberType.ACE, SuitType.HEARTS);

// System.out.println(deck.getDeck());
for (Card cards : deck.getDeck())

    System.out.println(cards.toString());
  }
  

}
