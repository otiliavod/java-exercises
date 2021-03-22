/* Pentru interfata forma, definita in problema 2, sa se scrie si clasa Paralelipiped
ce imprementeaza aceasta interfata. 
Folosind cele doua clase Cub si Paralelipiped, sa se dezvolte o aplicatie in care
se vor citi datele pentru N obiecte de tipul Forma care se memoreaza intr-un
vector. Citirea unui obiect este data de valoarea 0 sau 1 a unui numar generat
aleator. In final se vor afisa pentru fiecare obiect clasa din care face parte,
aria totala si volumul sau.*/

package JavaExercises.Lab9.P1;

public class Cub implements Forma{
    private double a;

    public Cub(int a) {
        this.a = a;
    }

    public double get() {
        return a;
    }

    public void set(int a) {
        this.a = a;
    }

    public double arieTotala() {
        return 6*a*a;
    }

    public double volum() {
        return a*a*a;
    }
}
