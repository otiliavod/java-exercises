/* Cream o lista parametrizata de studenti(nume si nota) si afisam in ordinea
crescatoare a notelor.*/

package JavaExercises.Lab10.PS3;
import java.util.*;
import javax.swing.*;

public class Lista_Studenti {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();

        for(;;) {
            String s = JOptionPane.showInputDialog("Nume: ");
            if(s.equals("stop")) {
                break;
            }
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Media: "));
            al.add(new Student(s,nota));
        }

        Collections.sort(al);
        Iterator<Student> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
