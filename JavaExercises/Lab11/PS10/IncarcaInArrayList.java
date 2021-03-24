/* Se da fisierul cuvinte.txt, care contine cate un cuvant pe fiecare linie. Sa
se copieze toate cuvintele intr-o colectie ArrayList si apoi sa se afiseze aceasta
colectie prin parcurgerea ei.*/

package JavaExercises.Lab11.PS10;
import java.io.*;
import java.util.*;

public class IncarcaInArrayList {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        ArrayList<String> al = new ArrayList<>();

        try {
            fr = new FileReader("cuvinte.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String s = bfr.readLine();
                if(s == null) {
                    break;
                }
                al.add(s);
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
