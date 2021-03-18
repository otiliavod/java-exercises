/* Se citeste un sir. Sa se afiseze daca este palindrom (simetric fata de mijloc).*/

package JavaExercises.Lab6.P1;
import javax.swing.*;

public class Palindrom {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        String s1 = "";

        for(int i=s.length()-1; i>=0; i--) {
            s1 = s1 + s.charAt(i);
        }

        if(s.equals(s1)) {
            System.out.println("Este palindrom");
        }
        else {
            System.out.println("Nu este palindrom");
        }
    }
}
