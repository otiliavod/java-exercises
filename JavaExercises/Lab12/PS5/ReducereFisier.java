/* Se da un fisier text in care este memorata o imagine binara(alb-negru) ce 
contine N1xN1 pixeli. Valoarea N1 este cunoscuta. Sa se construiasca un alt fisier
text ce contine imaginea anterioara redusa la N2xN2 pixeli(N2 este cunoscut si
este divizor al lui N1). Algortimul de reducere este urmatorul:
- se calculeaza dimensiunea unui bloc, dimBloc = N1/N2 si apoi imaginea initiala
de N1xN1 pixeli se imparte in blocuri diferite de dimBloc linii si dimBloc
coloane. Fiecare bloc va fi redus la un pixel, in matricea redusa(ce va avea
dimensiunea de N2xN2). Valoarea pixelului se calculeaza astfel: este 1 daca
numarul de pixeli de 1 din bloc >= decat numarul de pixeli de 0 din bloc, si 
este 0 in caz contrar.*/

package JavaExercises.Lab12.PS5;
import java.io.*;
import java.util.*;

public class ReducereFisier {
    public static void main(String[] args) {
        final int N1 = 100;
        final int N2 = 10;
        int dimBloc = N1/N2;
        FileReader fr = null;
        BufferedReader bfr = null;
        int a[][] = new int[N1][N1];

        try {
            fr = new FileReader("unu.txt");
            bfr = new BufferedReader(fr);

            for(int i=0; i<N1; i++) {
                String s = bfr.readLine();
                StringTokenizer tk = new StringTokenizer(s);
                for(int j=0; j<N1; j++) {
                    String atomCrt = tk.nextToken();
                    a[i][j] = Integer.parseInt(atomCrt);
                }
            }
            bfr.close();
            fr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        try {
            int b[][] = new int[N2][N2];
            for(int i=0; i<N2; i++) {
                for(int j=0; j<N2; j++) {
                    int contor1 = 0;
                    for(int k=i*dimBloc; k<(i+1)*dimBloc; k++) {
                        for(int l=j*dimBloc; l<(j+1)*dimBloc; l++) {
                            if(a[k][l] == 1) {
                                contor1 ++;
                            }
                        }
                        if(contor1 > dimBloc*dimBloc/2) {
                            b[i][j] = 1;
                        }
                        else {
                            b[i][j] = 0;
                        }
                    }
                }
            }
            FileWriter fw = new FileWriter("doi.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
            for(int i=0; i<N2; i++) {
                String st = "";
                for(int j=0; j<N2; j++) {
                    st = st + b[i][j] + " ";
                    bfw.write(st,0,st.length()-1);
                    bfw.newLine();
                }
            }
            bfw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
