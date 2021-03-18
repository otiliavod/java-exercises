/* Se citeste sub forma de sir de caractere un numar natural foarte lung. Sa se afiseze daca este divizibil cu 3
sau nu. Se va scrie o metoda separata ce are ca parametru de intrare sirul de caractere si care scoate ca 
rezultat valoarea true daca numarul este divizibil cu 3.*/

package JavaExercises.Lab6.PS6;
import javax.swing.*;

public class EsteDivizibilCu3 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");

        boolean este = esteDivizibil(s);
        if(este) {
            System.out.println("Este divizibil cu 3");
        }
        else {
            System.out.println("Nu este divizibil cu 3");
        }
    }

    private static boolean esteDivizibil(String s) {
       int suma = 0;
       for(int i=0; i<s.length(); i++) {
           if(!esteCifra(s.charAt(i))) {
                return false;
           }
           else {
                suma = suma + (int)s.charAt(i) - (int)'0';
           }
       } 
        if(suma % 3 == 0) {
            return true;
        }
        else 
            return false;
    }

    private static boolean esteCifra(char ch) {
        int cod = (int)ch;
        if((cod >= (int)'0') && (cod <= (int)'9')) {
            return true;
        }
        else
        return false;
    }
}
