/* Pentru fisierul text test.txt sa se afieseze numarul de aparitii pentru fiecare
caracter. Afisarea se va face in ordine crescatoare a numarului de aparitii. Se
considera ca in fisier codurile ASCII ale caracterelor fac parte din intervalul
[0, 127].*/

package JavaExercises.Lab11.PS3;
import java.io.*;

public class NrAparitii {
    public static void main(String[] args) {
        final int NR_CAR = 128;
        int contor[] = new int[NR_CAR];

        for(int i=0; i<NR_CAR; i++) {
            contor[i] = 0;
        }

        FileReader fr = null;

        try {
            fr = new FileReader("test.txt");
            for(;;) {
                int cod = fr.read();
                if(cod == -1) {
                    break;
                }
                contor[cod] ++;
            }
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        char vectorCaractere[] = new char[NR_CAR];
        for(int i=0; i<NR_CAR; i++) {
            vectorCaractere[i] = (char)i;
        }

        for(int i=0; i<NR_CAR; i++) {
            for(int j=i+1; j<NR_CAR; j++) {
                if(contor[i] > contor[j]) {
                    int aux = contor[i];
                    contor[i] = contor[j];
                    contor[j] = aux;
                    char temp = vectorCaractere[i];
                    vectorCaractere[i] = vectorCaractere[j];
                    vectorCaractere[j] = temp;
                }
            }
        }

        for(int i=0; i<NR_CAR; i++) {
            if(contor[i] != 0 ) {
                System.out.println(vectorCaractere[i] + " " + contor[i]);
            }
        }
    }
}
