/* Pentru fisierul text scrisoare.txt sa se calculeze si afiseze cate linii sunt
in fisier si cate linii incep cu caracterul 'A'.*/

package JavaExercises.Lab11.PS4;
import java.io.*;

public class CateLinii {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        int contorLinii = 0;
        int contorLinii_A = 0;

        try{
            fr = new FileReader("scrisoare.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String s = bfr.readLine();
                if(s == null) {
                    break;
                }
                contorLinii ++;

                if(s.charAt(0) == 'A') {
                    contorLinii_A ++;
                }
            }
            bfr.close();
            fr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        System.out.println("Numar linii " + contorLinii);
        System.out.println("Numar linii care incep cu A " + contorLinii_A);
    }
}
