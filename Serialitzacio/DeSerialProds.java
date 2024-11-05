import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialProds { 

	public static void main(String[] args) {
		
		ObjectInputStream deserializador = null;
//		Object listaProductes = null;
		
		try {
		  deserializador = new ObjectInputStream(
                                  new FileInputStream("ProdsSer.dat"));
		  
		  Productes[] listaProductes = (Productes[])deserializador.readObject();
		  
		  for(Productes p:listaProductes) {
			  System.out.println(p);
		  }
		  
		  deserializador.close();  

		} catch (FileNotFoundException fnfe ) {
		  fnfe.printStackTrace();
		} catch (IOException ioe) { 
		  ioe.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 		
	}
}