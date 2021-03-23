package JavaExercises.Lab9.P2;

public class PunctColor extends Punct{
    private String culoare;

    public PunctColor(int x, int y, String culoare) {
        super(x,y);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void afisare() {
        System.out.println("x: " + getX());
        System.out.println("y: " + getY());
        System.out.println("Culoare: " + culoare);
    }
}
