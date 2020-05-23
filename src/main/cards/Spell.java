/**
 * 
 */
package main.cards;

import main.effects.Effect;

/**
 * @author Karl
 *
 */
public class Spell extends Card {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8219705106960748712L;

	public Spell(String name, String desc, Effect e) {
		super(name, desc, e);
		// TODO Implement some check for null effect, spells cannot have no effect
	}
	
	

}
