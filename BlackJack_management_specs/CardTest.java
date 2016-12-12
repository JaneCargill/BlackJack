import static org.junit.Assert.*;
import org.junit.*;

import BlackJack_management.*;

public class CardTest {

  Card card;
  Card card2;

  @Before
  public void before() {
    card = new Card(NumberType.ACE, SuitType.HEARTS);
    card2 = new Card(NumberType.QUEEN, SuitType.HEARTS);
  }

  @Test
  public void canGetNumber() {
    assertEquals(NumberType.ACE, card.getNumber());
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

  @Test
  public void canGetCardValue() {
    assertEquals(10, card2.cardValue());
  }












}