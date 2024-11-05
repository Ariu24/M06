import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class exerciciClase {
    static String f1 = "C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\FitxerDades.dat" ;
    public static void main(String[] args) throws IOException {
        String[] noms = {"Alba","Yago","Ari","Pau","Dani"};
        int[] edads = {20,19,19,19,19};

        //escriure els noms i edads
        writeStream(noms,edads); 
        //Cridem al mètode que llegeix l'array d'enters    
        readStream();
		//readStream(noms,edads);
        
    }
    public static void writeStream(String[] noms, int[]edads) {
		try {
			FileOutputStream fileStr1 = new FileOutputStream(f1);
			
			DataOutputStream str1 = new DataOutputStream(fileStr1); 
			
            for(int i=0; i<noms.length; i++){
                str1.writeInt(edads[i]);  // escrivim l'edat
                str1.writeUTF(noms[i]);  // escrivim el nom
                
            }
			
			str1.close();

			fileStr1.close();

		} catch (FileNotFoundException e) {
			System.out.println("EL FITXER NO EXISTEIX");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    //alternativa
    private static void readStream(String[] noms, int[]edads){
        for(int i = 0 ; i<noms.length;i++){
            System.out.println("Nom: "+ noms[i] + " Edad " + edads[i] );
        }
    }

    private static void readStream() {
		try {
			FileInputStream fileStr1_inp = new FileInputStream(f1);
			DataInputStream str2 = new DataInputStream(fileStr1_inp);

			while (str2.available()>0) {
                int k = str2.readInt();
                String nomString = str2.readUTF();
				
				System.out.println("Nom"+ nomString + "edad " +k);
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
