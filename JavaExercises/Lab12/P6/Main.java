/* Sa se afiseze daca toti octetii dintr-un fisier binar sunt diferiti intre ei 
sau nu.
Se vor copia toti octetii din fisier intr-un vector(se va aloca o dimensiune
acoperitoare) si se va aplica algoritmul de la vectori pentru toate numerele
diferite.*/

package JavaExercises.Lab12.P6;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = null;
        String numeF = JOptionPane.showInputDialog("Nume: ");
        final int N = 100;
        int a[] = new int[N];

        try {
            fi = new FileInputStream(numeF);

            for(int i=0; i<N; i++) {
                int cod = fi.read();
                if(cod == -1) {
                    break;
                }
                int nr = cod;
                a[i] = nr;
            }
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        finally {
            fi.close();
        }

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(a[i] == a[j]) {
                    System.out.println("Nu sunt toate valorile diferite");
                    return;
                }
            }
            System.out.println("Toate valorile sunt diferite");
        }
    }
}
