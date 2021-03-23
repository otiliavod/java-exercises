/* Se citeste de la tastatura numele unui fisier. Sa se afiseze daca este prezent
caracterul 'a' in fisier.*/

package JavaExercises.Lab11.PS1;
import javax.swing.*;
import java.io.*;

public class F1 {
    public static void main(String[] args) {
        String numeF = JOptionPane.showInputDialog("Nume fisier:");
        FileReader fr = null;
        boolean este_a = false;

        try{
            fr = new FileReader(numeF);
            for(;;) {
                int cod = fr.read();
                if(cod == 1) {
                    break;
                }
                if((char)cod == 'a') {
                    este_a = true;
                    break;
                }
            }
            fr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        if(este_a == true) {
            System.out.println("Este prezent");
        }
        else {
            System.out.println("Nu este prezent");
        }
    }
}
