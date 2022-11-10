/**
 * 
 */
package vytzab.webserv.firstTask;

import javax.xml.bind.JAXBException;

import vytzab.webserv.firstTask.Utilities.Generator;
import vytzab.webserv.firstTask.Utilities.Transfer;
import vytzab.webserv.firstTask.Utilities.Transformer;
import vytzab.webserv.firstTask.nba.Nba;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Represents server that sends the xml file over network.
 */
public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private BufferedOutputStream out;
	private final Transfer transfer;

	public Server() {
		this.transfer = new Transfer();
	}

	/**
	 * Starts a tcp server, listens for a client connection and then sends a file to
	 * the client
	 * 
	 * @param port server port to run on
	 * @throws IOException
	 */
	public void start(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		System.out.println("Server started on port: " + port);
		clientSocket = serverSocket.accept();
		System.out.println("Client connected");
		out = new BufferedOutputStream(clientSocket.getOutputStream());
	}

	/**
	 * Closes server connection
	 */
	public void stop() {
		try {
			out.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException ex) {
			System.out.println("Error stopping server: " + ex.getMessage());
		}
	}

	/**
	 * Send a file to the client
	 * 
	 * @param fileName file name
	 */
	public void sendFile(String fileName) {
		Nba nba = Generator.createNba();

		try {
			Transformer.javaToXml("players.xml", nba);
		} catch (JAXBException ex) {
			System.out.println("Jaxb transformation error" + ex.getMessage());
			return;
		}

		transfer.sendFile(fileName, out);
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server();

		try {
			server.start(6666);
			server.sendFile("players.xml");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			server.stop();
		}
	}
}