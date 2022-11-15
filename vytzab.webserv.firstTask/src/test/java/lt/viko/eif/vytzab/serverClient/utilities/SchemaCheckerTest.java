/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Vytautas
 *
 */
class SchemaCheckerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.SchemaChecker#isXmlValid(java.lang.String, java.lang.String)}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	final void ifXmlNotPresentThrowsWarning() throws FileNotFoundException {
		try {
			SchemaChecker.isXmlValid(null, "nba.xsd");
			fail();
		} catch (FileNotFoundException e) {
			assertEquals("Xml file doesn't exist", e.getMessage());
		}
	}

	@Test
	final void testIsXsdPresent() {
		try {
			SchemaChecker.isXmlValid("players.xml", null);
			fail();
		} catch (FileNotFoundException e) {
			assertEquals("Xsd file doesn't exist", e.getMessage());
		}
	}

	@Test
	final void testIsXmlValid() throws FileNotFoundException {
		assertTrue(SchemaChecker.isXmlValid("players.xml", "nba.xsd"));
	}

}
