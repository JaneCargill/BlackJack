import static org.junit.Assert.*;
import org.junit.*;
import BlackJack_management.*;

public class HandTest {

  Hand hand;
  Deck deck;
  Card card;

  @Before
  public void before() {
    hand = new Hand();
    deck = new Deck();
  }

    @Test
    public void canCountCardsInHand() {
      assertEquals(0, hand.handCardCount());
    }

    @Test
    public void canGetHand() {
      assertEquals (0, hand.handCardCount());
    }

  @Test
  public void canAddCardToHand() {
    deck.createDeck();
    Card removed_card = deck.removeCardFromDeck();
    hand.addCardToHand(new Card(removed_card.getNumber(), removed_card.getSuit()));
    assertEquals(1, hand.handCardCount());
  }
}