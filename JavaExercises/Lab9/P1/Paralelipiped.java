package JavaExercises.Lab9.P1;

public class Paralelipiped implements Forma{
    private double l;
    private double L; 
    private double h;

    public Paralelipiped(int l, int L, int h) {
        this.l = l;
        this.L = L;
        this.h = h;
    }

    public void set(int l, int L, int h) {
        this.l = l;
        this.L = L;
        this.h = h;
    }

    public double getl() {
        return l;
    }

    public double getL() {
        return L;
    }

    public double geth() {
        return h;
    }

    public double arieTotala() {
        return 2 * (L*h + l*h + L*l);
    }

    public double volum() {
        return L * l * h;
    }
}
