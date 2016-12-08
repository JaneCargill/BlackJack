package BlackJack_management;
import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public int cardCount() {
    return deck.size();
  }

  public void createDeck(){
  for (SuitType suit : SuitType.values()){
    for (NumberType number : NumberType.values()){
      deck.add(new Card(number, suit));
    }
  }
}
}

  }











}

