import java.io.IOException;
import java.io.RandomAccessFile;

public class gatos {
    public static void main(String[] args) throws IOException{
        gatsCrear();
        llegirGats();
        editar();
        llegirGats();
    }
    public static void gatsCrear()throws IOException{
        RandomAccessFile gat= new RandomAccessFile("gat.dat" , "rw");
        String gats[] = {"Rambo","Luna", "Lili", "Tula"};
        StringBuffer gatBuffer = null;
        for(int i = 0; i < gats.length; i++){
            gatBuffer= new StringBuffer (gats[i]);
            gatBuffer.setLength(20);
            gat.writeChars(gatBuffer.toString());
        }
        gat.close();
    }

    public static void llegirGats()throws IOException{
        RandomAccessFile gats = new RandomAccessFile("gat.dat","r");
        char[] gato = new char[20];
        char aux;
        while(gats.getFilePointer()!= gats.length()){
            for(int i = 0; i < gato.length; i++){
                aux = gats.readChar();
                gato[i] = aux;
            }
            System.out.println(new String(gato));
        }
        gats.close();
    }

    public static void editar() throws IOException {
        RandomAccessFile gats = new RandomAccessFile("gat.dat", "rw");
        int numUser = 0;
        gats.seek((2 * 20 )*numUser);
        StringBuffer nom = new StringBuffer("Yagito");
        nom.setLength(20);
        gats.writeChars(nom.toString());
        gats.close();
    }

    public static void escriuSer(){
        

    }
    
    
    
}
