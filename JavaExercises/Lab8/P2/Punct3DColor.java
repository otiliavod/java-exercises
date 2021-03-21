package JavaExercises.Lab8.P2;

public class Punct3DColor extends Punct3D{
    private String culoare;

    public Punct3DColor(int x, int y, int z, String culoare) {
        super(x,y,x);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public boolean compara(Punct3DColor p) {
        if((this.getX() == p.getX()) && (this.getY() == p.getY()) && (this.getZ() == p.getZ()) && (this.culoare.compareTo(p.culoare) == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void afisare() {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
        System.out.println("Z: " + getZ());
        System.out.println("Culoare: " + culoare);
    }
}
