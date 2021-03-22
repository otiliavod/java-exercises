package JavaExercises.Lab9.PS4;

public class Dreptunghi implements Forma2D{
    private int l, L;

    public Dreptunghi(int l, int L) {
        this.l = l;
        this.L = L;
    }

    public double arie() {
        return l*l;
    }

    public double perimetru() {
        return 2*l + 2*L;
    }
}
