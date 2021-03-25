/* Citim de la tastatura o linie de text. Sa se copieze caracterele din aceasta
linie in fisierul linie.txt, cate un caracter pe fiecare linie a fisierului text.*/

package JavaExercises.Lab12.P1;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter("linie.txt");
            bfw = new BufferedWriter(fw);
            bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Sir: ");
            String s = bfr.readLine();
            bfw.write(s);
            fr = new FileReader(s);

            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                bfw.write(c);
                bfw.newLine();
            }
            fr.close();
            bfw.close();
            bfr.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
