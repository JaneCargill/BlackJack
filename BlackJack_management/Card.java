package BlackJack_management;

public class Card {
  private NumberType number;
  private SuitType suit;

  public Card(NumberType number, SuitType suit){
    this.number = number;
    this.suit = suit;
  }

  public NumberType getNumber() {
    return this.number;
  }

  public SuitType getSuit() {
    return this.suit;
  }

@Override
  public String toString() {
    return this.number + " of " + this.suit;
  }

  public int cardValue() {

      int count = number.ordinal();
        if (number.ordinal() < 10) {
          count++;
        } else {
          count = 10;
        }   
    return count;
}

}
















