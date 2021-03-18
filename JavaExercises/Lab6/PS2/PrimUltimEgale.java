/* Se citeste un sir. Sa se afiseze daca primul caracter este egal cu ultimul caracter.*/

package JavaExercises.Lab6.PS2;
import javax.swing.*;

public class PrimUltimEgale {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir = ");
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            System.out.println("Primul caracter este egal cu ultimul caracter");
        }
        else {
            System.out.println("Primul caracter este diferit de ultimul caracter");
        }
    }
}
