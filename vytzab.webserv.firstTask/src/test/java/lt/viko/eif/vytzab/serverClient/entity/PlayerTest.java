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
class PlayerTest {

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#Player()}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if it is not
	 * null.
	 */
	@Test
	final void testPlayer() {
		Player player = new Player();
		assertNotNull(player);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#Player(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if it is not null.
	 * Checks if the parameters were set on the POJO object.
	 */
	@Test
	final void testPlayerStringStringIntegerStringStringStringString() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertNotNull(player);
		assertNotNull(player.getFirstName());
		assertNotNull(player.getLastName());
		assertNotNull(player.getAge());
		assertNotNull(player.getHeight());
		assertNotNull(player.getWeight());
		assertNotNull(player.getNationality());
		assertNotNull(player.getStatus());
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getFirstName()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct
	 * FirstName parameter value was returned by the get method.
	 */
	@Test
	final void testGetFirstName() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getFirstName() == "Vytautas");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setFirstName(java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * FirstName parameter value was set by the set method.
	 */
	@Test
	final void testSetFirstName() {
		Player player = new Player();
		player.setFirstName("Vytautas");
		assertTrue(player.getFirstName() == "Vytautas");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getLastName()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct
	 * LastName parameter value was returned by the get method.
	 */
	@Test
	final void testGetLastName() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getLastName() == "Zabielskas");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setLastName(java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * LastName parameter value was set by the set method.
	 */
	@Test
	final void testSetLastName() {
		Player player = new Player();
		player.setLastName("Zabielskas");
		assertTrue(player.getLastName() == "Zabielskas");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getAge()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct Age
	 * parameter value was returned by the get method.
	 */
	@Test
	final void testGetAge() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getAge() == 29);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setAge(java.lang.Integer)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * Age parameter value was set by the set method.
	 */
	@Test
	final void testSetAge() {
		Player player = new Player();
		player.setAge(29);
		assertTrue(player.getAge() == 29);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getHeight()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct
	 * Height parameter value was returned by the get method.
	 */
	@Test
	final void testGetHeight() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getHeight() == "180cm");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setHeight(java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * Height parameter value was set by the set method.
	 */
	@Test
	final void testSetHeight() {
		Player player = new Player();
		player.setHeight("180cm");
		assertTrue(player.getHeight() == "180cm");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getWeight()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct
	 * Weight parameter value was returned by the get method.
	 */
	@Test
	final void testGetWeight() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getWeight() == "78kg");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setWeight(java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * Weight parameter value was set by the set method.
	 */
	@Test
	final void testSetWeight() {
		Player player = new Player();
		player.setWeight("78kg");
		assertTrue(player.getWeight() == "78kg");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getNationality()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct
	 * Nationality parameter value was returned by the get method.
	 */
	@Test
	final void testGetNationality() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getNationality() == "Lithuanian");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setNationality(java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * Nationality parameter value was set by the set method.
	 */
	@Test
	final void testSetNationality() {
		Player player = new Player();
		player.setNationality("Lithuanian");
		assertTrue(player.getNationality() == "Lithuanian");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#getStatus()}.
	 * 
	 * Initializes a <Player> POJO object with parameters. Checks if the correct
	 * Status parameter value was returned by the get method.
	 */
	@Test
	final void testGetStatus() {
		Player player = new Player("Vytautas", "Zabielskas", 29, "180cm", "78kg", "Lithuanian", "Active");
		assertTrue(player.getStatus() == "Active");
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.entity.Player#setStatus(java.lang.String)}.
	 * 
	 * Initializes a <Player> POJO object without parameters. Checks if the correct
	 * Status parameter value was set by the set method.
	 */
	@Test
	final void testSetStatus() {
		Player player = new Player();
		player.setStatus("Active");
		assertTrue(player.getStatus() == "Active");
	}
}
