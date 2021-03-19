/* Se citeste de la tastatura un sir s1. Sa se construiasca sirul s2, care contine toate vocalele din sirul s1.*/

package JavaExercises.Lab6.P3;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Sir: ");
        String s2 = "";

        for(int i=0; i<s1.length(); i++) {
            if(esteVocala(s1.charAt(i))) {
                s2 = s2 + s1.charAt(i);
            }
        }

        System.out.println("Sirul de vocale este: " + s2);
    }

    private static boolean esteVocala(char ch) {
        if((ch == 'a') || (ch == 'A') ||
           (ch == 'e') || (ch == 'E') ||
           (ch == 'i') || (ch == 'I') ||
           (ch == 'o') || (ch == 'O') ||
           (ch == 'u') || (ch == 'U')) {
               return true;
           }
        else 
        return false;
    }
}
