
package archivosyflujos;
import java.io.*;
import java.util.Scanner;
public class ArchivosyFlujos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner (System.in);
        FileWriter archivo = new FileWriter("palabrerio.txt");
        PrintWriter ingresar = new PrintWriter (archivo);
        
        for (int i = 0; i < 50; i++) {
            String Palabreriando= "Arbolitodemaisporquenosequemasescribirynecesitoqueestotengaalmenoscincuentacaracteres";
            
            char NuevaPalabra=Palabreriando.charAt(i);
             Palabreriando= a;
            ingresar.println(Palabreriando);
        }
        archivo.close();
    }
    
}
