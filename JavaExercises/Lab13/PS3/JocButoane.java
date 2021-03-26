/* Se va realiza o interfata grafica care contine un numar nB = 25 de butoane
JButton, dispuse tabelar(5 linii si 5 coloane). Butoanele au ca nume scris pe
fiecare, numarul de ordine din tabel(0, 1, 2...,24). Interfata contine si un 
camp de editare JTextField si o eticheta JLabel. La apasarea unui numar oarecare
din tabel se va afisa numarul acestuia in campul de editare.*/

package JavaExercises.Lab13.PS3;

public class JocButoane {
    public static void main(String[] args) {
        int nB = 25;
        Fereastra3 f = new Fereastra3(nB);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
