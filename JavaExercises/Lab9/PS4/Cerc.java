/* Definim interfata Forma2D in care avem doua antete de metode: arie() si 
perimetru(). Din aceasta interfata sa se implementeze clasa Cerc, ce are ca variabila
de instanta raza cercului, clasa Patrat, ce are ca variabila de instanta latura
patratului si clasa Dreptunghi ce are ca variabile de instanta lungimea si 
latimea dreptunghiului. 
Folosind aceste clase sa se dezvolte o aplicatie in care se vor citi datele pentru
N obiecte de tipul Forma2D, care se memoreaza intr-un vector. Citirea unui obiect
de tipul Cerc, Patrat sau Dreptunghi este data de valoarea 0, 1 sau 2 a unui
numar generat aleator. In final se vor afisa pentru fiecare obiect din cele N
aria si perimetrul sau.*/

package JavaExercises.Lab9.PS4;

public class Cerc implements Forma2D{
    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public double arie() {
        return Math.PI*raza*raza;
    }

    public double perimetru() {
        return 2*Math.PI*raza;
    }
}
