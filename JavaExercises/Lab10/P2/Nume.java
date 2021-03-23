/* Se citesc intr-o colectie ArrayList niste nume(pana se tasteaza "stop"). 
Sa se afiseze daca toate numele sunt in ordine alfabetica sau nu.*/

package JavaExercises.Lab10.P2;
import javax.swing.*;
import java.util.*;

public class Nume{
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        List<String> l1 = new ArrayList<>();

        for(;;) {
            String s = JOptionPane.showInputDialog("Nume: ");
            if(s.equals("stop")) {
                break;
            }
            else {
                l.add(s);
                l1.add(s);
            }
        }

        Collections.sort(l);
        if(l.equals(l1)) {
            System.out.println("Sunt in ordine alfabetica");
        }
        else {
            System.out.println("Nu sunt in ordine alfabetica");
        }
    }
}
