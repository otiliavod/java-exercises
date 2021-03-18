/* Sa se copieze prin program, intr-o matrice patrata de dimensiune 6, toate literele mari ale alfabetului englez.
Pozitiile necompletate din matrice se vor ocupa cu spatii. Sa se afiseze aceasta matrice.*/

package JavaExercises.Lab5.P6;

public class Main {
    public static void main(String[] args) {
        char a[][] = new char[6][6];
        int literaCrt = 65;

        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                a[i][j] = (char)literaCrt;
                literaCrt ++;
                if(literaCrt > 91) {
                    a[i][j] = ' ';
                }
            }
        }
        
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
