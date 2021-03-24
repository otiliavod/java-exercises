/* Se citeste de la tastatura numele unui fisier text. Sa se calculeze si afiseze
de cate ori apare caracterul A in fisier.*/

package JavaExercises.Lab11.P1;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeF = JOptionPane.showInputDialog("Nume:");
        FileReader fr = null;
        BufferedReader bfr = null;
        int contor = 0;

        try {
            fr = new FileReader(numeF);
            bfr = new BufferedReader(fr);

            for(;;) {
                String s = bfr.readLine();
                if(s == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(s);
                int n = tk.countTokens();
                for(int i=0; i<n; i++) {
                    if(s.charAt(i) == 'A') {
                        contor ++;
                    }
                }
            }
            fr.close();
            bfr.close();
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("'A' apare de " + contor + " ori");
    }
}
