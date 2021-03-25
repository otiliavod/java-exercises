/* Se citeste de la tastatura un numar natural N. Sa se creeze prin program un
fisier text ce are 10 linii, astfel: in prima linie N valori de 0 separate
intre ele printr-un spatiu, in a doua linie N valori de 1, etc.*/

package JavaExercises.Lab12.P3;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int DIM = 10;
        BufferedReader bfr = null;
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter("cifre.txt");
            bfw = new BufferedWriter(fw);
            bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("N: ");
            int N = Integer.parseInt(bfr.readLine());
            int linie[][] = new int[DIM][N];
            String s = "";

            for(int i=0; i<DIM; i++) {
                 for(int j=0; j<N; j++) {
                    linie[i][j] = i;
                    s = linie[i][j] + " ";
                    bfw.write(s);
                    bfw.newLine();       
                 }
            }
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        finally {
            fw.close();
            bfw.close();
            bfr.close();
        }
    }
}
