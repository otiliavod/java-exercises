/* Se citeste un numar natual N. Se citesc N nume de elevi. Care este numele elevului care este ultimul la
catalog?*/

package JavaExercises.Lab6.PS8;
import javax.swing.*;

public class UltimLaCatalog {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N= "));
        String numeCrt;
        String numeUltimLaCatalog = JOptionPane.showInputDialog("Nume: ");

        for(int i=1; i<N; i++) {
            numeCrt = JOptionPane.showInputDialog("Nume: ");
            if(numeCrt.compareTo(numeUltimLaCatalog) > 0) {
                numeUltimLaCatalog = numeCrt;
            }
        }

        System.out.println("Ultimul nume = " + numeUltimLaCatalog);
    }
}
