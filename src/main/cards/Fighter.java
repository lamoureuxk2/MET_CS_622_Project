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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2071803320340845168L;
	private int attackStrength;
	private int defenseStrength;

	public Fighter(String name, String desc, Effect e, int att, int def) {
		super(name, desc, e);
		this.attackStrength = att; this.defenseStrength = def;
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
		return attackStrength;
	}

	public void setAttackStregth(int attackStregth) {
		this.attackStrength = attackStregth;
	}

	public int getDefenseStrength() {
		return defenseStrength;
	}

	public void setDefenseStrength(int defenseStrength) {
		this.defenseStrength = defenseStrength;
	}

}
