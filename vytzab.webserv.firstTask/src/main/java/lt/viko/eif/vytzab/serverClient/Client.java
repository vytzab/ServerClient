/**
 * 
 */
package lt.viko.eif.vytzab.serverClient;

import org.xml.sax.SAXException;

import lt.viko.eif.vytzab.serverClient.utilities.SchemaChecker;
import lt.viko.eif.vytzab.serverClient.utilities.Transfer;
import lt.viko.eif.vytzab.serverClient.utilities.Transformer;
import lt.viko.eif.vytzab.serverClient.entity.Nba;

import javax.xml.bind.JAXBException;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Represents client that receives the xml file over network.
 */
public class Client {
	private Socket clientSocket;
	private BufferedOutputStream out;
	private BufferedInputStream in;
	private Transfer transfer;

	/**
	 * Connects to server with specified ip and port address
	 * 
	 * @param ip   server ip address
	 * @param port server port address
	 * @throws IOException
	 */
	public void startConnection(String ip, int port) throws IOException {
		clientSocket = new Socket(ip, port);
		System.out.println(String.format("Connected to %s:%d", ip, port));
		in = new BufferedInputStream(new BufferedInputStream(clientSocket.getInputStream()));
	}

	/**
	 * Receives file from server
	 * 
	 * @param filePath path to file
	 * @throws FileNotFoundException
	 */
	public void receiveFile(String filePath) throws FileNotFoundException {
		transfer = new Transfer();
		out = new BufferedOutputStream(new FileOutputStream(filePath));

		transfer.receiveFile(in, out);
	}

	/**
	 * closes socket connection and input, output buffers
	 */
	public void stopConnection() {
		if (clientSocket.isConnected()) {
			try {
				in.close();
				out.close();
				clientSocket.close();
			} catch (IOException ex) {
				System.out.println("Error stopping connection: " + ex.getMessage());
			}
		}
	}

	public static void main(String[] args) throws IOException, JAXBException, SAXException {
		Client client = new Client();

		try {
			client.startConnection("127.0.0.1", 6666);
			client.receiveFile("playersReceived.xml");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			client.stopConnection();
		}

		try {
			if (SchemaChecker.isXmlValid("players.xml", "nba.xsd")) {
				Nba nba = (Nba) Transformer.transformToPOJO("players.xml", Nba.class);
				System.out.println(nba);
			} else {
				System.out.println("Xml document is not valid");
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Validation error: " + ex.getMessage());
		} catch (JAXBException ex) {
			System.out.println("Jaxb transformation error: " + ex.getMessage());
		}
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

	/**
	 * @return the in
	 */
	public BufferedInputStream getIn() {
		return in;
	}

	/**
	 * @param in the in to set
	 */
	public void setIn(BufferedInputStream in) {
		this.in = in;
	}
	
}
