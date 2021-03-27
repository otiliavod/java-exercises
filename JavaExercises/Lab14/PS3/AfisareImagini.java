/* Se va realiza o interfata grafica in care se afiseaza pe rand cate o imagine.
Numele imaginilor de afisat sunt memorate in fisierul text imagini.txt, aflat
in directorul curent, cate un nume pe fiecare linie.
Imaginile sunt obiecte JLabel care au imagini pe ele, adaugate cu metoda
setIcon(). Fisierele imagine se gasesc de asemenea in directorul curent.
Imaginile se afiseaza fie in ordinea din fisierul text, mergand inainte, fie in
ordine inversa, mergand inapoi, modul de afisare fiind comandat prin doua
butoane.*/

package JavaExercises.Lab14.PS3;
import javax.swing.JFrame;

public class AfisareImagini {
    public static void main(String[] args) {
        JFrame f = new FereastraPS3();
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
