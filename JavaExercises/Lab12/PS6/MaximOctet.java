/* Sa se calculeze maximul dintr-un fisier binar de octeti. Numele fisierului
se citeste de la tastatura.*/

package JavaExercises.Lab12.PS6;
import java.io.*;
import javax.swing.*;

public class MaximOctet {
    public static void main(String[] args) {
        FileInputStream fi = null;
        String numeF = JOptionPane.showInputDialog("Nume: ");
        byte max = 0;

        try {
            fi = new FileInputStream(numeF);

            for(;;) {
                int cod = fi.read();
                if(cod == -1) {
                    break;
                }
                byte b = (byte)cod;
                if(b > max) {
                    max = b;
                }
            }
            fi.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Maxim: " + max);
    }
}
