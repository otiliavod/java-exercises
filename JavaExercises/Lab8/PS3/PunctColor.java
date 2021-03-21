package JavaExercises.Lab8.PS3;

public class PunctColor extends Punct{
    private String culoare;

    public PunctColor(int x, int y, String culoare) {
        super(x, y);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void afisare() {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
        System.out.println("Culoare: " + culoare);
    }

    public boolean compara(PunctColor p) {
        if((this.getX() == p.getX()) &&
           (this.getY() == p.getY()) &&
           (this.culoare == p.culoare)) {
               return true;
           }
        else {
            return false;
        }
    }
}
