/* Se va realiza o interfata grafica care contine doua componente JTextField, 
cinci componente JLabel, trei butoane JRadioButton si un buton JButton. In
campul de editare numar se va tasta un numar intreg. Din butoanele radio se 
selecteaza cifra ce se va afisa in campul de editare cifre. */

package JavaExercises.Lab13.PS2;

public class ButoaneRadio {
    public static void main(String[] args) {
        Fereastra f = new Fereastra();
        f.pack();
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
    }
}
