/* Se citeste de la tastatura un sir de caractere. Sa se copieze caracterele sirului intr-o matrice patrata
de dimensiune corespunzator calculata. Daca exista, poziitle neocupate din matrice se vor ocupa cu caracterul
"*". Sa se afiseze matricea.*/

package JavaExercises.Lab6.PS7;
import javax.swing.*;

public class Copiere {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        int L = s.length();
        int N;

        int radical = (int)Math.sqrt(L);
        if(radical * radical == L) {
            N = radical; //L este patrat perfect
        }
        else {
            N = radical + 1;
        }

        char a[][] = new char[N][N];
        int k = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(k >= L) {
                    a[i][j] = '*';
                }
                else {
                    a[i][j] = s.charAt(k);
                }
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
