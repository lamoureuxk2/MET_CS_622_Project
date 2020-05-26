package main.players;

import java.util.*;
import java.io.*;

public class Player_Factory {
	
	private static final String PLAYER_DIRECTORY = "player_folder";
	private static Player_Factory factory;

	public static void main(String[] args) {
		factory = new Player_Factory();
		factory.createPlayer();
	}
	
	public Player createPlayer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name for the player:");
		String name = input.nextLine();
		Player player = new Player(name);
		
		String filename = PLAYER_DIRECTORY + "/" + name + ".player";
		
		FileOutputStream f;
		try {
			f = new FileOutputStream(new File(filename));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(player);
			
			o.close();
			f.close();
			
			return player;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			input.close();
		}
		
		
		
		return null;
	}
	
	public void deletePlayer(String playerName) {
		
	}

}
