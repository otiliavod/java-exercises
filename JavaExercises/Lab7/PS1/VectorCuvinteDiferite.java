/* Se citeste de la tastatura un numar natural N. Se citesc de la tastatura N cuvinte, intr-un vector de siruri.
Sa se afiseze daca toate cuvintele sunt diferite intre ele sau nu.*/

package JavaExercises.Lab7.PS1;
import javax.swing.*;

public class VectorCuvinteDiferite {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        String s[] = new String[N];

        for(int i=0; i<N; i++) {
            s[i] = JOptionPane.showInputDialog("cuvant: ");
        }

        for(int i=0; i<N-1; i++) {
            for(int j=1; j<N; j++) {
                if(s[i].compareTo(s[j]) == 0) {
                    System.out.println("Nu sunt toate diferite");
                    return;
                }
            }
            System.out.println("Sunt toate diferite");
        }
    }
}
