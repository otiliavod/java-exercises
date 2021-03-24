/* Pentru fisierul text scrisoare.txt sa se calculeze si afiseze de cate ori apare
cuvantul "este" in fisier.*/

package JavaExercises.Lab11.PS7;
import java.io.*;
import java.util.StringTokenizer;


public class ContorizareCuvant {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        int contor = 0;

        try {
            fr = new FileReader("scrisoare.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(linie);
                int n = tk.countTokens();
                for(int i=0; i<n; i++) {
                    String cuvant = tk.nextToken();
                    if(cuvant.compareTo("este") == 0) {
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
        System.out.println("Numar aparitii: " + contor);
    }
}
