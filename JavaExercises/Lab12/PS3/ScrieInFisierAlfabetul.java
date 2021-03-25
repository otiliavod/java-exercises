/* Sa se creeze prin program un fisier text ce contine 26 de linii. Fiecare linie
contine toate cele 26 de litere ale alfabetului, dar prima linie incepe cu A,
a doua cu B, etc.*/

package JavaExercises.Lab12.PS3;
import java.io.*;

public class ScrieInFisierAlfabetul {
    public static void main(String[] args) {
        final int N = 26;
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter("alfabet.txt");
            bfw = new BufferedWriter(fw);
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            bfw.write(s);
            bfw.newLine();

            for(int i=1; i<N; i++) {
                String crt = "";
                for(int j=i; j<N; j++) {
                    crt = crt + s.charAt(j);
                }
                for(int j=0; j<i; j++) {
                    crt = crt + s.charAt(j);
                }
                bfw.write(crt);
                bfw.newLine();
            }
            bfw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
