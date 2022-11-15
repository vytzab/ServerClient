/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lt.viko.eif.vytzab.serverClient.entity.Nba;

/**
 * @author Vytautas
 *
 */
class TransformerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Transformer#transformToXML(java.lang.String, java.lang.Object)}.
	 * 
	 * @throws JAXBException
	 * @throws FileNotFoundException
	 */
	@Test
	final void testJavaToXml() throws JAXBException, FileNotFoundException {
		Nba nba = Generator.createNba();
		String filename = "test.xml";
		Transformer.transformToXML(filename, nba);
		File file = new File(filename);
		Scanner myReader = new Scanner(file);
		String data = new String();
		while (myReader.hasNextLine()) {
			data = data + "\n" + myReader.nextLine();
//			System.out.println(data);
		}
		myReader.close();
		assertNotNull(data);
	}

	/**
	 * Test method for
	 * {@link vytzab.webserv.firstTask.Utilities.Transformer#transformToPOJO(java.lang.String, java.lang.Class)}.
	 * 
	 * @throws JAXBException
	 */
	@Test
	final void testXmlToJava() throws JAXBException {
		Nba nba = (Nba) Transformer.transformToPOJO("test.xml", Nba.class);
//		System.out.println(nba);
		assertNotNull(nba.getPlayers().get(1));
	}

}
