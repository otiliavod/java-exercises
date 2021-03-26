/* Sa se scrie o aplicatie in care se afiseaza o fereastra ce contine patru
componente grafice: JTextField pentru introducerea elementelor unui vector de
numere intregi, JTextFiled pentru afisarea maximului din vector si doua
componente JButton. Atunci cand este apasat primul buton se va afisa maximul
din vectorul introdus. Cand se apasa cel de al doilea, se iese din program.*/

package JavaExercises.Lab13.P1;

public class Array {
    public static void main(String[] args) {
        int N = 3;
        FereastraP1 f = new FereastraP1(N);
        f.pack(); //
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
    }
}
