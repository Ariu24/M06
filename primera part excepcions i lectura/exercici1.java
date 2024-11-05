import java.io.File;
import java.io.IOException;
public class exercici1 {
    public static void main(String[] args) throws IOException {
         //subcarpeta 1
        File dir10 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\subcarpeta1");
        dir10.mkdir();

        //subcarpeta 2
        File dir20 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\subcarpeta2");
        dir20.mkdir();

        //arxiu 1
        File f1 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\" , "file1.txt");
        f1.createNewFile();

        //arxiu 2
        File f2 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\file2.txt");
        f2.createNewFile();

        //arxiu 3
        File f3 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\file3.txt");
        f3.createNewFile(); 

        File f4 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\");
        File[] arxius = f4.listFiles();
        System.out.println(arxius.length);
            for(int i = 0 ; i< arxius.length;i++){
            if(arxius[i].isFile()){
                System.out.println("Hi ha l'arxiu amb nom: " + arxius[i]);
            }else{
                System.out.println("Hi ha el directori amb nom: " + arxius[i]);
            }
        } 
    }
}
