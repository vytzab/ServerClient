/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import lt.viko.eif.vytzab.serverClient.entity.Nba;
import lt.viko.eif.vytzab.serverClient.entity.Player;

/**
 * @author Vytautas
 *
 */
class GeneratorTest {

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Generator#createNba()}.
	 * 
	 * Initializes a <Nba> POJO object. Checks if it is not null.
	 */
	@Test
	final void testCreateNba() {
		Nba nbaFinal = Generator.createNba();
		assertNotNull(nbaFinal, "Nba is not null");
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Generator#createPlayerList()}.
	 * 
	 * Initializes a list of <Player>. Checks if the list is not null.
	 */
	@Test
	final void testCreatePlayerList() {
		List<Player> playerListFinal = Generator.createPlayerList();
		assertNotNull(playerListFinal, "List is not null");
	}

}
