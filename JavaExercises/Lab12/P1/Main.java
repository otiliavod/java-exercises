/* Citim de la tastatura o linie de text. Sa se copieze caracterele din aceasta
linie in fisierul linie.txt, cate un caracter pe fiecare linie a fisierului text.*/

package JavaExercises.Lab12.P1;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = null;
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter("C:\\Users\\Otii\\Documents"+
            "\\GitHub\\java-exercises\\JavaExercises\\Lab12\\P1\\linie.txt");
            bfw = new BufferedWriter(fw);
            bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Sir: ");
            String s = bfr.readLine();
            bfw.write(s);
            bfw.newLine();
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                bfw.write(c);
                bfw.newLine();
            }
           
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        } 
        finally{
            bfw.close();
            bfr.close();
            fw.close();
        }
       
    }
}
