/* Se citeste numele unui fisier text ce contine mai multe linii. Sa se afiseze
daca toate liniile sunt diferite intre ele sau nu.*/

package JavaExercises.Lab11.PS6;
import java.io.*;
import javax.swing.*;

public class LiniiDiferite {
    public static void main(String[] args) {
        String numeF = JOptionPane.showInputDialog("Nume: ");
        FileReader fr = null;
        BufferedReader bfr = null;

        String s[] = new String[1000];
        int N = 0;

        try {
            fr = new FileReader(numeF);
            bfr = new BufferedReader(fr);

            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                s[N] = linie;
                N ++;
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(s[i].compareTo(s[j]) == 0) {
                    System.out.println("Nu are toate liniile diferite");
                    return;
                }
            }
            System.out.println("Are toate liniile diferite");
        }
    }
}
