/**
 * 
 */
package lt.viko.eif.vytzab.serverClient;

import javax.xml.bind.JAXBException;

import lt.viko.eif.vytzab.serverClient.utilities.Generator;
import lt.viko.eif.vytzab.serverClient.utilities.Transfer;
import lt.viko.eif.vytzab.serverClient.utilities.Transformer;
import lt.viko.eif.vytzab.serverClient.entity.Nba;

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
	private Transfer transfer;

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
	 * Accepts a client connection
	 * @throws IOException 
	 */
	public void acceptConnection() throws IOException {
		clientSocket = serverSocket.accept();
		System.out.println("Client connected");
		out = new BufferedOutputStream(clientSocket.getOutputStream());
	}

	/**
	 * Send a file to the client
	 * 
	 * @param fileName file name
	 */
	public void sendFile(String fileName) {
		transfer = new Transfer();
		Nba nba = Generator.createNba();

		try {
			Transformer.transformToXML(fileName, nba);
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
			server.acceptConnection();
			server.sendFile("players.xml");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} 
		finally {
			server.stop();
		}
	}

	/**
	 * @return the serverSocket
	 */
	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	/**
	 * @param serverSocket the serverSocket to set
	 */
	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	/**
	 * @return the clientSocket
	 */
	public Socket getClientSocket() {
		return clientSocket;
	}

	/**
	 * @param clientSocket the clientSocket to set
	 */
	public void setClientSocket(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	/**
	 * @return the out
	 */
	public BufferedOutputStream getOut() {
		return out;
	}

	/**
	 * @param out the out to set
	 */
	public void setOut(BufferedOutputStream out) {
		this.out = out;
	}
	
}