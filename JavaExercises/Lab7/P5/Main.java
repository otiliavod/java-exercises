/* Se citeste de la tastatura, sub forma de string, un sir de numere intregi
separate intre ele prin spatii. Sa se calculeze si afiseze maximul dintre 
aceste numere.*/

package JavaExercises.Lab7.P5;
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       String s = JOptionPane.showInputDialog("Sir: ");
       StringTokenizer tk = new StringTokenizer(s);
       int n = tk.countTokens();

       int max = Integer.parseInt(tk.nextToken());
       for(int i=1; i<n; i++) {
           int nr = Integer.parseInt(tk.nextToken());
           if(nr > max) {
               max = nr;
           }
       }

       System.out.println("Numarul maxim: " + max);
    }
}
