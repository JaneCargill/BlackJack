import static org.junit.Assert.*;
import org.junit.*;
import BlackJack_management.*;

public class PlayerTest {

  Player player1;
  Player player2;
  Hand hand;
  Card card;
  Deck deck;

  @Before
  public void before() {
    hand = new Hand();
    deck = new Deck();
    player1  = new Player("Tom");
    player2  = new Player("Judi");
  }

  @Test
  public void canGetName() {
    assertEquals("Tom", player1.getName());
  }

  @Test
  public void canGetHand() {
    deck.createDeck();
    Card removed_card = deck.removeCardFromDeck();
    player1.addCardsToHand(new Card(removed_card.getNumber(), removed_card.getSuit()));
    assertEquals(1, player1.countCardsInHand());
  }
}