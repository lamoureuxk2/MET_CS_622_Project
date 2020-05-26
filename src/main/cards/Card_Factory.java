package main.cards;

import java.util.*;

import main.effects.TestEffect;

import java.io.*;

public class Card_Factory {
	
	private static final String CARD_DIRECTORY = "card_folder";
	private static Card_Factory factory;

	public static void main(String[] args) {
		factory = new Card_Factory();
		factory.createCard();
	}
	
	public Card createCard() {
		Scanner input = new Scanner(System.in);
		File card_file = null;
		String cardName = null;
		Card card = null;
		String cardTypeChoice;
		
		//Choose Spell, Fighter, or Trap
		while(true) {
			System.out.println("Choose Fighter (f), Spell (s), or Trap(t)");
			String choice = input.nextLine();
			if(choice.equals("f")) {
				cardTypeChoice = "fighter";
				break;
			}
			else if(choice.equals("s")) {
				cardTypeChoice = "spell";
				break;
			}
			else if(choice.equals("t")) {
				cardTypeChoice = "trap";
				break;
			}
			else {
				System.out.println("Invalid choice");
				input.reset();
			}
		}
		
		//Create valid name for the card
		while(true) {
			System.out.println("Enter a name for the card:");
			cardName = input.nextLine();
			input.reset();
			
			String filename = CARD_DIRECTORY + "/" + cardName + "." + cardTypeChoice;
			card_file = new File(filename);
			
			if(card_file.exists()) {
				System.out.println("Card of that name already exists");
				continue;
			}
			else {
				break;
			}
		}
		
		//Call proper method for subclass of card
		if(cardTypeChoice.equals("fighter")) {
			card = createFighterObject(input, cardName);
		}
		else if(cardTypeChoice.equals("spell")) {
			card = createSpellObject(input, cardName);
		}
		else if(cardTypeChoice.equals("trap")) {
			card = createTrapObject(input, cardName);
		}
		else {
			System.out.println("cardTypeChoice is " + cardTypeChoice + ", that is an error");
			System.exit(1);
		}
		
		FileOutputStream f;
		try {
			f = new FileOutputStream(card_file);
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(card);
			
			o.close();
			f.close();
			
			System.out.println(card + " created!");
			
			return card;
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			input.close();
		}
		
		
		
		return null;
	}
	
	public void deleteCard(String cardName) {
		String filename = CARD_DIRECTORY + "/" + cardName + ".card";
		File file = new File(filename);
		if(file.exists()) {
			file.delete();
			System.out.println(cardName + " deleted!");
		}
		else {
			System.out.println(cardName + " does not exist, nothing to delete!");
		}
	}
	
	//TODO Enter code for adding Effects
	
	private Fighter createFighterObject(Scanner input, String name) {
		System.out.println("Enter description: ");
		String desc = input.nextLine();
		input.reset();
		
		int att;
		int def;
		
		//Enter valid attack strength
		while(true) {
			try {
				System.out.println("Enter attack strength (int):");
				att = input.nextInt();
				break;
			}catch(InputMismatchException e) {
				input.reset();
				System.out.println("Must enter an int");
			}
		}
		
		//enter valid defense strength
		while(true) {
			try {
				System.out.println("Enter defense strength (int):");
				def = input.nextInt();
				break;
			}catch(InputMismatchException e) {
				input.reset();
				System.out.println("Must enter an int");
			}
		}
		
		return new Fighter(name, desc, new TestEffect(), att, def);
	}
	
	private Spell createSpellObject(Scanner input, String name) {
		System.out.println("Enter description: ");
		String desc = input.nextLine();
		input.reset();
		return new Spell(name, desc, new TestEffect());
	}
	
	private Trap createTrapObject(Scanner input, String name) {
		System.out.println("Enter description: ");
		String desc = input.nextLine();
		input.reset();
		return new Trap(name, desc, new TestEffect());
	}

}
