package arxius_xml.exercici;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class LlegirEmpleatDOM {
    public static void main (String[] args) {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(new File ("empleats.xml"));
                Element arrel = document.getDocumentElement();
                System.out.printf ("element arrel : %s %n", arrel.getNodeName());

                NodeList empleats = document.getElementsByTagName("empleat");
                
                System.out.printf ("Nodes a recòrrer: %d %n", empleats.getLength());
        
                for (int i = 0; i < empleats.getLength(); i++) {
                    
                    Node emple = empleats.item(i);
                    if (emple.getNodeType() == Node.ELEMENT_NODE){
                        
                        Element element = (Element) emple;
                        // Print the ID of the employee
                        System.out.printf("Id = %s %n", element.getAttribute("id"));

                        // Print the name of the employee
                        System.out.printf(" * nom empleat = %s %n",element.getElementsByTagName("nomEmp").item(0).getTextContent());

                        // Print the surname of the employee
                        System.out.printf(" * cognom empleat = %s %n", element.getElementsByTagName("cognomEmp").item(0).getTextContent());

                        // Print the age of the employee
                        System.out.printf(" * edat = %s %n", element.getElementsByTagName("edat").item(0).getTextContent());

                        // Print the height of the employee
                        System.out.printf(" * alçada = %s %n", element.getElementsByTagName("alçada").item(0).getTextContent());

                        //prin the job of the employee
                        System.out.printf(" * job = %s %n", element.getElementsByTagName("job").item(0).getTextContent());
                    }
                }
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}
