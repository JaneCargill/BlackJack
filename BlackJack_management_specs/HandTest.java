import org.junit.*;
import BlackJack_management.*;

public class HandTest {

  Hand hand;
  Deck deck;

  @Before
  public void before() {
    hand = new Hand();
  }

  @Test
  public void canAddCardToHand() {
    Card card = deck.removeCardFromDeck();
    hand.addCardToHand(card);
    assertEquals(1, hand.handCardCount());
  }
}