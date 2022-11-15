/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lt.viko.eif.vytzab.serverClient.entity.Nba;
import lt.viko.eif.vytzab.serverClient.entity.Player;

/**
 * @author Vytautas
 *
 */
class GeneratorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Generator#createNba()}.
	 */
	@Test
	final void testCreateNba() {
		Nba nbaFinal = Generator.createNba();
		assertNotNull(nbaFinal, "Nba is not null");
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Generator#createPlayerList()}.
	 */
	@Test
	final void testCreatePlayerList() {
		List<Player> playerListFinal = Generator.createPlayerList();
		assertNotNull(playerListFinal, "List is not null");
	}

}
