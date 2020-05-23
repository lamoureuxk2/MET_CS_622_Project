package test.cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import main.cards.Fighter;
import main.effects.Effect;
import main.effects.TestEffect;

class FighterTest {
	
	private static Fighter testInstance;
	private static String NAME = "Fighting John";
	private static String DESCRIPTION = "Is very strong";
	private static String OPPONENT_NAME = "Opponent fighter";
	private static String OPPONENT_DESCRIPTION = "Is the opponent";
	private static int attackStrength = 1000;
	private static int defenseStrength = 800;
	private static int opponentAttackStrength = 900;
	private static int opponentDefenseStrength = 700;
	private static Effect effect = new TestEffect();
	
	@BeforeAll
	static void createFighter() {
		testInstance = new Fighter(NAME, DESCRIPTION, effect, attackStrength, defenseStrength);
	}

	@Test
	void testFighter() {
		testInstance.useEffect();
	}

	@Test
	void testAttackFighter() {
		Fighter opp = new Fighter(OPPONENT_NAME, OPPONENT_DESCRIPTION, effect, opponentAttackStrength, opponentDefenseStrength);
		int expected = attackStrength - opponentDefenseStrength;
		Assert.assertEquals(expected, testInstance.attack(opp));
	}

	@Test
	void testAttackPlayer() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetAttackStregth() {
		//fail("Not yet implemented");
	}

	@Test
	void testSetAttackStregth() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetDefenseStrength() {
		//fail("Not yet implemented");
	}

	@Test
	void testSetDefenseStrength() {
		//fail("Not yet implemented");
	}

}
