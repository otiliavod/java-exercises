/* Se citeste de la tastatura o propozitie. Sa se afiseze care e cuvantul care apare de cele mai multe ori.*/

package JavaExercises.Lab7.PS7;
import javax.swing.*;
import java.util.*;

public class Cuvinte_2 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        StringTokenizer tk = new StringTokenizer(s);
        
        int n = tk.countTokens();
        int contor[] = new int[n];

        for(int i=0; i<n; i++) {
            contor[i] = 0;
        }

        String cuvinte[] = new String[n];
        for(int i=0; i<n; i++) {
            cuvinte[i] = tk.nextToken();
        }

        for(int i=0; i<n-1; i++) {
            if(contor[i] == -1) {
                continue;
            }
            contor[i] = 1;
            for(int j=i+1; j<n; j++) {
                if((cuvinte[i].compareTo(cuvinte[j]) == 0)) {
                    contor[i]++;
                    contor[j] = -1;
                }
            }
        }

        int indexMaxim = 0;
        int contorMaxim = contor[0];
        for(int i=1; i<n; i++) {
            if(contor[i] > contorMaxim) {
                contorMaxim = contor[i];
                indexMaxim = 1;
            }
        }

        System.out.println("Cel mai frecvent: " + cuvinte[indexMaxim]);
    }    
}
