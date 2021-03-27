/* Sa se scrie o aplicatie in care se afiseaza o fereastra ce contine trei
componente grafice: JTextField pentru introducerea unui text, JTextField pentru
afisare si JButton pentru iesirea din program. Atunci cand se va apasa ENTER
in primul JTextField, textul introdus acolo va fi copiat in al doilea 
JTextField, cu litere mari.*/

package JavaExercises.Lab14.PS2;

public class CopiereText {
    public static void main(String[] args) {
        FereastraPS2 f = new FereastraPS2();
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
