package arxius_xml.exercici;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class LlegirEmpleatDOM {
    public static void main (String[] args) {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                //ara el document es builder.parse 
                Document document = builder.parse(new File("empleats.xml"));
                
                Element arrel = document.getDocumentElement();
                System.out.printf ("element arrel : %s %n", arrel.getNodeName());

                //agafa els elements per el nom de l'etiqueta
                NodeList empleats = document.getElementsByTagName("empleat");
                
                System.out.printf ("Nodes a recòrrer: %d %n", empleats.getLength());
        
                for (int i = 0; i < empleats.getLength(); i++) {
                    Node emple = empleats.item(i);
                    if (emple.getNodeType() == Node.ELEMENT_NODE){
                        Element element = (Element) emple;
                        //imprimeix el id, amb el getAttribute ja que hem assignat el ID com atribut a l'etiqueta del empleat
                        System.out.printf("Id = %s %n", element.getAttribute("id"));

                        //imprimeix el nom                                                                            || serveix per agafar la info entre les claus
                        System.out.printf(" * nom empleat = %s %n",element.getElementsByTagName("nomEmp").item(0).getTextContent());

                        //imprimeix el cognom
                        System.out.printf(" * cognom empleat = %s %n", element.getElementsByTagName("cognomEmp").item(0).getTextContent());

                        //imprimeix el treball
                        System.out.printf(" * job = %s %n", element.getElementsByTagName("job").item(0).getTextContent());

                        //imprimeix l'edad
                        System.out.printf(" * edat = %s %n", element.getElementsByTagName("edat").item(0).getTextContent());

                        //imprimeix l'alçada
                        System.out.printf(" * alçada = %s %n", element.getElementsByTagName("alçada").item(0).getTextContent());                        
                    }
                }
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}
