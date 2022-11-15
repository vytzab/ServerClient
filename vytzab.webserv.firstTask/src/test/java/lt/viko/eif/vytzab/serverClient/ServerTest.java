/**
 * 
 */
package lt.viko.eif.vytzab.serverClient;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Vytautas
 *
 */
class ServerTest {
	Server server = new Server();
	Client client = new Client();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		server.start(6666);
	}

	/**
	 * Test method for {@link lt.viko.eif.vytzab.serverClient.Server#start(int)}.
	 * 
	 * @throws IOException
	 */
	@Test
	final void testStart() throws IOException {
		assertTrue(server.getServerSocket().getLocalPort() != -1);
		server.getServerSocket().close();
	}

	/**
	 * Test method for {@link lt.viko.eif.vytzab.serverClient.Server#stop()}.
	 */
	@Test
	final void testStop() {
		try {
			client.startConnection("127.0.0.1", 6666);
		} catch (IOException e) {
			fail("Exception thrown while trying to start connection from client side.");
		}

		try {
			server.acceptConnection();
		} catch (IOException e) {
			fail("Exception thrown while trying to accept connection from server side.");
		}
		server.stop();

		assertTrue(server.getClientSocket().isClosed() && server.getServerSocket().isClosed());
	}

	/**
	 * Test method for
	 * {@link lt.viko.eif.vytzab.serverClient.Server#sendFile(java.lang.String)}.
	 */
	@Test
	final void testSendFile() {
		try {
			client.startConnection("127.0.0.1", 6666);
		} catch (IOException e) {
			fail("Exception thrown while trying to start connection from client side.");
		}

		try {
			server.acceptConnection();
		} catch (IOException e) {
			fail("Exception thrown while trying to accept connection from server side.");
		}

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
		client.stopConnection();
		server.stop();

		assertNotNull(file);
	}

}
