package JavaExercises.Lab9.P2;
import javax.swing.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        Punct p[] = new Punct[N];
        int x,y,z;
        String culoare;
        Random r = new Random();

        for(int i=0; i<N; i++) {
            int caz = r.nextInt(2);
            if(caz == 0) {
                x = Integer.parseInt(JOptionPane.showInputDialog("PunctColor x: "));
                y = Integer.parseInt(JOptionPane.showInputDialog("PunctColor y: "));
                culoare = JOptionPane.showInputDialog("PunctColor culoare: ");
                p[i] = new PunctColor(x,y,culoare);
                p[i].afisare();
            }
            else {
                x = Integer.parseInt(JOptionPane.showInputDialog("Punct3D x: "));
                y = Integer.parseInt(JOptionPane.showInputDialog("Punct3D y: "));
                z = Integer.parseInt(JOptionPane.showInputDialog("Punct3D z: "));
                p[i] = new Punct3D(x,y,z);
                p[i].afisare();
            }
        }
    }
}
