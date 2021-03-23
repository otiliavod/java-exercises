/* Sa se afiseze daca primul caracter dintr-un fisier este egal cu ultimul.*/

package JavaExercises.Lab11.PS2;
import java.io.*;

public class PrimulSiUltimulCaracter {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("date.txt");
            int cod = fr.read();
            char primul = (char)cod;

            cod = fr.read();
            char ultimul = (char)cod;

            for(;;) {
                cod = fr.read();
                if(cod == -1) {
                    break;
                }
                ultimul = (char)cod;
            }
            fr.close();
            if(primul == ultimul) {
                System.out.println("Sunt egale");
            }
            else {
                System.out.println("Nu sunt egale");
            }  
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
