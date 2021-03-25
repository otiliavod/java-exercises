/* Se citeste un numar natural N. Se citesc N numere intregi, care se vor copia
intr-un fisier binar de numere intregi.*/

package JavaExercises.Lab12.PS8;
import java.io.*;
import javax.swing.*;

public class CopiereNumereInFisier {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N:"));
        FileOutputStream fos = null;
        DataOutputStream f = null;

        try {
            fos = new FileOutputStream("numere.dat");
            f = new DataOutputStream(fos);
            for(int i=0; i<N; i++) {
                int nr = Integer.parseInt(JOptionPane.showInputDialog("Nr: "));
                f.writeInt(nr);
            }
            f.close();
            fos.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
