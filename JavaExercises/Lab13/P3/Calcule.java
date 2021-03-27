/* Se va realiza o interfata grafica care contine doua componente JTextField,
doua componente JLabel, doua butoane JRadioButton si doua butoane JButton. In
primul JTextField se tasteaza un numar intreg. Daca este selectat butonul radio
Divizori, la apasarea butonului Calcule in al doilea camp de editare se vor
afisa toti divizorii numarului. Daca este selectat butonul radio Cifre, la 
apasarea butonului Calcule, in al doilea camp de editare se vor afisa cifrele
numarului, separate printr-un spatiu.*/

package JavaExercises.Lab13.P3;

public class Calcule {
    public static void main(String[] args) {
        FereastraP3 f = new FereastraP3();
        f.pack(); 
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
    }
}
