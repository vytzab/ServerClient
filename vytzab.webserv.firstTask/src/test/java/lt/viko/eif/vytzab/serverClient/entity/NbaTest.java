package lt.viko.eif.vytzab.serverClient.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lt.viko.eif.vytzab.serverClient.utilities.Generator;

/**
 * @author Vytautas
 *
 */
class NbaTest {

	/**
	 * Initializes a <Nba> POJO object. Checks if it is not null.
	 */
	@Test
	final void testNba() {
		Nba wnba = new Nba();
		assertNotNull(wnba);
	}

	/**
	 * Initializes a <Nba> POJO object. Checks if the <Player> list is not null.
	 */
	@Test
	final void testGetPlayers() {
		Nba wnba = new Nba();
		assertNotNull(wnba.getPlayers());
	}

	/**
	 * Initializes a <Nba> POJO object. Generates another <Nba> POJO object with
	 * players. Checks if the generated players are set on the empty <Nba> object.
	 */
	@Test
	final void testSetPlayers() {
		Nba nba = Generator.createNba();
		Nba wnba = new Nba();
		wnba.setPlayers(nba.getPlayers());
		assertTrue(nba.getPlayers() == wnba.getPlayers());
	}

	/**
	 * Initializes a <Nba> POJO object. Creates a new <Player> POJO object. Adds the
	 * player to the <Nba> POJO object. Checks if the player was added successfully.
	 */
	@Test
	final void testAddPlayer() {
		Nba wnba = new Nba();
		Player player = new Player();
		player.setFirstName("Line");
		wnba.addPlayer(player);
		assertNotNull(wnba.getPlayers().get(0));

	}
}
