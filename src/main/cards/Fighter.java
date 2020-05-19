/**
 * 
 */
package main.cards;

import main.effects.Effect;
import main.players.*;

/**
 * @author Karl
 *
 */
public class Fighter extends Card {
	
	private int attackStrength;
	private int defenseStrength;

	public Fighter(String name, String desc, Effect e) {
		super(name, desc, e);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Attack another Fighter
	 * @param opponent
	 * @return
	 */
	public int attack(Fighter opponent) {
		return attackStrength - opponent.defenseStrength;
	}
	
	public int attack(Player opponent) {
		return attackStrength;
	}

	public int getAttackStregth() {
		return attackStregth;
	}

	public void setAttackStregth(int attackStregth) {
		this.attackStregth = attackStregth;
	}

	public int getDefenseStrength() {
		return defenseStrength;
	}

	public void setDefenseStrength(int defenseStrength) {
		this.defenseStrength = defenseStrength;
	}

}
