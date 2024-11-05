import java.io.File;
import java.io.IOException;
public class prova{
    public static void main(String[] args) throws IOException{
        //file es cualsevol cosa que es pugi considerar un fitxer o un directori
        //crear un fitxer nou   METODE 1
        File f1 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\fitxer1.txt");
        f1.createNewFile();

        //crear un fitxer nou   METODE 2
        String dir1 = "C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\";
        File f2 = new File(dir1, "file2.txt");
        f2.createNewFile();

        //crear un fitxer nou   METODE 3
        File f3 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\" , "file3.txt");
        f3.createNewFile();

        //eliminar un fitxer
        f3.delete();

        //canviar el nom a un fitxer
        f2.renameTo(new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\arxiu.txt"));


        //creacio d'una subcarpeta 
        File dir10 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\subcarpeta1");
        dir10.mkdir();





        File f4 = new File("C:\\Users\\ariad\\OneDrive\\Escitorio\\M6 pruebas");
        //list .length et dona el nombre d'arxius que hi ha al directori
        String[] arxius = f4.list();


        File f5 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas");
        File[] arx = f5.listFiles();
    }
}