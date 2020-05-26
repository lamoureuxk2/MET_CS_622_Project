package test.cards;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.cards.Card_Factory;
import main.players.Player_Factory;

public class TestCardFactory {
	
	private static Card_Factory factory;
	private static final String TEST_CARD_NAME = "Test";
	private static final String CARD_DIRECTORY = "card_folder";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		factory = new Card_Factory();
	}
	
	@Test
	void testCreate() {
		factory.createCard();
	}

}
