package JavaExercises.Lab9.PS4;

public class Patrat implements Forma2D{
    private int l;

    public Patrat(int l) {
        this.l = l;
    }

    public double arie() {
        return l*l;
    }

    public double perimetru() {
        return 4*l;
    }
}
