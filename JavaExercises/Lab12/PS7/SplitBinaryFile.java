/* Se da un fisier binar de octeti, date.bin. Sa se copieze acest fisier in
NFIS fisiere binare(NFIS - constanta ce se cunoaste): date1.bin, date2.bin,...,
aceste fisiere contin parti egale din fisierul date.bin(cu eventuala exceptie
a ultimului fisier din cele NFIS).*/

package JavaExercises.Lab12.PS7;
import java.io.*;
import java.util.StringTokenizer;

public class SplitBinaryFile {
    public static void main(String[] args) {
        final int NFIS = 3; // nr de fisiere
        final int DIM = 100; // dimensiune acoperitoare
        final String numeFisier = "date.bin";
        FileInputStream fi = null;
        byte b[] = new byte[DIM];
        int N = 0; // nr de octeti din fisier(initializare)

        try {
            fi = new FileInputStream(numeFisier);

            for(;;) {
                int cod = fi.read();
                if(cod == -1) {
                    break;
                }
                b[N] = (byte)cod;
                N++;
            }
            fi.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        String nume[] = new String[N]; // vector nume de fisiere de iesire
        StringTokenizer tk = new StringTokenizer(numeFisier, ".");
        String numeBaza = tk.nextToken();
        String numeExtensie = tk.nextToken();

        for(int i=0; i<NFIS; i++) {
            nume[i] = numeBaza + (i+1) + "." + numeExtensie;
            for(int j=0; j<NFIS; j++) {
                System.out.println(nume[i]);
            }
        }
        // construirea celor NFIS fisiere:
        FileOutputStream fo = null;
        //nr de octeti ce se copiaza intr-un fisier din cele NFIS:
        int dim = N/NFIS;

        try {
            for(int i=0; i<NFIS; i++) {
                fo = new FileOutputStream(nume[i]);
                //se va copia din vectorul b[]:
                int indexStart = i*dim;
                int indexStop = indexStart + dim;
                if(i == NFIS-1) {
                    indexStop = N;
                }
                for(int j=indexStart; j<indexStop; j++) {
                    fo.write(b[j]);
                }
            }
            fo.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
