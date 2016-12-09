package BlackJack_management;
import java.util.*;

public class Hand {
  private ArrayList<Card> cards;
  Deck deck;

  public Hand() {
    this.cards = new ArrayList<Card>();

  }

  public void addCardToHand(Card card) {
     cards.add(card);
  }

  public int handCardCount() {
    return cards.size();
  }


















}