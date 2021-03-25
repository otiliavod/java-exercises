/* Sa se afiseze daca toate numere dintr-un fisier binar de numere intregi sunt
in progresie aritmetica sau nu. Numele fisierului se va citi de la tastatura.*/

package JavaExercises.Lab12.P8;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fi = null;
        String numeF = JOptionPane.showInputDialog("Nume fisier: ");
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
            fi.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        int r = a[1] - a[0];
        boolean sunt = false;
        for(int i=0; i<N-1; i++) {
            for(int j=i; j<N; j++) {
                if((a[j] - a[i]) == r) {
                    sunt = true;
                }
            }
        }

        if(sunt) {
            System.out.println("Sunt in progresie artimetica");
        }
        else {
            System.out.println("Nu sunt in progresie aritmetica");
        }
    }
}
