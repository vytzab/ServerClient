package lt.viko.eif.vytzab.serverClient.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lt.viko.eif.vytzab.serverClient.utilities.Generator;

class NbaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	final void testNba() {
		Nba wnba = new Nba();
		assertNotNull(wnba);
	}

	@Test
	final void testGetPlayers() {
		Nba wnba = new Nba();
		assertNotNull(wnba.getPlayers());
	}

	@Test
	final void testSetPlayers() {
		Nba nba = Generator.createNba();
		Nba wnba = new Nba();
		wnba.setPlayers(nba.getPlayers());
		assertTrue(nba.getPlayers()==wnba.getPlayers());
	}

	@Test
	final void testAddPlayer() {
		Nba wnba = new Nba();
		Player player = new Player();
		player.setFirstName("Line");
		wnba.addPlayer(player);
		assertNotNull(wnba.getPlayers().get(0));
		
	}

	@Test
	final void testToString() {
		Nba nba = Generator.createNba();
		assertTrue(nba.toString().contains("Players:"));
	}

}
