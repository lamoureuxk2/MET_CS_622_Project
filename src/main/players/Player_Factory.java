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
		File player_file = null;
		Player player = null;
		
		while(true) {
			System.out.println("Enter a name for the player:");
			String name = input.nextLine();
			player = new Player(name);
			
			String filename = PLAYER_DIRECTORY + "/" + name + ".player";
			player_file = new File(filename);
			
			if(player_file.exists()) {
				System.out.println("Player of that name already exists");
				continue;
			}
			else {
				break;
			}
		
		}
		
		FileOutputStream f;
		try {
			f = new FileOutputStream(player_file);
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(player);
			
			o.close();
			f.close();
			
			System.out.println(player + " created!");
			
			return player;
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			input.close();
		}
		
		
		
		return null;
	}
	
	public Player createPlayer(String name) {
		File player_file = null;
		Player player = null;
		String filename = PLAYER_DIRECTORY + "/" + name + ".player";
		player_file = new File(filename);
		
		if(player_file.exists()) {
			System.out.println("Player of that name already exists");
			return null;
		}
		else {
			player = new Player(name);
			FileOutputStream f;
			try {
				f = new FileOutputStream(player_file);
				ObjectOutputStream o = new ObjectOutputStream(f);
				
				o.writeObject(player);
				
				o.close();
				f.close();
				
				System.out.println(player + " created!");
				
				return player;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		
	}
	
	public void deletePlayer(String playerName) {
		String filename = PLAYER_DIRECTORY + "/" + playerName + ".player";
		File file = new File(filename);
		if(file.exists()) {
			file.delete();
			System.out.println(playerName + " deleted!");
		}
		else {
			System.out.println(playerName + " does not exist, nothing to delete!");
		}
	}

}
