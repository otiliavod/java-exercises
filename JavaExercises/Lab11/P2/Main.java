/* Se citeste de la tastatura numele unui fisier. Sa se calculeze si afiseze care
vocala apare de cele mai multe ori.*/

package JavaExercises.Lab11.P2;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeF = JOptionPane.showInputDialog("Nume: ");
        String s = "";

        FileReader fr = null;
        BufferedReader bfr = null;

        int numarAparitiiVocala[] = {0, 0, 0, 0, 0};
        int vocala[] = {'a', 'e', 'i', 'o', 'u'};

        try {
            fr = new FileReader(numeF);
            bfr = new BufferedReader(fr);

            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                s = s + linie;
            }
            fr.close();
            bfr.close();
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }

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
