/**
 * 
 */
package main.players;

import main.cards.*;

import java.io.Serializable;
import java.util.*;

/**
 * @author Karl
 *
 */
public class Player implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -160009562585907820L;
	/**
	 * 
	 */
	private final String name;
	private int lifePoints;
	private ArrayList<Card> hand = new ArrayList<>();
	private ArrayList<Card> deck = new ArrayList<>();
	private ArrayList<Fighter> fighters = new ArrayList<>();
	private ArrayList<Spell> spells = new ArrayList<>();
	private ArrayList<Trap> traps = new ArrayList<>();
	
	public Player(String name) {
		this.name = name;
	}
	
	public void drawACard() {
		hand.add(deck.remove(0));
	}
	
	public ArrayList<Fighter> getFighters(){
		fighters.clear();
		for(Card c : hand) {
			if(c instanceof Fighter) {
				fighters.add((Fighter)c);
			}
		}
		return fighters;
	}
	
	public ArrayList<Spell> getSpells(){
		spells.clear();
		for(Card c : hand) {
			if(c instanceof Spell) {
				spells.add((Spell)c);
			}
		}
		return spells;
	}
	
	public ArrayList<Trap> getTraps(){
		traps.clear();
		for(Card c : hand) {
			if(c instanceof Trap) {
				traps.add((Trap)c);
			}
		}
		return traps;
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	public void decreaseLP(int pts) {
		this.lifePoints -= pts;
	}
	
	public void increaseLP(int pts) {
		this.lifePoints += pts;
	}
	
	@Override
	public String toString() {
		return "Player: " + name;
		
	}

}
