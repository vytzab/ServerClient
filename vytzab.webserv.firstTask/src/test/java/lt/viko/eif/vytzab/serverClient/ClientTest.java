/**
 * 
 */
package lt.viko.eif.vytzab.serverClient;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Vytautas
 *
 */
class ClientTest {
	Server server = new Server();
	Client client = new Client();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		server.start(6666);
		client.startConnection("127.0.0.1", 6666);
		server.acceptConnection();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
		client.stopConnection();
		server.stop();
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.Client#startConnection(java.lang.String, int)}.
	 */
	@Test
	final void testStartConnection() {
		System.out.println("Test Start");
		assertTrue(client.getClientSocket().isConnected());
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.Client#receiveFile(java.lang.String)}.
	 */
	@Test
	final void testReceiveFile() {
		File file = new File("playersReceived.xml");
		if (file.exists()) {
			file.delete();
		}

		try {
			server.sendFile("players.xml");
		} catch (Exception e) {
			fail("Exception thrown while trying to send file from server side.");
		}

		try {
			client.receiveFile("playersReceived.xml");
		} catch (Exception e) {
			fail("Exception thrown while trying to receive file from client's side.");
		}
//		assertNotNull(file);
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.Client#stopConnection()}.
	 */
	@Test
	final void testStopConnection() {
//		assertTrue(client.getClientSocket().isClosed());
	}
}
