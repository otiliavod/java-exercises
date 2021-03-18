/* Se citeste un sir. Sa se afiseze daca in sir sunt numai vocale sau nu. Se va folosi o metoda separata
suntNumaiVocale().*/

package JavaExercises.Lab6.PS5;
import javax.swing.*;

public class Vocale {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        System.out.println("Are numai vocale = " + suntNumaiVocale(s));
    }

    private static boolean suntNumaiVocale(String s) {
        for(int i=0; i<s.length(); i++) {
            if(esteVocala(s.charAt(i)) == false) {
                return false;
            }
        }
        return true;
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
