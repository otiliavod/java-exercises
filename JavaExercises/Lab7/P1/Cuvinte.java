/* Se citeste un numar natural N de la tastatura. Se citesc N cuvinte intr-un vector de siruri. Sa se afiseze
cuvantul de lungime maxima.*/

package JavaExercises.Lab7.P1;
import javax.swing.*;

public class Cuvinte {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        String s[] = new String[N];

        for(int i=0; i<N; i++) {
            s[i] = JOptionPane.showInputDialog("cuvant: ");
        }

        String cuvantMax = "";
        int lMax = 0;

        for(int i=0; i<N; i++) {
            String cuvantCrt = s[i];
            int lCrt = cuvantCrt.length();
            if(lCrt > lMax) {
                lMax = lCrt;
                cuvantMax = cuvantCrt;
            }
        }

        System.out.println("Cuvantul de lungime maxima: " + cuvantMax); 
    }
}
