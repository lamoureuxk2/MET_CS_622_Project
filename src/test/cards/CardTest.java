package test.cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.cards.Card;
import main.cards.Fighter;
import main.cards.Spell;
import main.effects.Effect;
import main.effects.TestEffect;

class CardTest {

	private static Card testInstance;
	private static String NAME = "example spell";
	private static String DESCRIPTION = "Is very magic";
	private static Effect effect = new TestEffect();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testInstance = new Spell(NAME, DESCRIPTION, effect);
	}

	@Test
	void testCard() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEffect() {
		fail("Not yet implemented");
	}

	@Test
	void testUseEffect() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDescription() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDescription() {
		fail("Not yet implemented");
	}

}
