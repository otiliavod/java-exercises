/* Definim interfata Forma in care avem doua antete de metode: arieTotala() 
si volum(). Din aceasta interfata sa se implementeze clasa Cub, ce are ca 
variabila de instanta latura cubului.*/

package JavaExercises.Lab9.PS2;

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
