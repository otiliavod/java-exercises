/* Se citeste de la tastatura un numar natural N. Apoi afiseaza in linie N
butoane denumite 1, 2... La apasarea unui buton se va scrie in campul de 
editare numarul butonului apasat. In interfata se va afisa de asemenea si numarul
N introdus de la tastatura.
Pentru a schimba culoarea butonului apasat se vor folosi instructiunile:
jb.setBackground(Color.BLUE)
jb.setForeground(Color.WHITE)*/

package JavaExercises.Lab13.P2;

public class ButoaneInLinie {
    public static void main(String[] args) {
        FereastraP2 f = new FereastraP2();
        f.pack(); 
        f.setLocationRelativeTo(null); 
        f.setVisible(true); 
    }
}
