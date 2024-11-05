//exercici resolt de classe
import java.io.File;
import java.io.IOException;
public class clase {
    public static void main(String[] args) throws IOException{
        File f5 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\");
        File [] arxius = f5.listFiles();
        for(File f : arxius){
            System.out.println("Al directori: "+ f.getParent());
            System.out.println("Hi ha " + (f.isDirectory()?"un directori ":" un fitxer ") + " anomenat " +  f.getName());
        }
    }
}
