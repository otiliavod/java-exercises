/* Se da fisierul text noteClasa.txt care contine pe fiecare linie numele complet
al unui elev si nota obtinuta la o lucrare de control. Consideram ca notele pot
fi: 0, 1, 2, ... , 10. Sa se creeze fisierul noteSortateClasa.txt, care se obtine
din fisirul noteClasa.txt prin gruparea elevilor dupa note. O linie din fisierul
noteSortateClasa.txt are aceeasi structura ca o linie din fisierul noteClasa.txt.*/

package JavaExercises.Lab12.PS4;
import java.io.*;
import java.util.*;

public class SortareClasa {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        FileWriter fw = null;
        BufferedWriter bfw = null;
        final int N_VALORI_NOTE = 11;
        String nume[][] = new String[N_VALORI_NOTE][100];
        int contorNota[] = new int[N_VALORI_NOTE];
        int i;
        for(i=0; i<N_VALORI_NOTE; i++) {
            contorNota[i] = 0;
        }

        try {
            fr = new FileReader("noteClasa.txt");
            bfr = new BufferedReader(fr);
            fw = new FileWriter("noteSrotateClasa.txt");
            bfw = new BufferedWriter(fw);

            for(;;) {
                String s = bfr.readLine();
                if(s == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(s);
                int n = tk.countTokens();
                String numeCrt = "";
                for(i=0; i<n; i++) {
                    numeCrt = numeCrt + tk.nextToken();
                }
                int notaCrt = Integer.parseInt(tk.nextToken());
                nume[notaCrt][contorNota[notaCrt]] = numeCrt;
                contorNota[notaCrt] ++;
            }
            int j;
            for(i=0; i<N_VALORI_NOTE; i++) {
                for(j=0; j<contorNota[i]; j++) {
                    bfw.write(nume[i][j] + " " + i);
                    bfw.newLine();
                }
            }
            bfw.close();
            fw.close();
            bfr.close();
            fr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
