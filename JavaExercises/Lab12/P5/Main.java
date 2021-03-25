/* Sa se calculeze cate valori nule sunt intr-un fisier binar de octeti, al carui
nume se citeste de la tastatura.*/

package JavaExercises.Lab12.P5;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fi = null;
        String numeF = JOptionPane.showInputDialog("Nume: ");
        int contor = 0;

        try {
            fi = new FileInputStream(numeF);
            for(;;) {
                int cod = fi.read();
                if(cod == -1) {
                    break;
                }
                byte b = (byte)cod;
                if(b == 0) {
                    contor ++;
                }
            }
            fi.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Numarul de valori nule: " + contor);
    }
}
