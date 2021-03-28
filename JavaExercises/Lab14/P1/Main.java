import javax.swing.JFrame;

/* Sa se scrie o aplicatie in care se implementeaza un test grila simplu.
Intrebarile testului sunt memorate intr-un fisier text. Fiecare intrebare are
trei variante de raspuns, dintre care doar una este corecta. Atat intrebarea cat
si fiecare varianta de raspuns ocupa un singur rand in fisierul text. Intrebarile
sunt afisate pe rand, impreuna cu variantele de raspuns, in ordinea in care apar
in fisier. Raspunsul dat de utilizator este selectat printr-un buton radio. La
iesirea din aplicatie(cand se apasa butonul Exit) se aseaza intr-o fereastra
numarul de raspunsuri corecte si numarul total de intrebari(se va folosi pentru
afisare metoda statica showMessageDialog din clasa JOptionPane). In fisier, la
fiecare intrebare, pe langa cele trei variante de raspuns si numarul raspunsului
corect la acea intrebare(prima varianta de raspuns are numarul 0). Numarul de
intrebari din fisier este variabil.*/

package JavaExercises.Lab14.P1;

public class Main {
    public static void main(String[] args) {
        Window f = new Window(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}