package arxius_xml.exercici;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;
import java.util.ArrayList;

public class CrearEmpleatDOM {

    public static void main(String[] args) throws Exception {
        // crea l'array
        ArrayList<Employee> empleats = new ArrayList<Employee>();
        empleats.add(new Employee(1, "Ana", "Rebollo", 34, 178.0, "Enginyera Tecnica"));
        empleats.add(new Employee(2, "Sandra", "Fernandez", 55, 165.0, "Cap"));
        empleats.add(new Employee(3, "Juan", "Doe", 19, 190.0, "Practiques"));

        //inicialitzar el document xml
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "empleats", null);
            document.setXmlVersion("1.0");
    
            // for empleats per escriure cadascun dels empleatsd
            for (Employee emp : empleats) {
                // Create the <empleat> element
                Element arrel = document.createElement("empleat");
                //para que en la etiqueta arrrel aparezca el id  ex: <empleat id="1">
                arrel.setAttribute("id", Integer.toString(emp.getIdeEmp()));
                // Append the employee element to the root document element
                document.getDocumentElement().appendChild(arrel);
                // afegeix els child al element empleat creat al Element Arrel
                createElement("nomEmp", emp.getName(), arrel, document);
                createElement("cognomEmp", emp.getSurname(), arrel, document);
                createElement("job", emp.getJob(), arrel, document);
                createElement("edat", Integer.toString(emp.getAge()), arrel, document);
                createElement("alçada", Double.toString(emp.getHeight()), arrel, document);
            }
            // escriure el arxiu xml al document indicat
            Source source = new DOMSource(document);
            Result result = new StreamResult(new FileWriter("C:\\Users\\ariad\\M06\\arxius_xml\\exercici\\empleats.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xalan}indent-amount", "4");
            transformer.transform(source, result);
    
            System.out.println("arxiu creat");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }   
    }
    // Helper method to create XML elements with a value
    public static void createElement(String elementName, String value, Element parent, Document document) {
        Element element = document.createElement(elementName);
        Text textNode = document.createTextNode(value);
        element.appendChild(textNode);
        parent.appendChild(element);
    }
}
