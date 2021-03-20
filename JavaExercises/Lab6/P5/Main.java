/* Se citeste un sir de caractere s1. Sa se construiasca sirul s2, care reprezinta criptarea cu metoda Caesar 
a sirului s1. Se cripteaza doar literele, restul caracterelor se lasa neschimbate. Fiecare litera se va substitui
cu litera aflata la o distanta de 3 litere fata de ea. Astfel, litera A se substituie cu litera D, litera B cu 
litera E, etc. Pentru ultimele 3 litere ale alfabetului avem substitutiile urmatoare: X cu A, Y cu B si Z cu C.*/
package JavaExercises.Lab6.P5;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Sir: ").toUpperCase();
        String s2 = "";

        for(int i=0; i<s1.length(); i++) {
            if((s1.charAt(i) == 'X') || (s1.charAt(i) == 'Y') || (s1.charAt(i) == 'Z')) {
                switch(s1.charAt(i)) {
                    case 'X':
                    s2 = s2 + 'A';
                    break;

                    case 'Y':
                    s2 = s2 + 'B';
                    break;
                                       
                    case 'Z':
                    s2 = s2 + 'C';
                    break;
                }
            }
            else{ 
                s2 = s2 + (char)(s1.charAt(i) + 3);
            }
        }

        System.out.println("Sirul criptat este: " + s2);
    }
}
