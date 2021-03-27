/* Sa se scrie o aplicatie in care se afiseaza o fereastra ce contine trei 
componente grafice: JTextArea pentru introducerea unui text pe mai multe linii,
JTextField pentru afisare si un buton JButton care atunci cand este apasat
determina afisarea in componenta JTextField a numarului de linii tastate in
componenta JTextArea.
Pentru a determina numarul de linii tastate in JTextArea se foloseste metoda:
public int getLineCount().*/

package JavaExercises.Lab14.PS1;

public class TestJTextArea {
    public static void main(String[] args){
        FereastraPS1 f = new FereastraPS1();
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
