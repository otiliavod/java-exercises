/* Se citeste de la tastatura o propozitie. Sa se copieze toate cuvinte care incep cu vocala intr-un vectori 
de siruri si sa se afiseze acel vector.*/

package JavaExercises.Lab7.P3;
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        StringTokenizer tk = new StringTokenizer(s);
        int n = tk.countTokens();
        String cuvinte[] = new String[n];
        int k = 0;

        for(int i=0; i<n; i++) {
            String cuvantCrt = tk.nextToken();
            if(esteVocala(cuvantCrt.charAt(0))) {
                cuvinte[k] = cuvantCrt;
                k++;
            }
        }

       for(int i=0; i<n; i++) {
           if(cuvinte[i] != null) {
            System.out.println(cuvinte[i]);
           }
       }
    }

    private static boolean esteVocala(char ch) {
        if((ch == 'a') || (ch == 'A') ||
           (ch == 'e') || (ch == 'E') ||
           (ch == 'i') || (ch == 'I') ||
           (ch == 'o') || (ch == 'O') ||
           (ch == 'u') || (ch == 'U')) {
               return true;
           }
        return false;
    }
}
