/* Se va realiza o interfata grafica care contine patru componente JTextField,
patru componente JLabel si doua butoane JButton. In fiecare dintre primele trei
campuri de editare se va tasta cate un numar intreg. La apasarea butonului
Calcul, in al patrulea camp JTextField se va afisa maximul dintre cele trei
numere.*/

package JavaExercises.Lab13.PS1;

public class CalculMaxim {
    public static void main(String[] args) {
        Fereastra f = new Fereastra();
        f.pack(); // dimensiuni imagine optima
        f.setLocationRelativeTo(null); // centrare, dar dupa pack
        f.setVisible(true);
    }
}
