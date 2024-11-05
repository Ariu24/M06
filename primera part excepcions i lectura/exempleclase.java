import java.io.*;
public class exempleclase {
    public static void main(String [ ] args)
    {
        FileInputStream origen = null;
        FileOutputStream desti = null;
        File f1 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\" , "file1.txt");
        File f2 = new File("C:\\Users\\ariad\\OneDrive\\Escritorio\\M6 pruebas\\" , "file3.txt");
    
        try
        {
            origen = new FileInputStream(f1);
            desti = new FileOutputStream(f2);
            
            int c;
            while ((c = origen.read( )) != -1) {
                desti.write((byte)c);
            }
            
        }
        catch (IOException er)
        {
            System.out.println("Excepció de fluxos " 
            + er.getMessage( ));
        }
        finally {
            try 
            {
                origen.close( );
                desti.close( );
            }
            catch (IOException er)
            {
                er.printStackTrace( );
            }
        }
    }
}
