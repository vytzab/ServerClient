package lt.viko.eif.vytzab.serverClient.utilities;

import org.xmlunit.validation.Languages;
import org.xmlunit.validation.ValidationResult;
import org.xmlunit.validation.Validator;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Validate xml against schema
 */
public class SchemaChecker {
	private static final String path = "C:\\Users\\Vytautas\\Desktop\\";

	/**
	 * Validates xml file against xsd
	 * 
	 * @param xmlFilePath path to xml file
	 * @param xsdFilePath path to xsd file
	 * @return true if code is valid, false otherwise
	 */
	public static boolean isXmlValid(String xmlFilePath, String xsdFilePath) throws FileNotFoundException {
		if (!new File(path + xmlFilePath).exists()) {
			System.out.println("Xml file doesn't exist");
			throw new FileNotFoundException("Xml file doesn't exist");
		}
		if (!new File(path + xsdFilePath).exists()) {
			System.out.println("Xsd file doesn't exist");
			throw new FileNotFoundException("Xsd file doesn't exist");
		}
		Validator validator = Validator.forLanguage(Languages.W3C_XML_SCHEMA_NS_URI);
		validator.setSchemaSource(new StreamSource(path + xsdFilePath));
		ValidationResult validationResult = validator.validateInstance(new StreamSource(new File(path + xmlFilePath)));
		return validationResult.isValid();
	}
}
