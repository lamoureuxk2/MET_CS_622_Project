package test.players;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.players.Player_Factory;

public class CreatePlayerTest {
	
	private static Player_Factory factory;
	private static final String TEST_PLAYER_NAME = "Test";
	private static final String PLAYER_DIRECTORY = "player_folder";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		factory = new Player_Factory();
	}
	
	@Test
	void testCreate() {
		assertNotNull(factory.createPlayer(TEST_PLAYER_NAME));
		assertNull(factory.createPlayer(TEST_PLAYER_NAME));
		String filename = PLAYER_DIRECTORY + "/" + TEST_PLAYER_NAME + ".player";
		File playerFile = new File(filename);
		assertTrue(playerFile.exists());
		factory.deletePlayer(TEST_PLAYER_NAME);
		assertFalse(playerFile.exists());
	}
	
	
}
