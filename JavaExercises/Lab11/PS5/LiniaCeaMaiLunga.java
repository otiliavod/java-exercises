/* Sa se calculeze si afiseze care este cea mai lunga linie din fisierul text
scrisoare.txt.*/

package JavaExercises.Lab11.PS5;
import java.io.*;

public class LiniaCeaMaiLunga {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        int lMax = 0;
        String linieMax = "";

        try {
            fr = new FileReader("scrisoare.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String s = bfr.readLine();
                if(s == null) {
                    break;
                }
                int l = s.length();
                if(l > lMax) {
                    lMax = l;
                    linieMax = s;
                }
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        System.out.println(linieMax);
    }
}
