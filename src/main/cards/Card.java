/**
 * 
 */
package main.cards;

import java.io.Serializable;

import main.effects.Effect;

/**
 * @author Karl
 *
 */
public abstract class Card implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4869162516563347897L;
	private String name;
	private String description;
	protected Effect effect = null;
	
	public Card(String name, String desc, Effect e) {
		this.setName(name); this.setDescription(desc);
		setEffect(e);
	}
	
	public void setEffect(Effect e) {
		effect = e;
	}
	
	public void useEffect() {
		if(effect == null) return;
		else effect.execute();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return name + ": " + this.description;
	}
	
}
