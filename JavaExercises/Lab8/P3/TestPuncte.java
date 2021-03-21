/* Sa se modifice clasa TestPuncte din problema rezolvata nr3 astfel incat se 
va citi de la tastatura un numar N si se vor citi N puncte color in vectorul p[]
si apoi se va afisa daca toate punctele introduse sunt diferite intre ele sau nu.*/

package JavaExercises.Lab8.P3;
import javax.swing.*;

public class TestPuncte {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PunctColor p[] = new PunctColor[N];

        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(JOptionPane.showInputDialog("x: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("y: "));
            String culoare = JOptionPane.showInputDialog("Culoare: ");

            p[i] = new PunctColor(x,y,culoare);
        }

        for(int i=0; i<N; i++) {
            if(p[i].compara(p[i+1]) == true) {
                System.out.println("Toate punctele sunt egale");
            }
            else {
                System.out.println("Nu sunt toate punctele egale");
            }
        }
    }
}
