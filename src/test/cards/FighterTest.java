package test.cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import main.cards.Fighter;
import main.effects.Effect;
import main.effects.TestEffect;

class FighterTest {
	
	private Fighter testInstance;
	private String NAME = "Fighting John";
	private String DESCRIPTION = "Is very strong";
	private String OPPONENT_NAME = "Opponent fighter";
	private String OPPONENT_DESCRIPTION = "Is the opponent";
	private int attackStrength = 1000;
	private int defenseStrength = 800;
	private int opponentAttackStrength = 900;
	private int opponentDefenseStrength = 700;
	private Effect effect = new TestEffect();
	
	@BeforeAll
	void createFighter() {
		testInstance = new Fighter(NAME, DESCRIPTION, effect, this.attackStrength, this.defenseStrength);
	}

	@Test
	void testFighter() {
		testInstance.useEffect();
	}

	@Test
	void testAttackFighter() {
		Fighter opp = new Fighter(this.OPPONENT_NAME, this.OPPONENT_DESCRIPTION, effect, this.opponentAttackStrength, this.opponentDefenseStrength);
		int expected = this.attackStrength - this.opponentDefenseStrength;
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
