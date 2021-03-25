/* Se da fisierul text test1.txt. Sa se copieze acest fisier in fisierul text
test2.txt, convertind literele mari in litere mici, restul caracterelor
ramanand neschimbate.*/

package JavaExercises.Lab12.PS1;
import java.io.*;

public class FisierTextLitereMari {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("test1.txt");
            fw = new FileWriter("test2.txt");

            for(;;) {
                int cod = fr.read();
                if(cod == -1) {
                    break;
                }
                char c = (char)cod;
                char cMare = Character.toUpperCase(c);
                fw.write(cMare);
            }
            fr.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}