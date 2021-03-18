//Se citesc trei siruri de la tastatura ce reprezinta ora, minutul si secunda orei curente. Sa se construiasca
//un sir rezultat in care timpul curent este memorat in formatul hh:mm:ss. Sa se afiseze acest sir.

package JavaExercises.Lab6.PS1;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String h, min, sec;
        h = JOptionPane.showInputDialog("Ora: ");
        min = JOptionPane.showInputDialog("Minute: ");
        sec = JOptionPane.showInputDialog("Secunde: ");

        String rezultat = " ";
        rezultat = h + ":" + min + ":" + sec;
        System.out.println("Timpul: " + rezultat);
    }
}
