package JavaExercises.Lab9.PS3;

public class CercExtins extends Cerc{
    private int x;
    private int y;

    public CercExtins(int r, int x0, int y0) {
        super(r);
        x = x0;
        y = y0;
    }

    public void afisare() {
        System.out.println("Raza: " + this.getRaza());
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
