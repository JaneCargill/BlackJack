package BlackJack_management;
import java.util.*;

public class Deck {
  private ArrayList<Card> cards;

  public Deck(){
    this.cards = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck() {
    return this.cards;
  }

  public int cardCount() {
    return cards.size();
  }

  public void createDeck() {
  for (SuitType suit : SuitType.values()){
    for (NumberType number : NumberType.values()){
      cards.add(new Card(number, suit));
    }
  }
}
public void shuffle() {
  Collections.shuffle(cards);
}

}










