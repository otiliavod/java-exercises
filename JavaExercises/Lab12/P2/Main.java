/* Se da fisierul text test1.txt. Sa se copieze acest fisier in fisierul test2.txt
convertind toate literele mici in litere mari, restul caracterelor ramanand 
neschimbate. Se va citi fisierul test1.txt linie cu linie.*/

package JavaExercises.Lab12.P2;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader bfr = null;

        try {
            fr = new FileReader("test1.txt");
            bfr = new BufferedReader(fr);
            fw = new FileWriter("test2.txt");
           
            for(;;) {
                String s = bfr.readLine();
                if(s == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(s);
                int n = tk.countTokens();
                for(int i=0; i<n; i++) {
                    char c = s.charAt(i);
                    char cMare = Character.toUpperCase(c);
                    fw.write(cMare);
                }
            }
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        finally {
            fr.close();
            bfr.close();
            fw.close();
        }
    }
}
