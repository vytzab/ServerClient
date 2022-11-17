/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Vytautas
 *
 */
class RecordTest {

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#Record()}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if it is not
	 * null.
	 */
	@Test
	final void testRecord() {
		Record record = new Record();
		assertNotNull(record);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#getGamesPlayed()}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if the correct
	 * FirstName parameter value was returned by the get method.
	 */
	@Test
	final void testGetGamesPlayed() {
		Record record = new Record();
		record.setGamesPlayed(20);
		assertTrue(record.getGamesPlayed() == 20);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#setGamesPlayed(int)}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if the correct
	 * FirstName parameter value was set by the set method.
	 */
	@Test
	final void testSetGamesPlayed() {
		Record record = new Record();
		record.setGamesPlayed(20);
		assertTrue(record.getGamesPlayed() == 20);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#getWins()}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if the correct
	 * Wins parameter value was returned by the get method.
	 */
	@Test
	final void testGetWins() {
		Record record = new Record();
		record.setWins(20);
		assertTrue(record.getWins() == 20);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#setWins(int)}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if the correct
	 * Wins parameter value was set by the set method.
	 */
	@Test
	final void testSetWins() {
		Record record = new Record();
		record.setWins(20);
		assertTrue(record.getWins() == 20);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#getLosses()}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if the correct
	 * Losses parameter value was returned by the get method.
	 */
	@Test
	final void testGetLosses() {
		Record record = new Record();
		record.setLosses(20);
		assertTrue(record.getLosses() == 20);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Record#setLosses(int)}.
	 * 
	 * Initializes a <Record> POJO object without parameters. Checks if the correct
	 * Losses parameter value was set by the set method.
	 */
	@Test
	final void testSetLosses() {
		Record record = new Record();
		record.setLosses(20);
		assertTrue(record.getLosses() == 20);
	}
}
