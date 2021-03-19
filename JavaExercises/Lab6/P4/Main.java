/* Se citeste un numar natural N. Se citesc N nume de elevi si pentru fiecare elev se citeste si cate o nota.
Care este numele elevului cu cea mai mare nota?*/

package JavaExercises.Lab6.P4;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        String numeCrt[] = new String[N];
        int nota[] = new int[N];

        for(int i=0; i<N; i++) {
            numeCrt[i] = JOptionPane.showInputDialog("Nume elev: ");
            nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
        }

        int max = nota[0];
        int poz = 0;
        for(int i=1; i<N; i++) {
            if(nota[i] > max) {
                max = nota[i];
                poz = i;
            }
        }

        System.out.println("Numele elevului cu cea mai mare nota este: " + numeCrt[poz] + " si nota este: " + max);
    }
}
