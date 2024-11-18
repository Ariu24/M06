package arxius_xml.sax;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class LlegirEmpleatSAX {

    public static void main(String[] args) {

        // Define a custom handler to handle SAX events
        class EmpleatSAXHandler extends DefaultHandler {
            private String currentElement = "";
            private String id = "";
            private String nomEmp = "";
            private String cognomEmp = "";
            private String job = "";
            private String edat = "";
            private String alçada = "";

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                // Store the current element name
                currentElement = qName;

                // If we encounter an "empleat" tag, store the id attribute
                if ("empleat".equals(qName)) {
                    id = attributes.getValue("id");
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                // When the "empleat" element ends, print the employee details
                if ("empleat".equals(qName)) {
                    System.out.println("Id = " + id);
                    System.out.println(" * Nom Empleat = " + nomEmp);
                    System.out.println(" * Cognom Empleat = " + cognomEmp);
                    System.out.println(" * Job = " + job);
                    System.out.println(" * Edat = " + edat);
                    System.out.println(" * Alçada = " + alçada);
                    System.out.println();
                }

                // Reset the current element after it's processed
                currentElement = "";
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                // Extract text content from elements and assign it to the corresponding field
                String content = new String(ch, start, length).trim();
                if (content.isEmpty()) {
                    return;  // Skip empty content
                }

                switch (currentElement) {
                    case "nomEmp":
                        nomEmp = content;
                        break;
                    case "cognomEmp":
                        cognomEmp = content;
                        break;
                    case "job":
                        job = content;
                        break;
                    case "edat":
                        edat = content;
                        break;
                    case "alçada":
                        alçada = content;
                        break;
                }
            }
        }

        try {
            // Create a SAXParserFactory and SAXParser
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            // Create an instance of our custom handler
            EmpleatSAXHandler handler = new EmpleatSAXHandler();

            // Parse the XML file using the handler
            File xmlFile = new File("empleats.xml");
            parser.parse(xmlFile, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
