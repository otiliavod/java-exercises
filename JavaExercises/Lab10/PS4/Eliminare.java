/* Se citesc intr-o colectie niste nume(pana se tasteaza "stop"). Sa se afiseze
doar cele care incep cu litera A. Apoi sa se elimine din colectie cele care incep
cu litera A.*/

package JavaExercises.Lab10.PS4;
import java.util.*;
import javax.swing.*;

public class Eliminare {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        
        for(;;) {
            String s = JOptionPane.showInputDialog("Nume: ");
            if(s.equals("stop")) {
                break;
            }
            else {
                al.add(s);
            }
        }

        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.charAt(0) == 'A') {
                it.remove();
            }
        }

        System.out.println("Au ramas in lista: ");
        it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
