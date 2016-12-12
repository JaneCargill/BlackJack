package BlackJack_management;
import java.util.*;

public class Player {
  private String name;
  private Hand hand;

  public Player(String name){
    this.name = name;
    this.hand = new Hand();
  }

  public String getName() {
    return this.name;
  }

  public Hand getHand() {
    return this.hand;
  }

  public ArrayList<Card> getCardsInHand() {
    Hand new_hand = getHand();
     return new_hand.getHand();
  }

  public int countCardsInHand() {
    Hand new_hand = getHand();
    return new_hand.handCardCount();
  }

  public void addCardsToHand(Card card) {
    Hand new_hand = getHand();
     new_hand.addCardToHand(card);
  }
}