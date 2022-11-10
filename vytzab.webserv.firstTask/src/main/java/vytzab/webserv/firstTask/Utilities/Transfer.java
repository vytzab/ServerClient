package vytzab.webserv.firstTask.Utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Used for transferring files
 */
public class Transfer {
	/**
	 * Sends a specified file to buffered output stream
	 * 
	 * @param fileName file name
	 * @param out      socket output stream
	 */
	public void sendFile(String fileName, BufferedOutputStream out) {
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileName));

			byte[] b = new byte[8 * 1024];
			int count;
			while ((count = in.read(b)) != -1) {
				out.write(b, 0, count);
				out.flush();
			}

			System.out.println("File sent");
		} catch (FileNotFoundException ex) {
			System.out.println(String.format("File \"%s\" not found", fileName));
		} catch (IOException ex) {
			System.out.println("Error sending file: " + ex.getMessage());
		}
	}

	/**
	 * Receives a file through buffered input stream
	 * 
	 * @param in  socket input stream
	 * @param out output stream that will be used to write to a file
	 */
	public void receiveFile(BufferedInputStream in, BufferedOutputStream out) {
		try {
			byte[] b = new byte[8 * 1024];

			int count;
			while ((count = in.read(b)) != -1) {
				out.write(b, 0, count);
			}

			System.out.println("File received");
		} catch (IOException ex) {
			System.out.println("Error receiving file: " + ex.getMessage());
		}
	}
}
