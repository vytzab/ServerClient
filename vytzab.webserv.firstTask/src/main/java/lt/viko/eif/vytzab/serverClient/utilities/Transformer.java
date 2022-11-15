/**
 * 
 */
package lt.viko.eif.vytzab.serverClient.utilities;

import javax.xml.bind.*;
import java.io.*;

/**
 * Represents the Transformer. Responsible for marshalling and unmarshalling.
 */
public class Transformer {
	private static JAXBContext jaxbContext;

	/**
	 * Transforms POJO objects to XML and outputs them to a file.
	 * 
	 * @param fileName specifies the output file.
	 * @param object   specifies the POJO object to be transformed to XML.
	 * @throws JAXBException - This is the root exception class for all JAXB
	 *                       exceptions.
	 */
	public static void transformToXML(String fileName, Object object) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(object.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(object, new File(fileName));
	}

	/**
	 * Reads a XML inputFile and transforms it into a POJO object.
	 * 
	 * @param filePath specifies which file to read.
	 * @param tClass   class to convert to
	 * @param <T>      any type
	 * @return specified tClass object with data
	 * @throws JAXBException - This is the root exception class for all JAXB
	 *                       exceptions.
	 */
	public static <T> Object transformToPOJO(String filePath, Class<T> tClass) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(tClass);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(new File(filePath));
	}
}