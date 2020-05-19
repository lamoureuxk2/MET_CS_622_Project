package test.cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.cards.Fighter;
import main.effects.Effect;
import main.effects.TestEffect;

class FighterTest {
	
	private Fighter testInstance;
	private String NAME = "Fighting John";
	private String DESCRIPTION = "Is very strong";
	private Effect effect = new TestEffect();
	
	@BeforeAll
	void createFighter() {
		testInstance = new Fighter(NAME, DESCRIPTION, effect);
	}

	@Test
	void testFighter() {
		fail("Not yet implemented");
	}

	@Test
	void testAttackFighter() {
		fail("Not yet implemented");
	}

	@Test
	void testAttackPlayer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAttackStregth() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAttackStregth() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDefenseStrength() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDefenseStrength() {
		fail("Not yet implemented");
	}

}
