package BlackJack_management;
import java.util.*;

public class Hand {
  private ArrayList<Card> cardsInHand;
  Deck deck;

  public Hand() {
    this.cardsInHand = new ArrayList<Card>();

  }

  public ArrayList<Card> getHand() {
    return this.cardsInHand;
  }

  public void addCardToHand(Card card) {
          cardsInHand.add(card);
  }

  public int handCardCount() {
    return cardsInHand.size();
  }


















}