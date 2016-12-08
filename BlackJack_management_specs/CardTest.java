import static org.junit.Assert.*;
import org.junit.*;

import BlackJack_management.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(NumberType.ACE, SuitType.HEARTS);
  }

  @Test
  public void canGetNumber() {
    assertEquals(NumberType.ACE, card.getNumber());
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

  // @Test
  // public void canGetValue() {
  //   assertEquals(SuitType.HEARTS + NumberType.ACE, card.getValue());
  // }










}