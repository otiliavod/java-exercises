/* Sa se calculeze media aritmetica a numerelor dintr-un fisier binar de numere
intregi.*/

package JavaExercises.Lab12.PS9;
import java.io.*;
import javax.swing.*;

public class MediaDinFisier {
    public static void main(String[] args) {
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String numeF = JOptionPane.showInputDialog("Nume fisier:");

        try {
            f = new File(numeF);
            long L = f.length(); // lungimea in octeti
            int N = (int)L/4; // numerul de intregi memorati in fisier
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);
            int suma = 0;

            for(int i=0; i<N; i++) {
                int nr = dis.readInt();
                suma = suma + nr;
            }

            double medie = suma/(double)N;
            System.out.println("Media: " + medie);
            dis.close();
            fis.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        } catch(SecurityException se) {
            System.out.println(se);
            System.exit(1);
        }
    }
}
