/* Se citesc de la tastatura sub forma de siruri de caractere doi timpi in formatul hh:mm:ss. Sa se afiseze
care timp este mai mare.*/

package JavaExercises.Lab7.PS3;
import javax.swing.*;
import java.util.*;

public class ComparaTimpi {
    public static void main(String[] args) {
        String timp1 = JOptionPane.showInputDialog("Timp1: ");
        String timp2 = JOptionPane.showInputDialog("Timp2: ");

        StringTokenizer tk = new StringTokenizer(timp1, ":");
        int ore1 = Integer.parseInt(tk.nextToken());
        int min1 = Integer.parseInt(tk.nextToken());
        int sec1 = Integer.parseInt(tk.nextToken());

        int T1 = 3600*ore1 + 60*min1 + sec1;

        tk = new StringTokenizer(timp2, ":");
        int ore2 = Integer.parseInt(tk.nextToken());
        int min2 = Integer.parseInt(tk.nextToken());
        int sec2 = Integer.parseInt(tk.nextToken());

        int T2 = 3600*ore2 + 60*min2 + sec2;

        if(T1 > T2) {
            System.out.println("Timp1 > Timp2");
        }
        else if(T1 == T2) {
            System.out.println("Timp1 = Timp2");
        }
        else {
            System.out.println("Timp1 < Timp2");
        }
    }
}
