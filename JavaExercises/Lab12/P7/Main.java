/* Sa se calculeze si afiseze maximul dintr-un fisier binar de numere intregi.
Numele fisierului se citeste de la tastatura.*/

package JavaExercises.Lab12.P7;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = null;
        String numeF = JOptionPane.showInputDialog("Nume fisier: ");
        int max = 0;

        try {
            fi = new FileInputStream(numeF);

            for(;;) {
                int cod = fi.read();
                if(cod == -1) {
                    break;
                }
                int nr = cod;
                if(nr > max) {
                    max = nr;
                }
            }
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        finally {
            fi.close();
        }
        System.out.println("Maximul: " + max);
    }
}
