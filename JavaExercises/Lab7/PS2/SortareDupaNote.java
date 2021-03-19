/* Se citeste de la tastatura un numar natual N. Se citesc de la tastatura N nume de elevi si nota fiecaruia
dintre ei. Sa se afiseze clasamentul de elevi(sortare crescatoare dupa note).*/

package JavaExercises.Lab7.PS2;
import javax.swing.*;

public class SortareDupaNote {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        String nume[] = new String[N];
        int nota[] = new int[N];

        for(int i=0; i<N; i++) {
            nume[i] = JOptionPane.showInputDialog("Nume: ");
            nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
        }

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(nota[i] > nota[j]) {
                    int temp = nota[i];
                    nota[i] = nota[j];
                    nota[j] = temp;
                    String aux = nume[i];
                    nume[i] = nume[j];
                    nume[j] = aux;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println(nume[i] + ":" + nota[i]);
        }
    }
}
