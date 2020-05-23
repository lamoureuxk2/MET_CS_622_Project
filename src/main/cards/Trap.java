package main.cards;

import main.effects.Effect;

public class Trap extends Card {

	/**
	 * 
	 */
	private static final long serialVersionUID = -895406535864396741L;

	public Trap(String name, String desc, Effect e) {
		super(name, desc, e);
		// TODO Implement some check for null effect, Traps cannot have no effect
	}

}
