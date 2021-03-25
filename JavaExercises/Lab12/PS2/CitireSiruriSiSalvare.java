/* Se citeste de la tastatura un numar natural N. Se citesc apoi N propozitii
de la tastatura. Sa se copieze acestea intr-un fisier text, fiecare propozitie
pe cate o linie. 
Citirea de la tastatura a datelor se va face in modul text folosind metoda 
readLine() din clasa BufferedReader. Obiectul BufferedReader folosit pentru a 
citi siruri de la tastatura se instantiaza astfel:
BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))*/

package JavaExercises.Lab12.PS2;
import java.io.*;

public class CitireSiruriSiSalvare {
    public static void main(String[] args) {
        BufferedReader bfr = null;
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter("propozitii.txt");
            bfw = new BufferedWriter(fw);
            bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("N: ");
            int N = Integer.parseInt(bfr.readLine());

            for(int i=0; i<N; i++) {
                System.out.print("Sir: ");
                String s = bfr.readLine();
                bfw.write(s);
                bfw.newLine();
            }
            bfr.close();
            bfw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
