/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lt.viko.eif.vytzab.serverClient.Client;
import lt.viko.eif.vytzab.serverClient.Server;

/**
 * @author Vytautas
 *
 */
class TransferTest {
	Server server = new Server();
	Client client = new Client();

	/**
	 * Starts up the server on port 6666. Connects the client.
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		server.start(6666);
		client.startConnection("127.0.0.1", 6666);
	}

	/**
	 * Stops the connection from client's side. Stops the server.
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		client.stopConnection();
		server.stop();
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Transfer#sendFile(java.lang.String, java.io.BufferedOutputStream)}.
	 * 
	 * Checks if the file is sent.
	 * 
	 * @throws Exception
	 */
	@Test
	final void testSendFile() {
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

		assertNotNull(file);
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Transfer#receiveFile(java.io.BufferedInputStream, java.io.BufferedOutputStream)}.
	 * 
	 * Checks if the file is received.
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

		assertNotNull(file);
	}

}
