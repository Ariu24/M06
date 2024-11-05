import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class exempleApunts {

	static String f1 = "C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\hola2.dat" ;

	public static void main(String[] args) {
		
		int[] ints = {128,250,430,520,820};
	
    //Cridem al mètode que escriu l'array d'enters 
		writeStream(ints); 
	
    //Cridem al mètode que llegeix l'array d'enters    
		readStream();
	}

	public static void writeStream(int[] ints) {
		try {
			FileOutputStream fileStr1 = new FileOutputStream(f1);
			
			DataOutputStream str1 = new DataOutputStream(fileStr1); 
			
			for (int j:ints) {
				str1.writeInt(j);
			}
			
			str1.close();

			fileStr1.close();

		} catch (FileNotFoundException e) {
			System.out.println("EL FITXER NO EXISTEIX");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readStream() {
		try {
			FileInputStream fileStr1_inp = new FileInputStream(f1);
			
			DataInputStream str2 = new DataInputStream(fileStr1_inp);
			
            int i = 0;

			while (str2.available()>0) {
				int k = str2.readInt();
				System.out.println("el nombre contingut a la posició ["+ i + "] de l'array és: " +k);
                i++;
			}

			str2.close();

			fileStr1_inp.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("EL FITXER NO EXISTEIX");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}    
}
