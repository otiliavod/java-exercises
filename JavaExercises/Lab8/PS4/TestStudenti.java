package JavaExercises.Lab8.PS4;
import javax.swing.*;

public class TestStudenti {
    public static void main(String[] args) {
        final int N = 2;
        Student s[] = new Student[N];

        for(int i=0; i<N; i++) {
            String nume = JOptionPane.showInputDialog("Nume: ");
            String prenume = JOptionPane.showInputDialog("Prenume: ");
            int varsta = Integer.parseInt(JOptionPane.showInputDialog("Varsta: "));
            String facultate = JOptionPane.showInputDialog("Facultate: ");
            int nrMatr = Integer.parseInt(JOptionPane.showInputDialog("Nr Matricol: "));

            s[i] = new Student(nume, prenume, varsta, facultate, nrMatr);
        }

        int contor = 0;
        for(int i=0; i<N; i++) {
            String prenumeCrt = s[i].getPrenume();
            if(prenumeCrt.compareTo("Ion") == 0) {
                contor ++;
            }
        }
        System.out.println(contor);
    }
}
