/* Se citeste un sir de caractere. Sa se afiseze care vocala apare de cele mai multe ori in sir.*/

package JavaExercises.Lab6.P2;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        int numarAparitiiVocala[] = {0, 0, 0, 0, 0};
        int vocala[] = {'a', 'e', 'i', 'o', 'u'};

        for(int i=0; i<s.length(); i++) {
            if(esteVocala(s.charAt(i))) {
                switch(s.charAt(i)){
                    case 'a':
                    numarAparitiiVocala[0] ++;
                    break;
                    case 'e':
                    numarAparitiiVocala[1] ++;
                    break;
                    case 'i':
                    numarAparitiiVocala[2] ++;
                    break;
                    case 'o':
                    numarAparitiiVocala[3] ++;
                    break;
                    case 'u':
                    numarAparitiiVocala[4] ++;
                    break;
                }
            }
        }

        int max = numarAparitiiVocala[0];
        int poz = 0;
        for(int i=1; i<5; i++) {
            if(numarAparitiiVocala[i] > max) {
                max = numarAparitiiVocala[i];
                poz = i; 
            }
        }
        
        System.out.println("Vocala " + (char)vocala[poz] + " apare de " + max + " ori");
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
