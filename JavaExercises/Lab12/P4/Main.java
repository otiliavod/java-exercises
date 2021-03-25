/* Citim de la tastatura o propozitie. Sa se copieze fiecare cuvand din propozitie
in fisierul text cuvinte.txt, cate un cuvant pe fiecare linie din fisier.*/

package JavaExercises.Lab12.P4;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader bfr = null;
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter("cuvinte.txt");
            bfw = new BufferedWriter(fw);
            bfr = new BufferedReader(new InputStreamReader(System.in));
            String s = bfr.readLine();
            StringTokenizer tk = new StringTokenizer(s);
            int n = tk.countTokens();

            for(int i=0; i<n; i++) {
                String cuvantCrt = tk.nextToken();
                bfw.write(cuvantCrt);
                bfw.newLine();
            }
            fw.close();
            bfw.close();
            bfr.close();
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
